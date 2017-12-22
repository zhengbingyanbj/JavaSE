package level02_10;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/*
	ͨ������¼������˵�����,ÿ��¼��һ���˵�����,�������һ���ɼ�[0, 100](����0��,Ҳ����100��).
	�������ͳɼ��洢��Map������,������Ϊkey,�ɼ���Ϊvalue.ͳ�����ѧ�����ܷ�,��߷�,��ͷ�,ƽ����,
	�����ܷ�,��߷�,��ͷ�,ƽ����,д�뵽score.txt�ļ���,��ʽΪ:��߷�=xxx,��ͷ�=xxx,ƽ����=xxx
 */
public class Test10 {
	public static void main(String[] args) throws IOException {
		// 1.���������������
		Scanner sc = new Scanner(System.in);
		
		// 2.�������������
		Random ran = new Random();
		
		// 3.����HashMap����key�������,value��ųɼ�
		HashMap<String, Integer> hm = new HashMap<>();
		
		// 4.ѭ���ж�HashMap�������Ƿ�С��5
		while (hm.size() < 5) {
			System.out.println("������һ��ѧ��������:");
			
			// 5.���HashMap������С��5,���û�������һ������
			String name = sc.next();
			
			// 6.ʹ�����������һ���ɼ�
			int score = ran.nextInt(101);
			
			// 7.�������ͷ�����ӵ�HashMap��
			hm.put(name, score);
		}
		
		// 8.ʹ�õ�������ȡһ����
		String k = hm.keySet().iterator().next();
		// 9.ͨ�����ҵ���Ӧ�ķ���,��ΪĬ�Ϸ���
		Integer defaultScore = hm.get(k);
		
		// 10.�����ֱַܷ���
		int totalScore = 0;
		
		// 11.������߷ֱ���=Ĭ�Ϸ���
		int maxScore = defaultScore;
		
		// 12.������ͷֱ���=Ĭ�Ϸ���
		int minScore = defaultScore;
		
		// 13.ʹ��keySet��ȡ�����е�key
		Set<String> keySet = hm.keySet();
		
		// 14.ʹ����ǿfor�������е�key
		for (String key : keySet) {
			// 15.����key�ҵ���Ӧ��value
			Integer value = hm.get(key);
			
			// 16.�����������ӵ��ܷ�
			totalScore += value;
			
			// 17.�����߷�С���������,����߷�=�������
			if (maxScore < value) {
				maxScore = value;
			} else if (minScore > value) {
				// 18.�����ͷִ����������,����ͷ�=�������
				minScore = value;
			}
		}
		
		// 19.����ƽ����
		int avg = totalScore / hm.size();
		
		// 20.����StringBuilder,����ƴ��,�ܷ�,��߷�,��ͷ�,ƽ�����ַ���
		StringBuilder sb = new StringBuilder();
		sb.append("�ܷ�=").append(totalScore).append(",��߷�=").append(maxScore).append(",��ͷ�=").append(minScore).append(",ƽ����=").append(avg);
		
		// 21.����FileWriter�ַ������
		FileWriter fw = new FileWriter("score.txt");
		
		// 22.ʹ���ַ��������ƴ�Ӻõ��ַ���д���ļ���
		fw.write(sb.toString());
		
		// 23.�ر���
		fw.close();
	}

}