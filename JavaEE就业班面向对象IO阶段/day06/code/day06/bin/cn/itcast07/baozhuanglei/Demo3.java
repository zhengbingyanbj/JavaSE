// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Demo3.java

package cn.itcast07.baozhuanglei;

import java.util.ArrayList;

public class Demo3
{

	public Demo3()
	{
	}

	public static void main(String args[])
	{
		Integer ii = Integer.valueOf(100);
		int i = ii.intValue();
		ArrayList list = new ArrayList();
		list.add(new Integer(2));
		list.add(Integer.valueOf(123));
	}
}
