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
 * Create at:	2013年11月24日 下午6:03:46  
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
	/** 返回正确页面 */
	public final static String SUCCESS = "success";

	/** 返回错误页面 */
	protected final static String ERROR = "error";

	/** 其他页面 */
	protected final static String OTHER = "other";

	/** 返回json */
	protected final static String JSON = "json";

	private String json;

	/**
	 * 设置session
	 */
	public void setSession(Map<String, Object> arg0) {
		this.session = arg0;

	}

	public String getJson() {
		return json;
	}

	public void setJson(String json) {
		this.json = json;
	}

	public void setJson() {

	}

}
