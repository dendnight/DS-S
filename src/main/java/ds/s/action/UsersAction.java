package ds.s.action;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import ds.s.aaaaa.BaseAction;
import ds.s.model.User;
import ds.s.service.UserService;

/**
 * 
 * <pre>
 * Description
 * Copyright:	Copyright (c)2013  
 * Company:		DENDNIGHT
 * Author:		dendnight
 * Version:		1.0  
 * Create at:	2013年11月28日 上午12:21:21  
 *  
 * 修改历史:
 * 日期    作者    版本  修改描述
 * ------------------------------------------------------------------
 * 
 * </pre>
 */
@Controller("UsersAction")
@Scope("prototype")
public class UsersAction extends BaseAction {

	private static final long serialVersionUID = 3366042020883398098L;

	@Resource
	private UserService usersService;

	/** 用户对象 */
	private User user;

	/** json */
	private Map<String, Object> json;

	public String login() {

		return SUCCESS;
	}

	public String register() {
		json = new HashMap<String, Object>();

		session.put("USERINFO", user);
		return SUCCESS;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Map<String, Object> getJson() {
		return json;
	}

}
