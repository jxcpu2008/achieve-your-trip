package cn.atrip.app.service.auth.facade.impl;

import org.springframework.stereotype.Component;

import cn.atrip.app.facade.auth.model.Resource;
import cn.atrip.app.facade.auth.model.ResourceQueryModel;
import cn.atrip.app.facade.auth.service.ResourceManagerFacadeI;
import cn.atrip.app.service.auth.biz.ResourceServiceI;
import cn.atrip.app.service.auth.facade.impl.base.BaseManagerFacade;
import cn.atrip.framework.core.service.BaseServiceI;

/**
 * 
 * @描述:
 * @作者: Kevin Xie
 * @创建时间: 2016年10月10日
 * @版本: 1.0
 */
@Component("resourceManagerFacade")
public class ResourceManagerFacadeImpl extends BaseManagerFacade<Resource, ResourceQueryModel>
		implements ResourceManagerFacadeI {
	@javax.annotation.Resource
	private ResourceServiceI resourceService;

	@Override
	public BaseServiceI<Resource, ResourceQueryModel> getService() {
		return resourceService;
	}

	@Override
	public int remove(String id) {
		// TODO Auto-generated method stub
		return resourceService.remove(id);
	}

	@Override
	public int add(Resource r) {
		// TODO Auto-generated method stub
		return resourceService.add(r);
	}

	@Override
	public int edit(Resource r) {
		// TODO Auto-generated method stub
		return resourceService.edit(r);
	}

}
