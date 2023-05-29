package com.src.practise.oog_algorithm;

import java.util.Arrays;

/**
 * @program: JavaSpecialityDeep
 * @author: Mr.Zerah
 * @create: 2018-10-25 22:52
 * @description: 冒泡排序
 * 冒泡排序只会操作相邻的两个数据。每次冒泡操作都会对相邻的两个元素进行比较，看是否满足大小关系要求。
 * 如果不满足就让它俩互换。一次冒泡会让至少一个元素移动到它应该在的位置，重复n 次，
 * 就完成了 n 个数据的排序工作。
 **/

	public class BubbleSort {
	    
	    static int[] array = {3,2,4,1,5,0};
	    
	    public static void maopaoSort(int[] a) 
	    {
	        //外层循环，是需要进行比较的轮数，一共进行5次即可
	        for(int i=0;i<a.length-1;i++) 
	        {
	            //内存循环，是每一轮中进行的两两比较
	            for(int j=0;j<a.length-1;j++) 
	            {
	                if(a[j] > a[j+1]) 
	                {
	                    int temp = a[j];
	                    a[j] = a[j+1];
	                    a[j+1] = temp; 
	                }
	            }
	            System.out.println("第"+(i+1)+"轮排序后的数组为: "+Arrays.toString(a));
	        }
	    }
	    
	    public static void main(String[] args) {
	        maopaoSort(array);
	    }
	}