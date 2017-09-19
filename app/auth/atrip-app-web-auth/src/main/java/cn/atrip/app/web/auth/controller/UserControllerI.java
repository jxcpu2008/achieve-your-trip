package cn.atrip.app.web.auth.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.ModelAndView;

import cn.atrip.app.facade.auth.model.User;
import cn.atrip.app.facade.auth.model.UserQueryModel;
import cn.atrip.framework.common.model.Json;
import cn.atrip.framework.common.page.Page;

/**
 * 
 * @描述:
 * @作者: Kevin Xie
 * @创建时间: 2016年10月10日
 * @版本: 1.0
 */
public interface UserControllerI {

	public String showUser(String id, HttpServletRequest request) throws Exception;

	public Page findUserAndRolesByPage(UserQueryModel uqm) throws Exception;

	public Json edit(User user) throws Exception;
	
	public ModelAndView listUser(UserQueryModel uqm) throws Exception;
}
