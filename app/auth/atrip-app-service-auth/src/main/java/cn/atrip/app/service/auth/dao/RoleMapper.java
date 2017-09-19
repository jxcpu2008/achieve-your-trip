package cn.atrip.app.service.auth.dao;

import java.util.List;

import cn.atrip.app.facade.auth.model.Role;
import cn.atrip.app.facade.auth.model.RoleQueryModel;
import cn.atrip.framework.core.dao.BaseDAO;

/**
 * 
 * @描述: 
 * @作者: Kevin Xie
 * @创建时间: 2016年10月10日
 * @版本: 1.0
 */
public interface RoleMapper extends BaseDAO<Role, RoleQueryModel> {
	public int add(Role role);

	public int remove(Role role);

	public int edit(Role role);

	public List<Role> findRoleAndResources(RoleQueryModel role);

	public int countRoles(RoleQueryModel role);

}