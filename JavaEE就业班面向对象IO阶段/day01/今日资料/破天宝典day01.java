
String: 字符串类(重点)
		字符串是常量；它们的值在创建之后不能更改
	
    构造方法：(掌握,重点是能知道什么意思)
		public String() 空参数构造方法
		public String(String original) 就是字符串字面值，封装成对象  
		//下面方法做为一个了解...因为会在以后IO的代码中会看到使用
  		public String(byte[] bytes) 把字节数组转换字符串
 		public String(byte[] bytes, int startIndex,  int length) 把字节数组一部分元素 转换成字符串
  		public String(char[] value) 把字符数组 转换成字符串
  		public String(char[] value, int startIndex, int count) 把字符数组一部分元素 转换成字符串
  				
 方法：
	判断功能()
		boolean equals(Object obj) 判断两个字符串中的内容是否相同
		boolean equalsIgnoreCase(String str)  判断两个字符串中的内容是否相同, 忽略大小写
		boolean contains(String str) 判断该字符串中 是否包含给定的字符串
		boolean startsWith(String str) 判断该字符串 是否以给定的字符串开头
		boolean endsWith(String str) 判断该字符串 是否以给定的字符串结尾
		boolean isEmpty() 判断该字符串的内容是否为空的字符串  "" 

	获取功能：
		int length() 获取该字符串的长度
		char charAt(int index) 获取该字符串中指定位置上的字符 
		String substring(int start) 从指定位置开始，到末尾结束，截取该字符串，返回新字符串
		String substring(int start,int end) 从指定位置开始，到指定位置结束，截取该字符串，返回新字符串 
		//下面是关于索引的一些查询  这个不作为掌握 但是要了解字符串中有这样的功能
		int indexOf(int ch ) 获取给定的字符，在该字符串中第一次出现的位置
		int indexOf(String str) 获取给定的字符串，在该字符串中第一次出现的位置
		int indexOf(int ch,int fromIndex) 从指定位置开始，获取给定的字符，在该字符串中第一次出现的位置
		int indexOf(String str,int fromIndex) 从指定位置开始，获取给定的字符串，在该字符串中第一次出现的位置
			
	转换功能：
		byte[] getBytes() 把该字符串 转换成 字节数组
		char[] toCharArray() 把该字符串 转换成 字符数组

		//下面的方法 知道有就可以了
		String toLowerCase() 把该字符串转换成 小写字符串 
		String toUpperCase() 把该字符串转换成 大写字符串
		
		String concat(String str) 把该字符串与给定的字符串相连接，返回一个新的字符串
		s1+s2 
		s1.concat(s2)
			
	替换功能
		String replace(char old,char new) 在该字符串中，将给定的旧字符，用新字符替换
		String replace(String old,String new) 在该字符串中， 将给定的旧字符串，用新字符串替换
	去除字符串两空格	
		String trim() 去除字符串两端空格，中间的不会去除，返回一个新字符串
	
	 String[] split(String regex);按照规则切割
	 
StringBuffer/StringBuilder:(理解)
	构造方法：
		public StringBuffer() 创建一个字符串缓冲区，默认容量大小16
		public StringBuffer(String str) 创建一个字符串缓冲区，指定默认内容为 str 的内容，长度为 字符串str的长度 + 16
	方法：
		public StringBuffer append(String str) 在原有字符串缓冲区内容基础上，在末尾追加新数据
		
		//----基本不用的...
		public StringBuffer insert(int offset,String str) 在原有字符串缓冲区内容基础上，在指定位置插入新数据
		public StringBuffer deleteCharAt(int index) 在原有字符串缓冲区内容基础上，删除指定位置上的字符
		public StringBuffer delete(int start,int end) 在原有字符串缓冲区内容基础上，删除指定范围内的多个字符
		public StringBuffer replace(int start,int end,String str)在原有字符串缓冲区内容基础上，将指定范围内的多个字符 用给定的字符串替换
		
		-----------------------------
		public StringBuffer reverse() 将字符串缓冲区的内容 反转  "abc"----"cba"
		public String substring(int start) 从指定位置开始，到末尾结束，截取该字符串缓冲区，返回新字符串
		public String substring(int start,int end)  从指定位置开始，到指定位置结束，截取该字符串缓冲区，返回新字符串


第一天  继承 扩展文档  

   面向对象 
       封装
	       方法的封装 类的封装 
		   private 私有化 
	   继承 
	      
	   多态

   面向对象(继承的引入和概述)(掌握)
	A:继承概述
	    理解1:存在一个现有类,让新类与它产生关系,新类具备现有类的属性和方法,这个关系就是继承

		理解2:
		      多个类中存在相同属性和行为时，
		      将这些内容抽取到单独一个类中，
			  那么多个类无需再定义这些属性和行为，只要继承那个类即可。
	B:继承格式
		通过extends关键字可以实现类与类的继承
		class 子类名 extends 父类名 {}  
		单独的这个类称为父类，基类或者超类；
		这多个类可以称为子类或者派生类。
        有了继承以后,我们定义一个类的时候,可以在一个已经存在的类的基础上,还可以定义自己的新成员.

   面向对象(继承中成员变量的关系)(掌握)(要掌握查找的顺序)
	A:子类中的成员变量和父类中的成员变量名称不一样
	B:子类中的成员变量和父类中的成员变量名称一样
		在子类中访问一个变量的查找顺序("就近原则")
			a: 在子类的方法的局部范围找,有就使用
			b: 在子类的成员范围找,有就使用
			c: 在父类的成员范围找,有就使用
			d: 如果还找不到,就报错
   
   面向对象(Java中类的继承特点)(掌握)  
        
	A:Java中类的继承特点
		a:Java只支持单继承，不支持多继承。
			有些语言是支持多继承，格式：extends 类1,类2,...
		b:Java支持多层继承(继承体系)
	B:案例演示
		Java中类的继承特点
    
  面向对象(什么时候使用继承)
   
	什么时候使用继承
		继承其实体现的是一种关系："is a" .		
		采用假设法。
			如果有两个类A,B。只有他们符合A是B的一种，或者B是A的一种，就可以考虑使用继承。
  
  面向对象(继承案例演示以及继承的好处和弊端)(掌握) 记住好处重点要知道 继承是多态的前提
	A:需求：
		学生类和老师类。
		定义两个功能(吃饭，睡觉)
	B:案例演示
		使用继承前
	C:案例演示
		使用继承后
	D:继承的好处
		a:提高了代码的复用性
		b:提高了代码的维护性
		c:让类与类之间产生了关系，是多态的前提

	E:继承的弊端(了解)
		类的耦合性增强了。
		
		开发的原则：高内聚，低耦合。
		耦合：类与类的关系
		内聚：就是自己完成某件事情的能力


   方法重写 