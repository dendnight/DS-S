package ds.s.utils;

/**
 * 常用工具
 * 
 * <pre>
 * Description
 * Copyright:	Copyright (c)2013  
 * Company:		DENDNIGHT
 * Author:		dendnight
 * Version:		1.0  
 * Create at:	2013年12月1日 下午6:01:10  
 *  
 * 修改历史:
 * 日期    作者    版本  修改描述
 * ------------------------------------------------------------------
 * 
 * </pre>
 */
public class DSTools {

	/**
	 * 得到随机数
	 * 
	 * @param 1~i
	 * @return
	 */
	public int getRandom(int i) {
		return new java.util.Random().nextInt(i);
	}

	public static void main(String[] args) {
		// System.out.println(getRandom(123123));
		System.out.println("202CB962AC59075B964B07152D234B70".length());
	}
}
