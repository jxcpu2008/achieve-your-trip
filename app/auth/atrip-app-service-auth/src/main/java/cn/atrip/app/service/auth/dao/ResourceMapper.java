package cn.atrip.app.service.auth.dao;

import cn.atrip.app.facade.auth.model.Resource;
import cn.atrip.app.facade.auth.model.ResourceQueryModel;
import cn.atrip.framework.core.dao.BaseDAO;

/**
 * 
 * @描述:
 * @作者: Kevin Xie
 * @创建时间: 2016年10月10日
 * @版本: 1.0
 */
public interface ResourceMapper extends BaseDAO<Resource, ResourceQueryModel> {
	public Resource findResourceByProperties(Resource r);

	public int remove(String id);

	public int updatePidByPid(String id);
}