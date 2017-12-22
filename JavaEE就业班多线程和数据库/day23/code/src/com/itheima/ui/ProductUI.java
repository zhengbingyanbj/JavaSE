package com.itheima.ui;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.itheima.domain.Product;
import com.itheima.service.ProductService;

/*
 * �û�����
 */
public class ProductUI {

	public static void main(String[] args) {
		System.out.println("��ӭ��ӭ�����һ�ӭ��");
		
		while(true){
			
			System.out.println("���������²���:");
			System.out.println("C:������U:�޸ġ�D:ɾ����DA:ɾ�����С�I:ͨ��ID��ѯ��FA:��ѯ���С�Q:�˳�");
			String choose = enterString();
			switch (choose.toUpperCase()) {
			case "C":
				addProduct();
				break;
			case "U":
				updateProduct();
				
				break;
			case "D":
				deleteById();
				
				break;
			case "DA":
				deleteAll();
				
				break;
			case "I":
				findById();
				break;
			case "FA":
				findAll();
				break;
			case "Q":
				System.out.println("��ȷ��Ҫ�˳���Y/N");
				String exit = enterString();
				if("y".equalsIgnoreCase(exit)){
					System.out.println("�ټ����������֣�");
					System.exit(0);
				}
				break;
				
			default:
				System.out.println("��Ϲ������������");
				break;
			}
		}
		
	}
	/*
	 * ����ɾ��
	 * ����һ��set���������洢�����û������id
	 * ѭ��  
	 * 	  ��ʾ�û�����Ҫɾ������Ʒid
	 * 	  �ж�id�Ƿ�Ϊ-1
	 * 		�����-1����ѭ��
	 *   ʹ���û������id ��ѯ���ݿ� �õ���Ʒ����
	 *   �ж���Ʒ�����Ƿ����
	 *   	��������� 
	 *   		continue;
	 *   ������� ��ʾ�û���ǵ����ĸ���Ʒ
	 *   ������Ʒ��id���뵽������
	 * ����service��deleteAll����
	 */
	private static void deleteAll() {
		
		findAll();
		
		
		//����һ��set���������洢�����û������id
		Set<Integer> ids = new HashSet<Integer>();
		
		ProductService service = new ProductService();
		while(true){
			System.out.println("������Ҫɾ����Ʒ��id:");
			int pid = enterInt();
			//  �ж�id�Ƿ�Ϊ-1
			if(pid==-1){
				//�����-1����ѭ��
				break;
			}
			//����service���findById������ѯ���û�Ҫɾ������Ʒ
			Product findById = service.findById(pid);
			if(findById==null){
				System.out.println("Ҫɾ������Ʒ�����ڣ�");
				continue;
			}
			System.out.println("���ѱ������Ʒ"+findById);
			//��id���뵽������
			ids.add(pid);
		}
		//����û�û��ɾ�� ֱ�ӷ�������
		if(ids.size()==0){
			return;
		}
		
		System.out.println("��ȷ��Ҫɾ��"+ids.size()+"����¼��?Y/N");
		String isDeleteAll = enterString();
		if("y".equalsIgnoreCase(isDeleteAll)){
			//����service���deleteAll����
			service.deleteAll2(ids);
			System.out.println("ɾ���ɹ�");
		}
		
		
		
		
		
	}
	/*
	 * ��ʾ�û�����Ҫɾ����Ʒ��id
	 * ����service��findById�ķ���
	 * ������Ʒ����
	 * �ж���Ʒ�����Ƿ�Ϊnull 
	 * 		���Ϊnull id������
	 * 		return
	 * �����Ϊnull ��֪�û�ɾ�������ĸ���Ʒ
	 * ��ʾ�û��Ƿ�Ҫɾ��
	 * 
	 */
	private static void deleteById() {
		findAll();
		
		
		System.out.println("������Ҫɾ������Ʒ��id:");
		int pid = enterInt();
		//����service��findById�ķ���
		ProductService service = new ProductService();
		Product findById = service.findById(pid);
		if(findById==null){
			System.out.println("�������id�����ڣ�");
			return ;
		}
		
		System.out.println("��Ҫɾ���Ķ���Ϊ��"+findById);
		System.out.println("��ȷ��Ҫɾ����Y/N");
		String isDelete = enterString();
		if("y".equalsIgnoreCase(isDelete)){
			//����service�� ����idɾ���ķ���
			service.deleteById(pid);
			System.out.println("ɾ���ɹ�");
		}
		
	}
	/*
	 * ��ʾ�û��������޸���Ʒ��id
	 * ����service��findById������ѯ��Ӧ����Ʒ
	 * �ж���Ʒ�Ƿ����
	 * 		�����ƷΪnull˵����Ʒ������
	 * 		return
	 * �����Ʒ��ΪNull ˵����Ʒ����
	 * ��ʾ�û�������Ʒ����
	 * ����service��findByName������ѯ��Ӧ����Ʒ
	 * �ж���Ʒ 
	 * 		�����Ʒ��Ϊnull˵����Ʒ���Ѿ�����
	 * 		return;
	 * �����ƷΪnull ˵����Ʒ���ƿ���ʹ�ü����޸�
	 * ��ʾ�û�������Ʒ�۸�
	 * ��ʾ�û���������Ʒ�ķ���
	 * �����ݷ�װ��һ��Product������
	 * ����service��updateProduct����
	 * 
	 * 
	 */
	private static void updateProduct() {
		findAll();
		
		
		System.out.println("������Ҫ�޸���Ʒ��id:");
		int pid = enterInt();
		//ʹ��pid��ѯ���ݿ� �ж��Ƿ��������Ʒ
		ProductService service = new ProductService();
		Product findById = service.findById(pid);   
		
		//�����Ʒ������˵��idû��
		if(findById==null){
			System.out.println("��Ʒ�����ڣ�");
			return;
		}
		System.out.println("��Ҫ�޸ĵ���ƷΪ��"+findById);
		//�����Ʒ������ʾ�����޸�
		System.out.println("����������Ʒ����:"); 
		String pname = enterString();
		
		//�ж���Ʒ�����Ƿ��Ѵ���
		Product findByName = service.findByName(pname);
		//�����Ʒ���� ������Ʒ���Ʋ����Ѿ�����������Ʒ������ͬ ��ô�����Ѵ���
		if(findByName!=null && !(pname.equals(findById.getPname()))){
			System.out.println("��Ʒ�Ѵ��ڣ�");
			return;
		}
		//�����Ʒ������ ��ʾ�û������޸�
		System.out.println("����������Ʒ�ļ۸�:");
		double price = enterDouble();
		System.out.println("����������Ʒ�ķ���(1.�ҵ�   2.����   3.��ױƷ):");
		int category_id = enterInt();
		
		//�����ݷ�װ��Product������
		
		Product p = new Product(pid, pname, price, "1", category_id);
		
		//����service�㷽���޸���Ʒ
		service.updateProduct(p);
		System.out.println("�޸���Ʒ�ɹ�");
		
	}
	/*
	 * �����Ʒ
	 * 
	 * ��ʾ�û���������Ʒ����
	 * ����service��findByName������ѯ���ݿ�
	 * ����һ��Product����
	 * �ж�Product�����Ƿ���� 
	 * 		�����Ϊnull˵����Ʒ�Ѿ�����
	 * 		return
	 * ���product����Ϊnull��Ʒ�����ڿ������
	 * ������ʾ�û� ����۸�  ����
	 * ���û���������ݷ�װ��һ��Product������
	 * ����service��addProduct�������������
	 * 
	 */
	private static void addProduct() {
		System.out.println("����������Ʒ����:");
		String pname = enterString();
		//����Service����
		ProductService service = new ProductService();
		Product findByName = service.findByName(pname);
		//�ж϶���
		if(findByName!=null){
			System.out.println("����Ʒ�Ѵ��ڣ�");
			return ;
		}
		
		//���product����Ϊnull��Ʒ�����ڿ������
		System.out.println("����������Ʒ�ļ۸�:");
		double price = enterDouble();
		System.out.println("����������Ʒ�ķ���(1.�ҵ�   2.����  3.��ױƷ):");
		int category_id = enterInt();
		//�����ݷ�װ��һ��Product������
		Product p = new Product(0, pname, price, "1", category_id);
		//����Service���addProduct()
		service.addProduct(p);
		System.out.println("��ӳɹ���");
	}
	/*
	 * ��ʾ�û�����Ҫ��ѯ��id
	 * ����service���findById����
	 * ����һ��Product����
	 */
	private static void findById() {
		System.out.println("��������Ҫ��ѯ��Ʒ��id:");
		int pid = enterInt();
		//����service���findById����
		ProductService service = new ProductService();
		Product p = service.findById(pid);
		
		if(p==null){
			System.out.println("�������id�����ڣ�");
			return;
		}
		System.out.println("����ѯ�ļ�¼Ϊ:"+p);
		
		
	}

	/*
	 * ��ѯ����
	 * ����Service����� ����findAll����
	 * �õ�����product����ļ���
	 * �������� ���λ�ȡÿ������
	 * ��ӡ����
	 * 
	 */
	private static void findAll() {
		ProductService service = new ProductService();
		
		List<Product> list = service.findAll();
		//�������Ϊ�� �����û�û������ 
		if(list==null || list.size()==0){
			System.out.println("û�в�ѯ�����ݣ�");
			return;
		}
		
		System.out.println("����ѯ�Ľ��Ϊ:");
		for(Product p : list){
			System.out.println(p);
		}
	}


	public static String enterString(){
		return new Scanner(System.in).nextLine();
	}
	public static double enterDouble(){
		return new Scanner(System.in).nextDouble();
	}
	public static int enterInt(){
		return new Scanner(System.in).nextInt();
	}
}
