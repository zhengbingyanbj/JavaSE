package cn.itcast03.fileutils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

/*
 *  �ڿ����� �ܶ���� ִ�еĲ��� ����һ����  
 *    ��Ҷ�ʹ�����ֲ��� 
 *      ���ʱ����Щ��֯ ���� ��������֯   ���׷棩
 *      �Ѻܶ๦�ܽ�����ʵ��    ��װ��һЩ���� 
 *      
 *      ֻҪ���ǿ����ҵ���Щ�� ���ñ���д�õķ���  ���ǾͲ���д��
 *      
 *      ��ô ��ôʹ�ñ��˵�����  
 *      
 *      ���˵���  д��jar���� 
 *       ��һ��ѹ���ļ�  
 *        .class��ѹ���ļ� 
 *        
 *        commons-io-2.4.jar
 *      �������� ����  
 *        1���ڵ�ǰ��Ŀ�� ����һ���ļ��� lib
 *        2������commons-io-2.4.jar��lib��
 *        3�������jar���Ҽ� build path--add to build path
 *           ����С��ƿ ��OK �� 
 *           
 *         FileUtils ������   ר�Ű���������� �ļ�һЩ������ 
 *         �������Ǿ�̬
 *         
 *         readFileToString(File file)����ȡ�ļ����ݣ�������һ��String��
 *         writeStringToFile(File file��String content)��������contentд�뵽file�У�
 *         copyDirectoryToDirectory(File srcDir,File destDir);�ļ��и���
 *         copyFile(File srcFile, File destFile): �ļ�����
 */
public class FileUtilsDemo {
        public static void main(String[] args) throws IOException {
//			//һ�仰�㶨�ļ����� 
//        	File srcFile = new File("���챦��v6.0(���߳�����).java");
//        	File destFile = new File("����.java");
//        	
//        	FileUtils.copyFile(srcFile, destFile);
//        	
//        	File srcDir = new File("�ؾ���");
//        	File destDir = new File("��ѧ��");
//		    FileUtils.copyDirectoryToDirectory(srcDir, destDir);//������Դ�ļ��� ���Ƶ�Ŀ���ļ���
		    
		    
		    File srcDir = new File("�ؾ���");
        	File destDir = new File("ҩ����");
		    FileUtils.copyDirectory(srcDir, destDir);//��Դ�ļ��������� ���Ƶ�Ŀ���ļ���
        }
}
