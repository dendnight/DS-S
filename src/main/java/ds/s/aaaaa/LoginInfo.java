package ds.s.aaaaa;

/**
 * 登录信息
 * 
 * <pre>
 * Description
 * Copyright:	Copyright (c)2013  
 * Company:		DENDNIGHT
 * Author:		dendnight
 * Version:		1.0  
 * Create at:	2013年12月1日 下午3:01:56  
 *  
 * 修改历史:
 * 日期    作者    版本  修改描述
 * ------------------------------------------------------------------
 * 
 * </pre>
 */
public class LoginInfo {

	private Integer id;

	private String imei;

	private String nickname;

	private String username;

	private String password;

	public Integer getId() {
		return id;
	}

	public String getImei() {
		return imei;
	}

	public String getNickname() {
		return nickname;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	@Override
	public String toString() {
		return "LoginInfo [id=" + id + ", imei=" + imei + ", nickname=" + nickname + ", username=" + username
				+ ", password=" + password + "]";
	}

}
