package cn.atrip.app.service.auth.facade.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import cn.atrip.app.facade.auth.model.User;
import cn.atrip.app.facade.auth.model.UserQueryModel;
import cn.atrip.app.facade.auth.service.UserQueryFacadeI;
import cn.atrip.app.service.auth.biz.UserServiceI;
import cn.atrip.app.service.auth.facade.impl.base.BaseQueryFacade;
import cn.atrip.framework.common.exceptions.LoginException;
import cn.atrip.framework.common.page.Page;
import cn.atrip.framework.core.service.BaseServiceI;

/**
 * 
 * @描述:
 * @作者: Kevin Xie
 * @创建时间: 2016年10月10日
 * @版本: 1.0
 */
@Component("userQueryFacade")
public class UserQueryFacadeImpl extends BaseQueryFacade<User, UserQueryModel> implements UserQueryFacadeI {

	@Resource
	private UserServiceI userService;

	public BaseServiceI<User, UserQueryModel> getService() {
		return userService;
	}

	@Override
	public User login(User u) {
		return userService.login(u);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Page findUserAndRoles(UserQueryModel uqm) throws LoginException {
		return userService.findUserAndRoles(uqm);
	}

	@Override
	public User findUserByLoginName(String loginName) throws LoginException {

		return userService.findUserByLoginName(loginName);
	}

}
