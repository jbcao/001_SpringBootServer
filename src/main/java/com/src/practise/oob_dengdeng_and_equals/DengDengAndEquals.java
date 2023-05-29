/**
 * 
 */
package com.src.practise.oob_dengdeng_and_equals;

/**
 * @author mayn
 *
 */
public class DengDengAndEquals {

	/**
	 * equals比较的是内容
	 * ==    比较的是地址
	 */
	public DengDengAndEquals() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "string";
		String y = "string";
		String z = new String("string");
		System.out.println(x==y); // true
		System.out.println(x==z); // false
		System.out.println(x.equals(y)); // true
		System.out.println(x.equals(z)); // true
		String a = new String("hello");
		String b = new String("hello");
		System.out.println(a.equals(b));//true
		System.out.println(a==b);//false
	}

}
