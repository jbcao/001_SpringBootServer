/**
 * 
 */
package com.src.practise.oob_handle_pass;

/**
 * 引用传递
 * @author mayn
 *
 */
public class Alias1 {
	Integer i;

	/**
	 * 
	 */
	public Alias1(Integer ii) {
		i = ii;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alias1 x = new Alias1(7);
		Alias1 y = x;
		System.out.println("x" + x.i);//7
		System.out.println("y" + y.i);//7
		System.out.println("增加");
		(x.i)++;
		System.out.println("x" + x.i);//8
		System.out.println("y" + y.i);//8

	}

}
