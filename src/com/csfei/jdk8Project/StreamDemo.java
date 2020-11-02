package com.csfei.jdk8Project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamDemo {

	/*
	 * Stream 的使用
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * 1.Collection 对象中的stream（） 单线程  和    paralleStream()  多线程
		 */
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("1");
		arrayList.add("2");
		arrayList.add("3");
		arrayList.add("5");
		
		//Stream<String> stream = arrayList.stream();
		
		Stream<String> stream = arrayList.parallelStream();  //并行流
		//遍历
		//stream.forEach(s-> System.out.println(s));
		stream.forEach(System.out :: println);
		
		
		/**
		 * 2.Arrays工具类的stream方法
		 */
		
		String arr[] = {"a","b","c"};
		Stream<String> stream2 = Arrays.stream(arr);
		stream2.forEach(System.out :: println);
		
		
		
	}

}
