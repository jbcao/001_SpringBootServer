/**
 * 
 */
package com.src.practise.oog_recursive;

/**
 * @author mayn
 *
 */
public class Recursive {

	/**
	 * 递归
	 */
	public Recursive() {
		// TODO Auto-generated constructor stub
	}

	public static int f(int x) {
		if (x == 0)
			return 0;
		else
			return 2 * f(x - 1) + x * x;

	}

	/**
	 * 用递归方法 输出斐波那契数列 1 1 2 3 5 8 13 21 34 55 
	 * @param x
	 * @return
	 */
	
	public static int bad(int x) {
		if (x==1 )
			return 1;
		if (x==2 )
			return 1;
		else
			return bad(x-1) +bad(x-2);
		
	}
	
	/**
	 * 用递归方法输出 阶乘n!
	 * @param x
	 * @return
	 */
	public static int factorial(int x) {
		if (x==1 )
			return 1;
		else
			return x*factorial(x-1);
		
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recursive.f(10);
		System.out.println(Recursive.f(10));
		System.out.println(Recursive.bad(10));
		System.out.println(Recursive.factorial(10));
	}

}
