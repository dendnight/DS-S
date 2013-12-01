package ds.s.aaaaa;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 
 * <pre>
 * Description
 * Copyright:	Copyright (c)2013  
 * Company:		DENDNIGHT
 * Author:		dendnight
 * Version:		1.0  
 * Create at:	2013年11月28日 上午12:21:51  
 *  
 * 修改历史:
 * 日期    作者    版本  修改描述
 * ------------------------------------------------------------------
 * 
 * </pre>
 */
public class BaseAction extends ActionSupport implements SessionAware {

	private static final long serialVersionUID = 541470551483275591L;

	protected Map<String, Object> session;

	/** 正确页面 */
	public final static String SUCCESS = "success";

	/** 返回JSON */
	protected final static String JSON = "json";

	/** JSON消息 */
	protected final static String MSG = "msg";

	/** JSON对象 */
	protected final static String OBJ = "obj";

	public void setSession(Map<String, Object> arg0) {
		this.session = arg0;
	}

}
