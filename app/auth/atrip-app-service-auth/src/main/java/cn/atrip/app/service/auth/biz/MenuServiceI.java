package cn.atrip.app.service.auth.biz;

import java.util.List;

import cn.atrip.app.facade.auth.model.Menu;
import cn.atrip.app.facade.auth.model.MenuQueryModel;
import cn.atrip.framework.core.service.BaseServiceI;

/**
 * 
 * @描述:
 * @作者: Kevin Xie
 * @创建时间: 2016年10月10日
 * @版本: 1.0
 */
public interface MenuServiceI extends BaseServiceI<Menu, MenuQueryModel> {

	public Menu findMenuByProperties(Menu m);

	public List<Menu> findAllTreeNode();

	public List<Menu> treegrid();

	public int remove(String id);

	public int add(Menu menu);

	public int edit(Menu menu);

}
