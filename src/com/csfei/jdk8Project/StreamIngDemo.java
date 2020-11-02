package com.csfei.jdk8Project;

import java.util.ArrayList;

import com.csfei.jdk8Pojo.Persion;

public class StreamIngDemo {

	/**
	 * 流的中间操作
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * 中间操作
		 * 1.filter过滤操作
		 * 2.limit限制操作
		 * 3.skip 跳过操作
		 * 4.distinct 去重
		 * 5.sorted 排序操作
		 * */
		
		ArrayList<Persion> list = new ArrayList<Persion>();
		list.add(new Persion("nginx",12));
		list.add(new Persion("tom",1));
		list.add(new Persion("nginx",12));
		list.add(new Persion("docker",3));
		list.add(new Persion("linux",42));
		list.add(new Persion("windows",52));
		list.add(new Persion("mysql",72));
		
		//filter
		list.stream()
		.filter(e -> e.getAge() > 52 )
		.forEach(System.out :: println);
		
		System.out.println("------limit-------");
		//limit
		list.stream()
		.limit(2)
		.forEach(System.out :: println);
		
		System.out.println("------skip -------");
		//skip   跳过几个元素
		list.stream()
		.skip(2)
		.forEach(System.out :: println);
		
		System.out.println("------去重 -------");
		//distinct     依据是hahcode  和equals
		
		list.stream()
		.distinct()
		.forEach(System.out :: println);
		
		
		System.out.println("------sorted -------");
		//sorted   
		list.stream()
		.sorted((e1,e2)->Integer.compare(e1.getAge(), e2.getAge()))
		.forEach(System.out :: println);
		
		System.out.println("------map -------");
		//map  
		list.stream()
		.map(e->e.getName())
		.forEach(System.out :: println);
	}
}
