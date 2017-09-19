package cn.atrip.app.service.auth.biz;

import java.util.List;

import cn.atrip.app.facade.auth.model.Resource;
import cn.atrip.app.facade.auth.model.ResourceQueryModel;
import cn.atrip.framework.core.service.BaseServiceI;

/**
 * 
 * @描述:
 * @作者: Kevin Xie
 * @创建时间: 2016年10月10日
 * @版本: 1.0
 */
public interface ResourceServiceI extends BaseServiceI<Resource, ResourceQueryModel> {
	public Resource findResourceByProperties(Resource r);

	public List<Resource> findAllTreeNode();

	public List<Resource> treegrid();

	public int remove(String id);

	public int add(Resource r);

	public int edit(Resource r);

}
