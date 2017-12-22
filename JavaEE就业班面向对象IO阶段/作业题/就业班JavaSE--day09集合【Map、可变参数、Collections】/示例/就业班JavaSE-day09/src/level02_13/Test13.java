package level02_13;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Set;

/*
	Map����{����=23,����=24,����=15,����=36,����=17,����=57,�ܰ�=35}
	��ЩԪ��keyΪ����valueΪ����.���ܰ˵������޸�Ϊ22,��������С��30���˵���Ϣд�뵽perosn.txt��,
	person.txtÿ�����ݸ�ʽΪ:����=����
 */
public class Test13 {
	public static void main(String[] args) throws IOException {
		// 1.����HashMap����key�������,value�������
		HashMap<String, Integer> hm = new HashMap<>();

		// 2.ʹ��put������Ӷ�Ӧ��Ԫ��
		hm.put("����", 23);
		hm.put("����", 24);
		hm.put("����", 15);
		hm.put("����", 36);
		hm.put("����", 17);
		hm.put("����", 57);
		hm.put("�ܰ�", 35);
		
		// 3.ʹ��put���ܰ˵������޸�Ϊ22
		hm.put("�ܰ�", 22);
		
		// 4.����BufferedWriter�ַ������
		BufferedWriter bw = new BufferedWriter(new FileWriter("person.txt"));
		
		// 5.ʹ��keySet����HashMap����
		Set<String> keySet = hm.keySet();
		for (String key : keySet) {
			// 6.����key��ȡ����Ӧ��value
			Integer age = hm.get(key);
			if(age  < 30){
				// 7.��key��value����ʽƴ�Ӻ�д�뵽person.txt�ļ���
				bw.write(key + "=" + age);
				bw.newLine();
			}
		
		}
		
		// 8.�ر���
		bw.close();
	}

}