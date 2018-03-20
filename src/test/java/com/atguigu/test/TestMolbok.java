package com.atguigu.test;

import com.atguigu.lombok.Person;

public class TestMolbok {
	public static void main(String[] args) {
		TestMolbok tm=new TestMolbok();
		Person person=new Person(1, "高剑峰", "郭桐宁是帅哥", "中国山西");
		System.out.println(person);
		int i=0;
		i++;
		System.out.println(i); 
	}
}
