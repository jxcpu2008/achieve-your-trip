package cn.atrip.app.facade.auth.service;

import java.util.List;

import cn.atrip.app.facade.auth.model.Menu;
import cn.atrip.app.facade.auth.model.MenuQueryModel;
import cn.atrip.framework.common.facade.BaseQueryFacadeI;

/**
 * 
 * @描述:
 * @作者: Kevin Xie
 * @创建时间: 2016年10月8日
 * @版本: 1.0
 */
public interface MenuQueryFacadeI extends BaseQueryFacadeI<Menu, MenuQueryModel> {

	public List<Menu> findAllTreeNode();

	public Menu findMenuByProperties(Menu m);

	public List<Menu> treegrid();

}
