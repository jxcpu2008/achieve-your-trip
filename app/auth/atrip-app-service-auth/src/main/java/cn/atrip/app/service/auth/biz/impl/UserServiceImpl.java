package cn.atrip.app.service.auth.biz.impl;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alibaba.druid.util.StringUtils;

import cn.atrip.app.facade.auth.model.User;
import cn.atrip.app.facade.auth.model.UserQueryModel;
import cn.atrip.app.facade.auth.model.UserRole;
import cn.atrip.app.service.auth.biz.UserServiceI;
import cn.atrip.app.service.auth.dao.UserMapper;
import cn.atrip.app.service.auth.dao.UserRoleMapper;
import cn.atrip.app.service.auth.util.Encryption;
import cn.atrip.framework.common.enumeration.type.UserStatus;
import cn.atrip.framework.common.enumeration.type.UserType;
import cn.atrip.framework.common.exceptions.BizException;
import cn.atrip.framework.common.exceptions.LoginException;
import cn.atrip.framework.common.page.Page;
import cn.atrip.framework.core.dao.BaseDAO;
import cn.atrip.framework.core.service.BaseService;

/**
 * 
 * @描述:
 * @作者: Kevin Xie
 * @创建时间: 2016年10月10日
 * @版本: 1.0
 */
@Service("userService")
public class UserServiceImpl extends BaseService<User, UserQueryModel> implements UserServiceI {
	@Resource
	private UserMapper userMapper;
	@Resource
	private UserRoleMapper userRoleMapper;

	@SuppressWarnings("rawtypes")
	@Override
	public BaseDAO getDao() {
		// TODO Auto-generated method stub
		return userMapper;
	}

	@Override
	public User login(User u) {
		if (StringUtils.isEmpty(u.getLoginName()) || StringUtils.isEmpty(u.getLoginName())) {
			throw LoginException.LOGIN_PARAM_0;
		}
		return userMapper.login(u);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Page findUserAndRoles(UserQueryModel uqm) {
//		int countUsers = userMapper.countUsers(uqm);
//		uqm.getPageModel().setTotal(countUsers);
		List<User> list = userMapper.findUserAndRoles(uqm);
		uqm.getPageModel().setRows(list);
		uqm.getPageModel().setTotal(list.size());
		return uqm.getPageModel();
	}

	@Override
	public int edit(User u) {
		int updateByPrimaryKey = userMapper.updateByPrimaryKeySelective(u);
		if (updateByPrimaryKey == 0) {
			throw BizException.DB_UPDATE_RESULT_0;

		} else {
			userRoleMapper.deleteUserRoleByUserId(u.getId());
			if (u.getRoleIds() != null) {
				for (String roleId : u.getRoleIds().split(",")) {
					UserRole ur = new UserRole();
					ur.setId(UUID.randomUUID().toString());
					ur.setUserId(u.getId());
					ur.setRoleId(roleId);
					int insert = userRoleMapper.insert(ur);
					if (insert == 0)
						throw BizException.DB_INSERT_RESULT_0;
				}
			}
		}
		return updateByPrimaryKey;
	}

	@Override
	public int insertSelective(User record) {
		if (StringUtils.isEmpty(record.getId())) {
			record.setId(UUID.randomUUID().toString());
		}
		record.setCreateTime(new Date());
//		record.setStatus(LoginConstant.NORMAL_USER);
//		record.setType(BaseConstant.NUMBER_ONE);
		
		// 枚举数据库常量示例
		record.setStatus(String.valueOf(UserStatus.NORMAL.state()));
		record.setType(String.valueOf(UserType.USER.type()));
		
//		record.setStatus(UserStatus.NORMAL);
//		record.setType(UserType.USER);
		
		record.setPassword(Encryption.Sha256Hash(record.getPassword()));
		return super.insertSelective(record);
	}

	@Override
	public User findUserByLoginName(String loginName) {
		if (StringUtils.isEmpty(loginName))
			throw LoginException.LOGIN_PARAM_0;
		return userMapper.findUserByLoginName(loginName);
	}
}