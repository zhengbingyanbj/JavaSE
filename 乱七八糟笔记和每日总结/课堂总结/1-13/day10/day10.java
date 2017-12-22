File类：面向对象中用来对应文件类型
	文件 -----> File类
	文件夹 -----> File类
构造方法：
	public File(String pathName);	//将文件变为对象，调用File类的方法进行文件操作。
	File f = new File("D:\\lesson\\a.txt");

	public File(String parent,String child);
	//路径由两部分组成,前边的是目录，后边的是文件名称，提高路径的灵活性
	File f  = new File("D:\\test","a.txt");

	File f1 = new File();
	File f  = new File(f1,"a.txt");
注意：File对象创建后，不会对路径的存在性和合法性进行判断。
File类的方法：
	toString()方法打印的是路径。
	获取功能：
		//D:\\test\\a.txt：绝对路径    a.txt :相对路径
 		public String getAbsolutePath() //获取File对象中的绝对路径，=
		public String getName()         //获取FIle对象的文件名
		public String getPath()         //获取FIle的路径名，File构造函数传入的路径，
		public long length()            //获取File文件的长度,以字节为单位
	创建功能：
		public boolean createNewFile()  //创建普通文件，创建文件之前一定要保证文件夹时存在的
		public boolean mkdir()   		//创建文件夹，只能创建一层文件夹，创建文件夹时，保证路径是存在的。
		public boolean mkdirs()  		//创建多级文件夹，可以创建多层文件夹
		public boolean delete()			
		//删除文件，既可以删除文件，也可以删除文件夹。一个文件夹有内容不能够删除。返回值是Boolean了类型。。
	 判断功能：
	 	public boolean exists()  		//判断文件是否存在
	 	public boolean isDirectory()	//判断文件是否是文件夹
	 	public boolean isFile()			//判断文件是否是文件