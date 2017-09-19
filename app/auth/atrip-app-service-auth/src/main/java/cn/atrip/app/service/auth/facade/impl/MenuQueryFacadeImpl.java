package cn.atrip.app.service.auth.facade.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import cn.atrip.app.facade.auth.model.Menu;
import cn.atrip.app.facade.auth.service.MenuQueryFacadeI;
import cn.atrip.app.facade.auth.model.MenuQueryModel;
import cn.atrip.app.service.auth.biz.MenuServiceI;
import cn.atrip.app.service.auth.facade.impl.base.BaseQueryFacade;
import cn.atrip.framework.core.service.BaseServiceI;

/**
 * 
 * @鎻忚堪:
 * @浣滆��: Kevin Xie
 * @鍒涘缓鏃堕棿: 2016骞�10鏈�10鏃�
 * @鐗堟湰: 1.0
 */
@Component("menuQueryFacade")
public class MenuQueryFacadeImpl extends BaseQueryFacade<Menu, MenuQueryModel> implements MenuQueryFacadeI {

	@Resource
	private MenuServiceI menuService;

	public BaseServiceI<Menu, MenuQueryModel> getService() {
		return menuService;
	}

	@Override
	public List<Menu> findAllTreeNode() {
		// TODO Auto-generated method stub
		return menuService.findAllTreeNode();
	}

	@Override
	public Menu findMenuByProperties(Menu m) {
		// TODO Auto-generated method stub
		return menuService.findMenuByProperties(m);
	}

	@Override
	public List<Menu> treegrid() {
		// TODO Auto-generated method stub
		return menuService.treegrid();
	}

}
