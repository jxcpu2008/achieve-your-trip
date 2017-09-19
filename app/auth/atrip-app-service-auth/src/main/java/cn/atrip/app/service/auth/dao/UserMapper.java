package cn.atrip.app.service.auth.dao;

import java.util.List;

import cn.atrip.app.facade.auth.model.User;
import cn.atrip.app.facade.auth.model.UserQueryModel;
import cn.atrip.framework.core.dao.BaseDAO;

/**
 * 
 * @描述: 
 * @作者: Kevin Xie
 * @创建时间: 2016年10月10日
 * @版本: 1.0
 */
public interface UserMapper extends BaseDAO<User, UserQueryModel> {
	public User login(User u);

	public User findUserByLoginName(String loginName);

	public List<User> findUserAndRoles(UserQueryModel uqm);

	public int countUsers(UserQueryModel uqm);

}