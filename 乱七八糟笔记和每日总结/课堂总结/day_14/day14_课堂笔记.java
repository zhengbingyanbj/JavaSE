知识点：
	网络编程：
		专业：用Java语言(编程语言)来实现网络互连的不同计算机上运行的程序间可以进行数据交换(交互)。
		大白话：用Java语言实现不同计算机间的数据交换(交互)。
		
		三大要素：
			IP： InetAddress
				概述：设备在网络中唯一标识
				组成：网络(关)号码 + 主机地址
				分类：
					城域网：1 + 3
					广域网：2 + 2
					局域网：3 + 1
				两个特殊的IP：
					127.0.0.1			//本地回环(路)地址
					255.255.255.255		//广播地址
				两个常用的DOS命令：
					ping IP -t:		//测试连接
					ipconfig /all	//查看本机IP

				 String  <---> InetAddress 之间的转换  //记忆
						static InetAddress getByName(String nameOrIP);  //根据主机名或者IP地址获取其对应的 IP地址对象
						public String getHostAddress();					//根据IP地址对象获取其对应的 字符串形式的IP
					

			端口号：
				概述：程序在设备中的唯一标识
				范围： 0-65535 (一共是65536个端口)
				注意： 0-1024已经被系统占用了或者用作保留端口，我们自己写端口号的时候不要写这个范围的。
				80：	http协议上网端口
				3306	mysql的端口号  
				
			协议：
				UDP：
					面向无连接
					发送数据采用数据报包的形式(每个包的大小不能超过64KB)
					不安全(不可靠)协议
					效率高
					不区分客户端和服务器端(叫：发送端和接收端)

				TCP：
					面向有连接(三次握手)
					发送数据采用IO流的方式(没有大小限制)
					安全(可靠)协议
					效率低
					区分客户端和服务器端
						Socket   ServerSocket

面试题：
	1、什么是网络编程？

	2、端口号的范围是多少？ 哪个号段不要用?
		0-65535.   0-1024.
		因为已经被系统占用了，或者用作保留端口。

	3、TCP协议和UDP协议的区别是什么？

练习题：
	1、UDP传输数据：
		发送端：
			A：创建发送端的Socket对象。
				public DatagramSocket();

			B: 创建发送端的数据报包对象，里边封装的是要发送的数据和信息。
				public DatagramPacket(byte[] bys,int length,InetAddress inet,int port);

			C: 调用 DatagramSocket 类的 send()方法发送数据报包即可。
				public void send(DatagramPacket dp);

			D：释放资源。

		接收端：
			A：创建接收端的Socket对象。 指定端口号，而且端口号要和发送端一致
				public DatagramSocket(int port);

			B: 创建接收端的数据报包对象，里边封装的是要用来接收数据的数组。
				public DatagramPacket(byte[] bys,int length);

			C: 调用 DatagramSocket 类的 receive()方法接收数据报包即可。
				public void receive(DatagramPacket dp);

			D：拆包。
				DatagramPacket:
					getLength();	//获取有效字节数
					getAddress();	//获取发送端的IP地址对象
					getPort();		//获取发送端的端口号

			E：释放资源。


TCP协议传输数据：
	客户端：  Socket
		1、创建客户端Socket对象，指定服务器IP和端口号。
			public Socket(String ip,int port);
		2、通过Socket类中的  getOutputStream() 和 getInputStream()获取和服务器进行交互的流。
			public OutputStream getOutputStream();	//可以往服务器写数据。
			public InputStream getInputStream();	//可以读服务器写过来的数据

	服务器端：
		//一个服务器端可以服务多个客户端。
		1、创建服务器端Socket对象(ServerSocket)，指定端口号。
			public ServerSocket(int port);

		2、通过ServerSocket类中的 accept()，获取客户端的Socket对象。

		3、通过Socket类中的  getOutputStream() 和 getInputStream()获取和客户端进行交互的流。
			public OutputStream getOutputStream();	//可以往客户端写数据。
			public InputStream getInputStream();	//可以读客户端写过来的数据

中午作业：
	1、把上午讲的 UDP传输数据的方式联系下。
	2、有时间了，参考如下的格式，尝试做一下 TCP传输数据。
		客户端：
			1、创建客户端的 Socket 对象,指定IP和端口号。   
			2、通过 Socket 类中的 getInputStream() 和 getOutputStream()可以获取和 服务器端相关联(交互)流。
				客户端的输入流： 
					可以读取 服务器端的 输出流写出的内容
					//可以读服务器端写过来的数据
				客户端的输出流：
					可以写出 数据到 服务器端的输入流
					//可以往服务器端写数据

		服务器端：
			1、创建服务器端的Socket对象 (ServerSocket)，指定端口号
			2、监听连接(accept()),如果有客户端申请连接，就创建一个Socket符合和该客户端的通信。
			3、通过 Socket 类中的 getInputStream() 和 getOutputStream()可以获取和 客户端相关联(交互)流。
				服务器端的输入流： 
					可以读取 客户端的 输出流写出的内容
					//可以读 客户端写过来的数据
				服务器的输出流：
					可以写出 数据到 客户端的输入流
					//可以往客户端写数据
		
		//Socket#shutdownOutput()   禁用该套接字的 输出流。

	3、休息会儿，保持精力。