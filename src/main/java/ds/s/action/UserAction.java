package ds.s.action;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
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
 * Create at:	2013年11月26日 下午10:47:12  
 *  
 * 修改历史:
 * 日期    作者    版本  修改描述
 * ------------------------------------------------------------------
 * 
 * </pre>
 */
@Controller
@Scope("prototype")
public class UserAction extends BaseAction {

	private static final long serialVersionUID = 3366042020883398098L;

	@Resource
	private UserService userService;

	private String imei;

	private String nickname;

	public String login() {
		if (StringUtils.isEmpty(imei)) {
			return ERROR;
		}

		User user = userService.login(imei);

		if (null == user) {
			return OTHER;
		}

		session.put("USERINFO", user);

		return SUCCESS;
	}

	public String register() {

		return SUCCESS;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

}
