package ds.s.service;

import ds.s.model.Share;

/**
 * 
 * <pre>
 * Description
 * Copyright:	Copyright (c)2013  
 * Company:		DENDNIGHT
 * Author:		dendnight
 * Version:		1.0  
 * Create at:	2013��11��25�� ����9:34:54  
 *  
 * �޸���ʷ:
 * ����    ����    �汾  �޸�����
 * ------------------------------------------------------------------
 * 
 * </pre>
 */
public interface ShareService {

	/**
	 * ��ӷ���
	 * 
	 * @param share
	 */
	void add(Share share);

	/**
	 * 
	 */
	void list();
}
