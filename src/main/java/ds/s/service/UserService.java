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
	 * ��¼��֤�豸,null�򴴽��û�
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
	 */
	User sign(String imei, String nickname);

}
