package prototype;

import java.util.Random;

//这种不通过new对象，通过对象复制来实现的模式就叫做原型设计模式
//在实际项目中，原型模式很少单独出现，一般是和工厂方法模式一起出现，通过clone的方法创建一个对象，
//然后由工厂方法提供给调用者
//注意：要使用clone方法，类成员变量上不要增加final关键字
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mail mail = new Mail(new AdvTemplate());
		mail.setTail("xx版权所有");
		for (int i = 0; i < 10; i++) {
			Mail cloneMail = mail.clone();
			cloneMail.setAppellation(getRandString(5) + " 先生（女士） ");
			cloneMail.setReceiver(getRandString(5) + "@" + getRandString(8) + ".com");
			// 发送邮件
			sendMail(cloneMail);
		}
	}

	// 发送邮件
	public static void sendMail(Mail mail) {
		System.out.println("标题：" + mail.getSubject() + "\t收件人:" + mail.getReceiver() + "\t.....send Success!");
	}

	// 获得指定长度的随机字符串
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
