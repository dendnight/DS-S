package ds.s.action;

import ds.s.aaaaa.BaseAction;
import ds.s.service.DeviceService;

/**
 * 
 * <pre>
 * Description
 * Copyright:	Copyright (c)2013  
 * Company:		DENDNIGHT
 * Author:		dendnight
 * Version:		1.0  
 * Create at:	2013��11��24�� ����6:00:48  
 *  
 * �޸���ʷ:
 * ����    ����    �汾  �޸�����
 * ------------------------------------------------------------------
 * 
 * </pre>
 */
public class DeviceAction extends BaseAction {

	private static final long serialVersionUID = 770132532073649341L;

	DeviceService deviceService;

	/** ����豸 */
	public String add() {
		return SUCCESS;
	}
}
