package cn.itcast05.nonameinnerclass;
/*
 *  �����ڲ��౾�� ��һ�� ʵ�ֽӿڻ��߼̳���� һ���������(û�����ֵ�)
 *  
 *  ���ã������ڲ����Ǵ���ĳ�������������Ŀ�ݷ�ʽ��
 *  
 *  ��ʽ��
 *    new �ӿڻ�����(){
 *       ��д����;
 *    };
 *    
 *    ����������ڲ�������������  
 *       ��ʱ����ĳһָ�����͵�����
 *       ����󼴿̴����ոն�����������Ķ���
 */
public class Demo {
   public static void main(String[] args) {
	   
//	   feedAnimal(new Animal());
	   //ֱ��д�ǲ��Ե� 
	   //��Ҫ�ڰ��� ����һ����  �� Cat��  �̳� Animal ��д���󷽷�
	   //��������  
//	   Animal a = new Cat();
//	   
//	   feedAnimal(a);
	   
	   //ʹ���µķ�ʽ    
//	   new Animal(){
//		   //������д
//		   public void eat(){
//			   System.out.println("������㽶");
//		   }
//	   }.eat();
//	   
//	   new Cat().eat();;
	   /*
	    * 
	    new Animal(){
		   //������д
		   public void eat(){
			   System.out.println("������㽶");
		   }
	   };
	   �������  ��Animal��һ��������� 
	   
	   �൱��  ������ һ������ ����  ������ɴ�������
	             Cat����   new Cat();
	    */
	   
	  Animal aa =  new Animal(){
		   //������д
		   public void eat(){
			   System.out.println("������㽶");
		   }
	   };
	   
	   Animal a = new Cat();
	   
	   feedAnimal(new Cat());
	   
	   feedAnimal(new Animal(){
		   //������д
		   public void eat(){
			   System.out.println("������㽶");
		   }
	   });
   }
   
   public static void feedAnimal(Animal a){
	    
	   a.eat();
   }
}
