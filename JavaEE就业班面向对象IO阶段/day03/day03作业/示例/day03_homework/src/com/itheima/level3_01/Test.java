package com.itheima.level3_01;

/*
 ��ʹ�ô�������:    
���зɻ�(Plane)�����з�(fly)�Ĺ��ܣ�����ս����(Battleplane)���˾��зɵĹ����⣬�����з����ڵ�(fire)�Ĺ��ܣ�
Ҫ��:
   1.�ڲ������д���ս��������,����fly��fire����; 
   2.Ȼ���������ת��(ת��Ϊ�������ͺ�ʵ�ֵĽӿ�����)������ת��.


 1.����ɻ���Plane
	a)��Ա����:fly()
	i.���:�ɻ��ڷ�
2.����ӿ���Firing�ӿ�
	a)���󷽷�:fire
3.����ս������(Battleplane) �̳� Plane ʵ�� Firing�ӿ�
	a)ʵ�ֳ��󷽷� fire
	i.���:ս�����ڷ����ڵ�
4.���������(Test)
	a)����ս����(Battleplane)�Ķ��� bp,���÷ɺͷ����ڵ�����
	b)��bp��ֵ�� Plane p,
		i.���Ե���fly��fire����
		ii.���ж�p�Ƿ���Battleplane��ʵ������,����ǰ�p����ת��ΪBattleplane,Ȼ�����fire����
	c)��bp��ֵ�� Fireing ���� f ����
		i.����ʹ��ʹ��f����fly��fire����
		ii.���ж�f�Ƿ���Battleplane��ʵ������,����ǰ�f����תΪΪBattleplane,Ȼ�����fly����
 */

public class Test {
	public static void main(String[] args) {
//		a)����ս����(Battleplane)�Ķ��� bp,���÷ɺͷ����ڵ�����
		Battleplane bp = new Battleplane();
		bp.fly();
		bp.fire();
//		b)��bp��ֵ�� Plane p,
//			i.���Ե���fly��fire����
		Plane p = bp;
		p.fly();
//		p.fire(); ���뱨��,�������ñ��뿴��ߵ�����
//			ii.���ж�p�Ƿ���Battleplane��ʵ������,����ǰ�p����ת��ΪBattleplane,Ȼ�����fire����
		if(p instanceof Battleplane){
			Battleplane bpp = (Battleplane) p;
			bpp.fire();
		}
//		c)��bp��ֵ�� Fireing ���� f ����
		Firing f = bp;
//			i.����ʹ��ʹ��f����fly��fire����
		f.fire();
//			ii.���ж�f�Ƿ���Battleplane��ʵ������,����ǰ�f����תΪΪBattleplane,Ȼ�����fly����
		if(f instanceof Battleplane){
			Battleplane pf = (Battleplane) f;
			pf.fly();
		}
	}
}
