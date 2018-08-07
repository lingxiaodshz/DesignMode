package prototype;

import java.util.Random;

//���ֲ�ͨ��new����ͨ����������ʵ�ֵ�ģʽ�ͽ���ԭ�����ģʽ
//��ʵ����Ŀ�У�ԭ��ģʽ���ٵ������֣�һ���Ǻ͹�������ģʽһ����֣�ͨ��clone�ķ�������һ������
//Ȼ���ɹ��������ṩ��������
//ע�⣺Ҫʹ��clone���������Ա�����ϲ�Ҫ����final�ؼ���
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mail mail = new Mail(new AdvTemplate());
		mail.setTail("xx��Ȩ����");
		for (int i = 0; i < 10; i++) {
			Mail cloneMail = mail.clone();
			cloneMail.setAppellation(getRandString(5) + " ������Ůʿ�� ");
			cloneMail.setReceiver(getRandString(5) + "@" + getRandString(8) + ".com");
			// �����ʼ�
			sendMail(cloneMail);
		}
	}

	// �����ʼ�
	public static void sendMail(Mail mail) {
		System.out.println("���⣺" + mail.getSubject() + "\t�ռ���:" + mail.getReceiver() + "\t.....send Success!");
	}

	// ���ָ�����ȵ�����ַ���
	public static String getRandString(int maxLength) {
		String source = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		StringBuffer sb = new StringBuffer();
		Random rand = new Random();
		for (int i = 0; i < maxLength; i++) {
			sb.append(source.charAt(rand.nextInt(source.length())));
		}
		return sb.toString();
	}
}
