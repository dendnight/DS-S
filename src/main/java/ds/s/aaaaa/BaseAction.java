package ds.s.aaaaa;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
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
public class BaseAction extends ActionSupport implements SessionAware, ServletRequestAware, ServletResponseAware {

	private static final long serialVersionUID = 541470551483275591L;

	protected Map<String, Object> session;
	protected HttpServletRequest request;
	protected HttpServletResponse response;
	/** 返回正确页面 */
	public final static String SUCCESS = "success";

	/** 返回错误页面 */
	public final static String ERROR = "error";

	/** 其他页面 */
	public final static String OTHER = "other";

	public void setServletResponse(HttpServletResponse arg0) {
		this.response = arg0;

	}

	public void setServletRequest(HttpServletRequest arg0) {
		this.request = arg0;

	}

	public void setSession(Map<String, Object> arg0) {
		this.session = arg0;

	}

}
