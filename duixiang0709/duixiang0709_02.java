package duixiang0709;
/*
 * ��ȡ�ʼǱ������ԣ���ʹ�����ַ�������ʾ�ʼǱ�����Ϣ
 */
public class duixiang0709_02 {

	public static void main(String[] args) {
		duixiang0709_conputer no1=new duixiang0709_conputer();
		
		no1.name="��˶";
		no1.price=13212.5;
		no1.chanDi="����";
		
		//��һ�������ʽ
		no1.show1(no1);
		
		//�ڶ��������ʽ
		no1.show2(no1.name,no1.price,no1.chanDi);
		
		//������
		no1.show3();

	}

}
