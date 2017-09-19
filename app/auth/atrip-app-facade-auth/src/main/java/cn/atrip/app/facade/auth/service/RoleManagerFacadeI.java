package cn.atrip.app.facade.auth.service;

import cn.atrip.app.facade.auth.model.Role;
import cn.atrip.framework.common.facade.BaseManagerFacadeI;

/**
 * 
 * @描述:
 * @作者: Kevin Xie
 * @创建时间: 2016年10月8日
 * @版本: 1.0
 */
public interface RoleManagerFacadeI extends BaseManagerFacadeI<Role> {
	public int add(Role role) throws Exception;

	public int remove(String id) throws Exception;

	public int edit(Role role) throws Exception;

	public int editMenu(Role role) throws Exception;

	public String getMenuIdsByPrimaryKey(String roleId);
}
