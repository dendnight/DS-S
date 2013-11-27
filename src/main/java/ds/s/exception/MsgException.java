package ds.s.exception;

/**
 * 
 * <pre>
 * Description
 * Copyright:	Copyright (c)2013  
 * Company:		DENDNIGHT
 * Author:		dendnight
 * Version:		1.0  
 * Create at:	2013年11月28日 上午12:23:51  
 *  
 * 修改历史:
 * 日期    作者    版本  修改描述
 * ------------------------------------------------------------------
 * 
 * </pre>
 */
public class MsgException extends Exception {

	private static final long serialVersionUID = -3300160368074348069L;

	public MsgException() {
		super();
	}

	public MsgException(String message, Throwable cause) {
		super(message, cause);
	}

	public MsgException(String message) {
		super(message);
	}

	public MsgException(Throwable cause) {
		super(cause);
	}

}
