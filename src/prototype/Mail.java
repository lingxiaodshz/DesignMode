package prototype;

//原型设计模式需要实现Cloneable接口，重写clone方法
public class Mail implements Cloneable{

	private String receiver;
	private String subject;
	private String appellation;
	private String contxt;
	private String tail;
	
	public Mail(AdvTemplate advTemplate ) {
		// TODO Auto-generated constructor stub
		this.contxt = advTemplate.getAdvContxt();
		this.subject = advTemplate.getAdvSubject();
	}
	
	@Override
	protected Mail clone(){
		// TODO Auto-generated method stub
		Mail mail = null;
		try {
			mail = (Mail) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return mail;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getAppellation() {
		return appellation;
	}

	public void setAppellation(String appellation) {
		this.appellation = appellation;
	}

	public String getContxt() {
		return contxt;
	}

	public void setContxt(String contxt) {
		this.contxt = contxt;
	}

	public String getTail() {
		return tail;
	}

	public void setTail(String tail) {
		this.tail = tail;
	}
	
	
}
