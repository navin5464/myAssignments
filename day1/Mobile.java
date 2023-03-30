package week1.day1;

public class Mobile {
	public void sendSms() {
		System.out.println("From OPPO");
	}
	public void hello() {
		System.out.println("helloMoto");

	}
	public void makecall( ) {
		System.out.println("calling my friend");
	}

	public static void main(String[] args) {
		Mobile n = new Mobile();
		n.hello();
		n.makecall();
		n.sendSms();
		
		Iphone p = new Iphone();
		p.makecall();
		p.model();
	}
	}
