package com.jni;

public class Demo {

	// ���屾�ط�������c/c++����ʵ��
	public native void sayHello();

	public static void main(String[] args) {
		// ���ض�̬���ӿ�
		System.loadLibrary("Win32Project1");

		Demo demo = new Demo();

		demo.sayHello();

	}
}