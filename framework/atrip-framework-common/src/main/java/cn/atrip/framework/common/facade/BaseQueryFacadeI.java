package cn.atrip.framework.common.facade;

import cn.atrip.framework.common.model.BaseModel;
import cn.atrip.framework.common.page.Page;

/**
 * 
 * @描述:
 * @作者: Kevin Xie
 * @创建时间: 2016年10月10日
 * @版本: 1.0
 */
public interface BaseQueryFacadeI<M, QM extends BaseModel> {
	public M selectByPrimaryKey(String id);

	@SuppressWarnings("rawtypes")
	public Page findObjectsByPage(QM record);
}
