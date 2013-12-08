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
@Controller("UserAction")
@Scope("prototype")
public class UserAction extends BaseAction {

	private static final long serialVersionUID = 3366042020883398098L;

	@Resource
	private UserService userService;

	/** 用户对象 */
	private User user;

	/** json */
	private Map<String, Object> json;

	public String login() {

		User u = null;
		try {
			u = userService.findUser(user);
		} catch (Exception e) {
			this.addActionMessage(e.getMessage());
			return ERROR;
		}
		if (null == u) {
			this.addActionMessage("用户名或密码错误");
			return ERROR;
		}

		session.put(LOGININFO, u);
		return SUCCESS;
	}

	public String register() {
		json = new HashMap<String, Object>();
		try {
			userService.add(user);
		} catch (Exception e) {
			this.addActionMessage(e.getMessage());
			return ERROR;
		}
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
