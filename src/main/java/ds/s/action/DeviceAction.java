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
 * Create at:	2013年11月24日 下午6:00:48  
 *  
 * 修改历史:
 * 日期    作者    版本  修改描述
 * ------------------------------------------------------------------
 * 
 * </pre>
 */
public class DeviceAction extends BaseAction {

	private static final long serialVersionUID = 770132532073649341L;

	DeviceService deviceService;

	/** 添加设备 */
	public String add() {
		return SUCCESS;
	}
}
