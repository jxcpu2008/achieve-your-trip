package cn.atrip.app.web.auth.controller;

import java.util.List;

import cn.atrip.app.facade.auth.model.Menu;
import cn.atrip.framework.common.model.Json;

/**
 * 
 * @描述:
 * @作者: Kevin Xie
 * @创建时间: 2016年10月10日
 * @版本: 1.0
 */
public interface MenuControllerI {

	public List<Menu> findAllTreeNode();

	public List<Menu> treegrid();

	public Json remove(String id);

	public Json add(Menu menu);

	public Json edit(Menu menu);
}