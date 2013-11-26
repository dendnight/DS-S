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
 * Create at:	2013��11��24�� ����6:03:46  
 *  
 * �޸���ʷ:
 * ����    ����    �汾  �޸�����
 * ------------------------------------------------------------------
 * 
 * </pre>
 */
public class BaseAction extends ActionSupport implements SessionAware, ServletRequestAware, ServletResponseAware {

	private static final long serialVersionUID = 541470551483275591L;

	protected Map<String, Object> session;
	protected HttpServletRequest request;
	protected HttpServletResponse response;
	/** ������ȷҳ�� */
	public final static String SUCCESS = "success";

	/** ���ش���ҳ�� */
	public final static String ERROR = "error";

	/** ����ҳ�� */
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
