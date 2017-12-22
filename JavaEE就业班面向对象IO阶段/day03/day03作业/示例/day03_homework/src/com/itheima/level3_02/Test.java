package com.itheima.level3_02;

/*
��ʹ�ô�������:  
	���е�è������ɫ������,�����(����)��ץ����,�����в�è������(actingCute)
	���еĹ�������ɫ������,�����(�Ϲ�ͷ)�Ϳ���,���в��ֹ�������(actingCute)
	ȥ����,�����ȵ�è�͹�����. (��ʾͨ���ڲ������еľ�̬����ʵ��)
	ȥ�Է�,���ж��ﶼ����ȥ(��ʾͨ���ڲ������еľ�̬����ʵ��)
	
����˼·:
	1.��è�͹��������Ժ���Ϊ��ȡ����������
	2.�����ȵĶ��⹦����ȡ�߽ӿ���
ʵ�ֲ���:
1.�����������Animal
	a)����: ��ɫ(Color) ,����(age)
	b)���󷽷�: ��(eat)
	c)�ṩ:�ղ�,�вι��췽��,setters��getters ����
2.����ӿ����Ƚӿ�(ActingCute)
	a)���󷽷�: ����(actingCute)
3.���幷��(Dog)�̳ж�����(Animal)
	a)ʵ�ָ�������(eat)����
		i.�����ʽ: 2���ɫ�Ĺ��ڿϹ�ͷ
	b)���з���: ����(lookHome)
		i.�����ʽ: 2���ɫ�Ĺ��ڿ���
	c)�ṩ:�ղ�,�вι��췽��
4.��������ȵĹ���(ActingCuteDog) �̳й���(Dog) ʵ�����Ƚӿ�(ActingCute)
	a)ʵ�ֽӿ��е����ȷ���:actingCute())
		i.�����ʽ: 2���ɫ�Ĺ���װ�޹�
	b)�ṩ:�ղ�,�вι��췽��
5.����è��(Cat) �̳ж�����(Animal)
	a)ʵ�ָ���ĳ�(eat)����
		i.�����ʽ: 1���ɫ��è�ڳ���
	b)���з���:ץ����
		i.�����ʽ: 1���ɫ��è��ץ����
	c)�ṩ:�ղ�,�вι��췽��
6.��������ȵ�è��(ActingCuteCat) �̳�è��(Cat) ʵ�����Ƚӿ�(ActionCute)
	a)ʵ�ֽӿ��е����ȷ���:actingCute())
		i.�����ʽ: 1���ɫ��è�ڰ����
	b)�ṩ:�ղ�,�вι��췽��
7.���������(Test)
	a)���徲̬���� ȥ����(goToActingCute(ActingCute ac))
		i.�ڷ�����:�������ȷ���
	   ii.��������è�͵���è��ץ���󷽷�
      iii.�������Ĺ��͵��ù��Ŀ��ҷ���
	b)���徲̬���� ȥ�Է�(goToEat(Animal a))
		i.�ڷ�����:���óԷ���
		ii.��������è�͵���è��ץ���󷽷�
        iii.�������Ĺ��͵��ù��Ŀ��ҷ���
	c)����main����
	d)��main������
		i.����������d,��ɫ��ֵ��ɫ,���丳ֵ3
		ii.���������ȵĹ����� ad,��ɫ��ֵΪ��ɫ,���丳ֵ2
		iii.����è����c,��ɫ��ֵΪ��ɫ,���丳ֵΪ4
		iv.���������ȵ�è����,ac,��ɫ��ֵ��ɫ,���丳ֵΪ1
		v.����4��ȥ�Է�����,�ֱ������d,ad,c,ac
		vi.����2��ȥ���ȷ���,�ֱ���ad,ac
		vii.����2��ȥ���ȷ���,�ֱ���d,c; ������ñ����ͨ����? ˼��Ϊʲô?
 */
public class Test {
//	a)���徲̬���� ȥ����(goToActingCute(ActingCute ac))
	public static void goToActingCute(ActingCute ac){
//		i.�ڷ�����:���óԷ���
		ac.actingCute();
//		ii.��������è�͵���è��ץ���󷽷�
		if(ac instanceof Cat){
			Cat c = (Cat) ac;
			c.catchMouse();
		}
//      iii.�������Ĺ��͵��ù��Ŀ��ҷ���
		if(ac instanceof Dog){
			Dog d = (Dog) ac;
			d.lookHome();
		}
	}
//	b)���徲̬���� ȥ�Է�(goToEat(Animal a))
	public static void goToEat(Animal a){
//		i.�ڷ�����:���óԷ���
		a.eat();
//		ii.��������è�͵���è��ץ���󷽷�
		if(a instanceof Cat){
			Cat c = (Cat) a;
			c.catchMouse();
		}
//      iii.�������Ĺ��͵��ù��Ŀ��ҷ���
		if(a instanceof Dog){
			Dog d = (Dog) a;
			d.lookHome();
		}
	}
//	c)����main����
	public static void main(String[] args) {
//		i.����������d,��ɫ��ֵ��ɫ,���丳ֵ3
		Dog d = new Dog("��ɫ", 3);
//		ii.���������ȵĹ����� ad,��ɫ��ֵΪ��ɫ,���丳ֵ2
		ActingCuteDog ad = new ActingCuteDog("��ɫ", 2);
//		iii.����è����c,��ɫ��ֵΪ��ɫ,���丳ֵΪ4
		Cat c = new Cat();
		c.setAge(4);
		c.setColor("��ɫ");
//		iv.���������ȵ�è����,ac,��ɫ��ֵ��ɫ,���丳ֵΪ1
		ActingCuteCat ac = new ActingCuteCat();
		ac.setAge(1);
		ac.setColor("��ɫ");
//		v.����4��ȥ�Է�����,�ֱ������d,ad,c,ac
		goToEat(d);
		goToEat(ad);
		goToEat(c);
		goToEat(ac);
//		vi.����2��ȥ���ȷ���,�ֱ���ad,ac
		goToActingCute(ad);
		goToActingCute(ac);
//		vii.����2��ȥ���ȷ���,�ֱ���d,c; ������ñ����ͨ����? ˼��Ϊʲô?
//		goToActingCute(c); //����ʧ�� ֻ��ʵ�����Ƚӿڵ���Ķ���,�ſ�����Ϊ��������.
//		goToActingCute(d); //����ʧ�� 
	}
}
