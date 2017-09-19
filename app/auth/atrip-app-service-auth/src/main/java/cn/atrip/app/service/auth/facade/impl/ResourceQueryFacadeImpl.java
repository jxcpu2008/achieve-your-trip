package cn.atrip.app.service.auth.facade.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import cn.atrip.app.facade.auth.model.Resource;
import cn.atrip.app.facade.auth.model.ResourceQueryModel;
import cn.atrip.app.facade.auth.service.ResourceQueryFacadeI;
import cn.atrip.app.service.auth.biz.ResourceServiceI;
import cn.atrip.app.service.auth.facade.impl.base.BaseQueryFacade;
import cn.atrip.framework.core.service.BaseServiceI;

/**
 * 
 * @描述:
 * @作者: Kevin Xie
 * @创建时间: 2016年10月10日
 * @版本: 1.0
 */
@Component("resourceQueryFacade")
public class ResourceQueryFacadeImpl extends BaseQueryFacade<Resource, ResourceQueryModel>
		implements ResourceQueryFacadeI {

	@javax.annotation.Resource
	private ResourceServiceI resourceService;

	public BaseServiceI<Resource, ResourceQueryModel> getService() {
		return resourceService;
	}

	@Override
	public List<Resource> findAllTreeNode() {
		// TODO Auto-generated method stub
		return resourceService.findAllTreeNode();
	}

	@Override
	public Resource findResourceByProperties(Resource r) {
		// TODO Auto-generated method stub
		return resourceService.findResourceByProperties(r);
	}

	@Override
	public List<Resource> treegrid() {
		// TODO Auto-generated method stub
		return resourceService.treegrid();
	}

}
