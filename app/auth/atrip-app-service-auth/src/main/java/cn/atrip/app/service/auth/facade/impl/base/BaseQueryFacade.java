package cn.atrip.app.service.auth.facade.impl.base;

import cn.atrip.framework.common.facade.BaseQueryFacadeI;
import cn.atrip.framework.common.model.BaseModel;
import cn.atrip.framework.common.page.Page;
import cn.atrip.framework.core.service.BaseServiceI;

/**
 * 
 * @描述:
 * @作者: Kevin Xie
 * @创建时间: 2016年10月10日
 * @版本: 1.0
 */
public abstract class BaseQueryFacade<M, QM extends BaseModel> implements BaseQueryFacadeI<M, QM> {
	public abstract BaseServiceI<M, QM> getService();

	public M selectByPrimaryKey(String id) {
		return getService().selectByPrimaryKey(id);
	}

	@SuppressWarnings("rawtypes")
	public Page findObjectsByPage(QM record) {
		return getService().findObjectsByPage(record);
	}

}
