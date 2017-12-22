// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Test2.java

package cn.itcast07.baozhuanglei;

import java.io.PrintStream;

public class Test2
{

	public Test2()
	{
	}

	public static void main(String args[])
	{
		Object a = Integer.valueOf(127);
		Object b = Integer.valueOf(127);
		Object c = Integer.valueOf(128);
		Object d = Integer.valueOf(128);
		System.out.println(a == b);
		System.out.println("--------------------");
		System.out.println(c == d);
	}
}
