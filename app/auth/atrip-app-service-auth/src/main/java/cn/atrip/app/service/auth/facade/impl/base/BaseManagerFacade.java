package cn.atrip.app.service.auth.facade.impl.base;

import cn.atrip.framework.common.facade.BaseManagerFacadeI;
import cn.atrip.framework.common.model.BaseModel;
import cn.atrip.framework.core.service.BaseServiceI;

/**
 * 
 * @描述:
 * @作者: Kevin Xie
 * @创建时间: 2016年10月10日
 * @版本: 1.0
 */
public abstract class BaseManagerFacade<M, QM extends BaseModel> implements BaseManagerFacadeI<M> {
	public abstract BaseServiceI<M, QM> getService();

	public int deleteByPrimaryKey(String id) {
		return getService().deleteByPrimaryKey(id);
	}

	public int insert(M record) {
		return getService().insert(record);
	}

	public int insertSelective(M record) {
		return getService().insertSelective(record);
	}

	public int updateByPrimaryKeySelective(M record) {
		return getService().updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(M record) {
		return getService().updateByPrimaryKey(record);
	}

}
