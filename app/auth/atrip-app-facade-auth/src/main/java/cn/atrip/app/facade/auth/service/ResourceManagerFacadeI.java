package cn.atrip.app.facade.auth.service;

import cn.atrip.app.facade.auth.model.Resource;
import cn.atrip.framework.common.facade.BaseManagerFacadeI;

/**
 * 
 * @描述:
 * @作者: Kevin Xie
 * @创建时间: 2016年10月8日
 * @版本: 1.0
 */
public interface ResourceManagerFacadeI extends BaseManagerFacadeI<Resource> {
	public int remove(String id);

	public int add(Resource r);

	public int edit(Resource r);
}
