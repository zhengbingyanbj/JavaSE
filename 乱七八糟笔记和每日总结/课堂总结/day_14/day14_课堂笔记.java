֪ʶ�㣺
	�����̣�
		רҵ����Java����(�������)��ʵ�����绥���Ĳ�ͬ����������еĳ������Խ������ݽ���(����)��
		��׻�����Java����ʵ�ֲ�ͬ�����������ݽ���(����)��
		
		����Ҫ�أ�
			IP�� InetAddress
				�������豸��������Ψһ��ʶ
				��ɣ�����(��)���� + ������ַ
				���ࣺ
					��������1 + 3
					��������2 + 2
					��������3 + 1
				���������IP��
					127.0.0.1			//���ػػ�(·)��ַ
					255.255.255.255		//�㲥��ַ
				�������õ�DOS���
					ping IP -t:		//��������
					ipconfig /all	//�鿴����IP

				 String  <---> InetAddress ֮���ת��  //����
						static InetAddress getByName(String nameOrIP);  //��������������IP��ַ��ȡ���Ӧ�� IP��ַ����
						public String getHostAddress();					//����IP��ַ�����ȡ���Ӧ�� �ַ�����ʽ��IP
					

			�˿ںţ�
				�������������豸�е�Ψһ��ʶ
				��Χ�� 0-65535 (һ����65536���˿�)
				ע�⣺ 0-1024�Ѿ���ϵͳռ���˻������������˿ڣ������Լ�д�˿ںŵ�ʱ��Ҫд�����Χ�ġ�
				80��	httpЭ�������˿�
				3306	mysql�Ķ˿ں�  
				
			Э�飺
				UDP��
					����������
					�������ݲ������ݱ�������ʽ(ÿ�����Ĵ�С���ܳ���64KB)
					����ȫ(���ɿ�)Э��
					Ч�ʸ�
					�����ֿͻ��˺ͷ�������(�У����Ͷ˺ͽ��ն�)

				TCP��
					����������(��������)
					�������ݲ���IO���ķ�ʽ(û�д�С����)
					��ȫ(�ɿ�)Э��
					Ч�ʵ�
					���ֿͻ��˺ͷ�������
						Socket   ServerSocket

�����⣺
	1��ʲô�������̣�

	2���˿ںŵķ�Χ�Ƕ��٣� �ĸ��Ŷβ�Ҫ��?
		0-65535.   0-1024.
		��Ϊ�Ѿ���ϵͳռ���ˣ��������������˿ڡ�

	3��TCPЭ���UDPЭ���������ʲô��

��ϰ�⣺
	1��UDP�������ݣ�
		���Ͷˣ�
			A���������Ͷ˵�Socket����
				public DatagramSocket();

			B: �������Ͷ˵����ݱ���������߷�װ����Ҫ���͵����ݺ���Ϣ��
				public DatagramPacket(byte[] bys,int length,InetAddress inet,int port);

			C: ���� DatagramSocket ��� send()�����������ݱ������ɡ�
				public void send(DatagramPacket dp);

			D���ͷ���Դ��

		���նˣ�
			A���������ն˵�Socket���� ָ���˿ںţ����Ҷ˿ں�Ҫ�ͷ��Ͷ�һ��
				public DatagramSocket(int port);

			B: �������ն˵����ݱ���������߷�װ����Ҫ�����������ݵ����顣
				public DatagramPacket(byte[] bys,int length);

			C: ���� DatagramSocket ��� receive()�����������ݱ������ɡ�
				public void receive(DatagramPacket dp);

			D�������
				DatagramPacket:
					getLength();	//��ȡ��Ч�ֽ���
					getAddress();	//��ȡ���Ͷ˵�IP��ַ����
					getPort();		//��ȡ���Ͷ˵Ķ˿ں�

			E���ͷ���Դ��


TCPЭ�鴫�����ݣ�
	�ͻ��ˣ�  Socket
		1�������ͻ���Socket����ָ��������IP�Ͷ˿ںš�
			public Socket(String ip,int port);
		2��ͨ��Socket���е�  getOutputStream() �� getInputStream()��ȡ�ͷ��������н���������
			public OutputStream getOutputStream();	//������������д���ݡ�
			public InputStream getInputStream();	//���Զ�������д����������

	�������ˣ�
		//һ���������˿��Է������ͻ��ˡ�
		1��������������Socket����(ServerSocket)��ָ���˿ںš�
			public ServerSocket(int port);

		2��ͨ��ServerSocket���е� accept()����ȡ�ͻ��˵�Socket����

		3��ͨ��Socket���е�  getOutputStream() �� getInputStream()��ȡ�Ϳͻ��˽��н���������
			public OutputStream getOutputStream();	//�������ͻ���д���ݡ�
			public InputStream getInputStream();	//���Զ��ͻ���д����������

������ҵ��
	1�������署�� UDP�������ݵķ�ʽ��ϵ�¡�
	2����ʱ���ˣ��ο����µĸ�ʽ��������һ�� TCP�������ݡ�
		�ͻ��ˣ�
			1�������ͻ��˵� Socket ����,ָ��IP�Ͷ˿ںš�   
			2��ͨ�� Socket ���е� getInputStream() �� getOutputStream()���Ի�ȡ�� �������������(����)����
				�ͻ��˵��������� 
					���Զ�ȡ �������˵� �����д��������
					//���Զ���������д����������
				�ͻ��˵��������
					����д�� ���ݵ� �������˵�������
					//��������������д����

		�������ˣ�
			1�������������˵�Socket���� (ServerSocket)��ָ���˿ں�
			2����������(accept()),����пͻ����������ӣ��ʹ���һ��Socket���Ϻ͸ÿͻ��˵�ͨ�š�
			3��ͨ�� Socket ���е� getInputStream() �� getOutputStream()���Ի�ȡ�� �ͻ��������(����)����
				�������˵��������� 
					���Զ�ȡ �ͻ��˵� �����д��������
					//���Զ� �ͻ���д����������
				���������������
					����д�� ���ݵ� �ͻ��˵�������
					//�������ͻ���д����
		
		//Socket#shutdownOutput()   ���ø��׽��ֵ� �������

	3����Ϣ��������־�����