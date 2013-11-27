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
 * Create at:	2013年11月28日 上午12:23:09  
 *  
 * 修改历史:
 * 日期    作者    版本  修改描述
 * ------------------------------------------------------------------
 * 
 * </pre>
 */
public interface ShareService {

	/**
	 * 添加分享
	 * 
	 * @param share
	 */
	void add(Share share);

	/**
	 * 
	 */
	void list();
}
