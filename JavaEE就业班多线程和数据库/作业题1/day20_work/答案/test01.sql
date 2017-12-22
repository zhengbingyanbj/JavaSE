-- ����1���������-������Ʒ��,product(���ƣ����̸�Ŀ¼�µ�SQL�ļ��У�������䵥��.txt)
		
		#��ѯ��Ʒ����Ϊ���������ӡ�����Ʒ������Ϣ��
    	SELECT * FROM product WHERE pname = '��������'

		#��ѯ�۸�Ϊ800��Ʒ
		SELECT * FROM product WHERE price = 800

		#��ѯ�۸���800��������Ʒ
		SELECT * FROM product WHERE price != 800
		SELECT * FROM product WHERE price <> 800
		SELECT * FROM product WHERE NOT(price = 800)

		#��ѯ��Ʒ�۸����60Ԫ��������Ʒ��Ϣ
		SELECT * FROM product WHERE price > 60;


		#��ѯ��Ʒ�۸���200��1000֮��������Ʒ
		SELECT * FROM product WHERE price >= 200 AND price <=1000;
		SELECT * FROM product WHERE price BETWEEN 200 AND 1000;

		#��ѯ��Ʒ�۸���200��800��������Ʒ
		SELECT * FROM product WHERE price = 200 OR price = 800;
		SELECT * FROM product WHERE price IN (200,800);

		#��ѯ����'��'�ֵ�������Ʒ
		SELECT * FROM product WHERE pname LIKE '%��%';

		#��ѯ��'��'��ͷ��������Ʒ
		SELECT * FROM product WHERE pname LIKE '��%';

		#��ѯ�ڶ�����Ϊ'��'��������Ʒ
		SELECT * FROM product WHERE pname LIKE '_��%';


		#��Ʒû�з������Ʒ
		SELECT * FROM product WHERE category_id IS NULL

		#��ѯ�з������Ʒ
		SELECT * FROM product WHERE category_id IS NOT NULL


-- 	������ϰ��
-- 		#1.ʹ�ü۸����Ʒ��Ϣ����(����)
-- 			��ʾ��ʹ��order by��� ,��ʽ:SELECT * FROM ���� ORDER BY �����ֶ� ASC|DESC;
			SELECT * FROM product p ORDER BY p.`price`; 
			SELECT * FROM product p ORDER BY p.`price` desc; 
			
-- 		#2.�ڼ۸�����(����)�Ļ����ϣ�����������(����)
-- 			��ʾ�����۸���ͬ����ͬ�۸��������pid�������򣬶༶����ǰ����� ǰ�������ֵ������ȣ��Ż���к��������
			SELECT * FROM product p ORDER BY p.`price` DESC, p.pid DESC;

-- 		#3.��ʾ��Ʒ�ļ۸�(ȥ�ظ�)��������(����)
-- 			��ʾ��DISTINCT �ؼ���ȥ�� ��desc��������
			SELECT DISTINCT p.`price` FROM product p ORDER BY p.`price` DESC;

-- 	�ۺϺ���/���麯����ϰ��
-- 		#1 ��ѯ��Ʒ��������(���ַ�ʽ)
-- 			��ʾ��ʹ��count(��ƷID)������ͳ�Ƽ�¼������ΪID��Ψһ����
			SELECT COUNT(*) FROM product;
			SELECT COUNT(p.`pid`) FROM product p;

-- 		#2 �鿴price��Ʒ���ܼ۸�
-- 			��ʾ��ʹ��sum(price);
			SELECT	SUM(p.`price`)	FROM product p;

			
-- 		#3 �鿴price�����ֵ����Сֵ
-- 			��ʾ��ʹ��max(price)  min(price)	
			SELECT MAX(p.`price`) FROM product p;
			SELECT MIN(p.`price`) FROM product p;
		
-- 		#4 �鿴price��ƽ��ֵ
-- 			��ʾ��ʹ�� AVG(price) 
			SELECT AVG(p.`price`) FROM product p; 			

-- 		#5 ��ѯ�۸����200��Ʒ��������
-- 			��ʾ��ʹ�� COUNT(*)ͳ��������������  WHERE price>200;
			SELECT  COUNT(*) FROM product p WHERE p.`price` > 200;
			

-- 	������ϰ��
		#1 ͳ�Ƹ���������Ʒ�ĸ���
			SELECT category_id ,COUNT(*) FROM product GROUP BY category_id ;
			
		#2 ͳ�Ƹ���������Ʒ�ĸ���,��ֻ��ʾ��������1����Ϣ
			SELECT category_id ,COUNT(*) FROM product GROUP BY category_id HAVING COUNT(*) > 1;
