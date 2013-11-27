package ds.s.service;

import ds.s.exception.MsgException;
import ds.s.model.User;

/**
 * 
 * <pre>
 * Description
 * Copyright:	Copyright (c)2013  
 * Company:		DENDNIGHT
 * Author:		dendnight
 * Version:		1.0  
 * Create at:	2013��11��25�� ����9:31:14  
 *  
 * �޸���ʷ:
 * ����    ����    �汾  �޸�����
 * ------------------------------------------------------------------
 * 
 * </pre>
 */
public interface UserService {

	/**
	 * ��¼
	 * 
	 * @param imei
	 * @return
	 */
	User login(String imei);

	/**
	 * ע��
	 * 
	 * @param imei
	 * @param nickname
	 * @throws MsgException
	 */
	User register(String imei, String nickname) throws MsgException;

	/**
	 * ��֤�ǳƴ��ڷ���false
	 * 
	 * @param nickname
	 * @return
	 */
	boolean checkNickname(String nickname);

	/**
	 * �޸��ǳ�
	 * 
	 * @param imei
	 * @param nickname
	 * @throws MsgException
	 */
	void renickname(String imei, String nickname) throws MsgException;
}
