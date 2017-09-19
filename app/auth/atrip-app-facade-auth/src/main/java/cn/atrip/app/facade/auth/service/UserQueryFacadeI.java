package cn.atrip.app.facade.auth.service;

import cn.atrip.app.facade.auth.model.User;
import cn.atrip.app.facade.auth.model.UserQueryModel;
import cn.atrip.framework.common.exceptions.LoginException;
import cn.atrip.framework.common.facade.BaseQueryFacadeI;
import cn.atrip.framework.common.page.Page;

/**
 * 
 * @描述:
 * @作者: Kevin Xie
 * @创建时间: 2016年10月8日
 * @版本: 1.0
 */
public interface UserQueryFacadeI extends BaseQueryFacadeI<User, UserQueryModel> {

	public User login(User u) throws LoginException;

	public User findUserByLoginName(String loginName) throws LoginException;

	@SuppressWarnings("rawtypes")
	public Page findUserAndRoles(UserQueryModel uqm) throws LoginException;;

}
