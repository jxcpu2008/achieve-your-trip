package cn.atrip.app.service.auth.biz;

import cn.atrip.app.facade.auth.model.User;
import cn.atrip.app.facade.auth.model.UserQueryModel;
import cn.atrip.framework.common.page.Page;
import cn.atrip.framework.core.service.BaseServiceI;

/**
 * 
 * @描述:
 * @作者: Kevin Xie
 * @创建时间: 2016年10月10日
 * @版本: 1.0
 */
public interface UserServiceI extends BaseServiceI<User, UserQueryModel> {
	public User login(User u);

	public User findUserByLoginName(String loginName);

	@SuppressWarnings("rawtypes")
	// 加上如下注解则会在执行该方法之前切换指定的数据源
//	@DataSource("option")
	public Page findUserAndRoles(UserQueryModel uqm);

	public int edit(User user);

}
