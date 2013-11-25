package ds.s.service;

import ds.s.model.User;

/**
 * 
 * <pre>
 * Description
 * Copyright:	Copyright (c)2013  
 * Company:		DENDNIGHT
 * Author:		dendnight
 * Version:		1.0  
 * Create at:	2013年11月25日 下午9:31:14  
 *  
 * 修改历史:
 * 日期    作者    版本  修改描述
 * ------------------------------------------------------------------
 * 
 * </pre>
 */
public interface UserService {

	/**
	 * 登录验证设备,null则创建用户
	 * 
	 * @param imei
	 * @return
	 */
	User login(String imei);

	/**
	 * 注册
	 * 
	 * @param imei
	 * @param nickname
	 */
	User sign(String imei, String nickname);

}
