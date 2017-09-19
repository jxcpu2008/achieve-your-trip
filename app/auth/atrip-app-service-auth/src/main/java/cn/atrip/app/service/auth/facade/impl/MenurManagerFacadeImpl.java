package cn.atrip.app.service.auth.facade.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import cn.atrip.app.facade.auth.model.Menu;
import cn.atrip.app.facade.auth.model.MenuQueryModel;
import cn.atrip.app.facade.auth.service.MenuManagerFacadeI;
import cn.atrip.app.service.auth.biz.MenuServiceI;
import cn.atrip.app.service.auth.facade.impl.base.BaseManagerFacade;
import cn.atrip.framework.core.service.BaseServiceI;

/**
 * 
 * @描述:
 * @作者: Kevin Xie
 * @创建时间: 2016年10月10日
 * @版本: 1.0
 */
@Component("menuManagerFacade")
public class MenurManagerFacadeImpl extends BaseManagerFacade<Menu, MenuQueryModel> implements MenuManagerFacadeI {
	@Resource
	private MenuServiceI menuService;

	@Override
	public BaseServiceI<Menu, MenuQueryModel> getService() {
		return menuService;
	}

	@Override
	public int remove(String id) {
		// TODO Auto-generated method stub
		return menuService.remove(id);
	}

	@Override
	public int add(Menu menu) {
		// TODO Auto-generated method stub
		return menuService.add(menu);
	}

	@Override
	public int edit(Menu menu) {
		// TODO Auto-generated method stub
		return menuService.edit(menu);
	}

}
