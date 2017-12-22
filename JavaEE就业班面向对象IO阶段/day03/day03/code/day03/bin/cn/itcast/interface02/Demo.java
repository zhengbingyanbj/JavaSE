// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Demo.java

package cn.itcast.interface02;

import java.io.PrintStream;

public class Demo
{

	public Demo()
	{
	}

	public static void main(String args[])
	{
		String arr[] = {
			"1", "a", "b"
		};
		String args1[];
		int j = (args1 = arr).length;
		for (int i = 0; i < j; i++)
		{
			String s = args1[i];
			System.out.println(s);
		}

	}
}
