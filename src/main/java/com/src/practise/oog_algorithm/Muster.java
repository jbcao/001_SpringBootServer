package com.src.practise.oog_algorithm;
import java.util.*;

public class Muster { // ������Muster
	public static void main(String args[]) {
		Collection<String> list = new ArrayList<>(); // ʵ�������������
		list.add("a"); // �򼯺��������
		list.add("b");
		list.add("c");
		Iterator<String> it = list.iterator(); // ����������
		while (it.hasNext()) { // �ж��Ƿ�����һ��Ԫ��
			String str = (String) it.next(); // ��ȡ������Ԫ��
			System.out.println(str);
		}
	}
}
