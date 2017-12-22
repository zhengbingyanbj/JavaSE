package cn.itcast.ligangtest;

public class Demo {
   public static void main(String[] args) {
	  // 禾斗 匕匕 
	   
	   //女兆 日月   
	   // 李刚要装爹
	   // 戴上他爹眼镜  帽子  衣服  粘上胡子 贴点假皱纹
	   LiGangDie  kd = new LiGang();//向上转型
	   
	   System.out.println(kd.age);
	   
	   //教   
	   kd.teach();
	   
	   //收了钱 回家  
//	   kd.playGame();
	   //卸妆  向下转型
	   LiGang lg = (LiGang)kd;
	   
	   lg.playGame();
	   
   }
}
