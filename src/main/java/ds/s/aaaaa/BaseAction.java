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

	/** 登录信息 */
	protected static final String LOGININFO = "loginInfo";

	/** 正确页面 */
	protected static final String SUCCESS = "success";

	/** 错误页面 */
	protected static final String ERROR = "error";

	/** 返回JSON */
	protected static final String JSON = "json";

	/** JSON消息 */
	protected static final String MSG = "msg";

	/** JSON对象 */
	protected static final String OBJ = "obj";

	public void setSession(Map<String, Object> arg0) {
		this.session = arg0;
	}

}
