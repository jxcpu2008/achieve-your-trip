package cn.atrip.app.service.auth.biz.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import cn.atrip.app.facade.auth.model.Menu;
import cn.atrip.app.facade.auth.model.MenuQueryModel;
import cn.atrip.app.service.auth.biz.MenuServiceI;
import cn.atrip.app.service.auth.dao.MenuMapper;
import cn.atrip.framework.core.dao.BaseDAO;
import cn.atrip.framework.core.service.BaseService;

/**
 * 
 * @描述:
 * @作者: Kevin Xie
 * @创建时间: 2016年10月10日
 * @版本: 1.0
 */
@Service("menuService")
public class MenuServiceImpl extends BaseService<Menu, MenuQueryModel> implements MenuServiceI {
	@Resource
	private MenuMapper menuMapper;

	@SuppressWarnings("rawtypes")
	@Override
	public BaseDAO getDao() {
		// TODO Auto-generated method stub
		return menuMapper;
	}

	@Override
	public Menu findMenuByProperties(Menu m) {
		return menuMapper.findMenuByProperties(m);
	}

	@Override
	public List<Menu> findAllTreeNode() {

		MenuQueryModel qm = new MenuQueryModel();
		qm.setRows(10000);
		List<Menu> l = menuMapper.findObjectsByPage(qm);
		if (l != null && l.size() > 0) {
			for (Menu m : l) {
				Map<String, Object> attributes = new HashMap<String, Object>();
				attributes.put("url", m.getUrl());
				m.setAttributes(attributes);
				getPMenu(m);
			}
		}
		return l;
	}

	private void getPMenu(Menu m) {
		if (!StringUtils.isEmpty(m.getPid())) {
			Menu pm = menuMapper.selectByPrimaryKey(m.getPid());// 获得当前节点的父节点对象
			if (pm != null) {
				m.setPid(pm.getId());
				m.setPname(pm.getText());
			}
		}
	}

	@Override
	public List<Menu> treegrid() {

		MenuQueryModel qm = new MenuQueryModel();
		qm.setRows(10000);
		List<Menu> l = menuMapper.findObjectsByPage(qm);
		if (l != null && l.size() > 0) {
			for (Menu m : l) {
				getPMenu(m);
			}
		}
		return l;
	}

	@Override
	public int remove(String id) {
		if (!StringUtils.isEmpty(id))
			return menuMapper.remove(id);
		return 0;

	}

	@Override
	public int add(Menu menu) {
		if (StringUtils.isEmpty(menu.getId())) {
			menu.setId(UUID.randomUUID().toString());
		}
		return menuMapper.insertSelective(menu);
	}

	@Override
	public int edit(Menu menu) {
		if (StringUtils.isEmpty(menu.getId()))
			return 0;
		return menuMapper.updateByPrimaryKeySelective(menu);
	}

}
