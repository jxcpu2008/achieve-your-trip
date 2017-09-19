package cn.atrip.app.facade.auth.service;

import cn.atrip.app.facade.auth.model.Role;
import cn.atrip.app.facade.auth.model.RoleQueryModel;
import cn.atrip.framework.common.facade.BaseQueryFacadeI;
import cn.atrip.framework.common.page.Page;

/**
 * 
 * @描述:
 * @作者: Kevin Xie
 * @创建时间: 2016年10月8日
 * @版本: 1.0
 */
public interface RoleQueryFacadeI extends BaseQueryFacadeI<Role, RoleQueryModel> {

	@SuppressWarnings("rawtypes")
	public Page findRoleResources(RoleQueryModel role) throws Exception;

}
