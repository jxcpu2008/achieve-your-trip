package cn.atrip.app.service.auth.facade.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import cn.atrip.app.facade.auth.model.Role;
import cn.atrip.app.facade.auth.model.RoleQueryModel;
import cn.atrip.app.facade.auth.service.RoleQueryFacadeI;
import cn.atrip.app.service.auth.biz.RoleServiceI;
import cn.atrip.app.service.auth.facade.impl.base.BaseQueryFacade;
import cn.atrip.framework.common.page.Page;
import cn.atrip.framework.core.service.BaseServiceI;

/**
 * 
 * @描述: 
 * @作者: Kevin Xie
 * @创建时间: 2016年10月10日
 * @版本: 1.0
 */
@Component("roleQueryFacade")
public class RoleQueryFacadeImpl extends BaseQueryFacade<Role, RoleQueryModel> implements RoleQueryFacadeI {

	@Resource
	private RoleServiceI roleService;

	public BaseServiceI<Role, RoleQueryModel> getService() {
		return roleService;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Page findRoleResources(RoleQueryModel role) throws Exception {
		// TODO Auto-generated method stub
		return roleService.findRoleAndResources(role);
	}

}
