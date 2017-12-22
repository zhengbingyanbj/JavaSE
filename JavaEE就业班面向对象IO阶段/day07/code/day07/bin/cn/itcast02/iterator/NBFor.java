// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   NBFor.java

package cn.itcast02.iterator;

import java.io.PrintStream;
import java.util.*;

public class NBFor
{

	public NBFor()
	{
	}

	public static void main(String args[])
	{
		Collection coll = new ArrayList();
		coll.add("¹ÅÁ¦ÄÈÔú");
		coll.add("µÏÀöÈÈ°Í");
		coll.add("Âí¶ûÔú¹ş");
		String s;
		for (Iterator iterator = coll.iterator(); iterator.hasNext(); System.out.println(s))
			s = (String)iterator.next();

	}
}
