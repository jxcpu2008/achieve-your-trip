package cn.atrip.app.facade.auth.service;

import java.util.List;

import cn.atrip.app.facade.auth.model.Resource;
import cn.atrip.app.facade.auth.model.ResourceQueryModel;
import cn.atrip.framework.common.facade.BaseQueryFacadeI;

/**
 * 
 * @描述:
 * @作者: Kevin Xie
 * @创建时间: 2016年10月8日
 * @版本: 1.0
 */
public interface ResourceQueryFacadeI extends BaseQueryFacadeI<Resource, ResourceQueryModel> {
	public List<Resource> findAllTreeNode();

	public Resource findResourceByProperties(Resource r);

	public List<Resource> treegrid();

}
