package com.jni;

public class Demo {

	// 定义本地方法，用c/c++代码实现
	public native void sayHello();

	public static void main(String[] args) {
		// 加载动态链接库
		System.loadLibrary("Win32Project1");

		Demo demo = new Demo();

		demo.sayHello();

	}
}