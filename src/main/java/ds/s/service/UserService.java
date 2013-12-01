package ds.s.service;

import ds.s.aaaaa.LoginInfo;
import ds.s.exception.MsgException;
import ds.s.model.User;

/**
 * 用户信息
 * 
 * <pre>
 * Description
 * Copyright:	Copyright (c)2013  
 * Company:		DENDNIGHT
 * Author:		dendnight
 * Version:		1.0  
 * Create at:	2013年11月29日 下午8:51:23  
 *  
 * 修改历史:
 * 日期    作者    版本  修改描述
 * ------------------------------------------------------------------
 * 
 * </pre>
 */
public interface UserService {

	/**
	 * 添加用户信息
	 * 
	 * @param user
	 * @return 用户ID
	 * @throws Exception
	 */
	int add(User user) throws Exception;

	/**
	 * 修改用户信息
	 * 
	 * @param user
	 * @throws Exception
	 */
	void update(LoginInfo info, User user) throws Exception;

	/**
	 * 查询用户信息
	 * 
	 * @param users
	 * @return
	 */
	User findUsers(User user);

	/**
	 * 逻辑删除用户
	 * 
	 * @param imei
	 * @param nickname
	 * @throws MsgException
	 */
	void delete(LoginInfo info, int id) throws MsgException;;

	/**
	 * 查找用户昵称
	 * 
	 * @param nickname
	 * @return 存在返回true
	 */
	boolean findNickname(String nickname);

	/**
	 * 查找用户昵称
	 * 
	 * @param nickname
	 * @return 存在返回true
	 */
	boolean findUsername(String username);

}
