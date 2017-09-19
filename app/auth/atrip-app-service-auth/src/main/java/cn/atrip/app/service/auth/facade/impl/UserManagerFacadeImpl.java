package cn.atrip.app.service.auth.facade.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import cn.atrip.app.facade.auth.model.User;
import cn.atrip.app.facade.auth.model.UserQueryModel;
import cn.atrip.app.facade.auth.service.UserManagerFacadeI;
import cn.atrip.app.service.auth.biz.UserServiceI;
import cn.atrip.app.service.auth.facade.impl.base.BaseManagerFacade;
import cn.atrip.framework.core.service.BaseServiceI;

/**
 * 
 * @描述:
 * @作者: Kevin Xie
 * @创建时间: 2016年10月10日
 * @版本: 1.0
 */
@Component("userManagerFacade")
public class UserManagerFacadeImpl extends BaseManagerFacade<User, UserQueryModel> implements UserManagerFacadeI {
	@Resource
	private UserServiceI userService;

	@Override
	public BaseServiceI<User, UserQueryModel> getService() {
		return userService;
	}

	public int edit(User user) {
		return userService.edit(user);
	}

}
