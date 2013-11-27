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
 * Create at:	2013��11��24�� ����6:03:46  
 *  
 * �޸���ʷ:
 * ����    ����    �汾  �޸�����
 * ------------------------------------------------------------------
 * 
 * </pre>
 */
public class BaseAction extends ActionSupport implements SessionAware {

	private static final long serialVersionUID = 541470551483275591L;

	protected Map<String, Object> session;
	/** ������ȷҳ�� */
	public final static String SUCCESS = "success";

	/** ���ش���ҳ�� */
	protected final static String ERROR = "error";

	/** ����ҳ�� */
	protected final static String OTHER = "other";

	/** ����json */
	protected final static String JSON = "json";

	private String json;

	/**
	 * ����session
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
