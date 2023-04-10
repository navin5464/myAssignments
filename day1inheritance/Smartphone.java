package week3.day1inheritance;

public class Smartphone extends Androidphone{
	public void connectwhatsapp()
	{
		System.out.println("connect and use whatsapp");
	}
	public void takevideo() {
		System.out.println("take a new video");
	}

	public static void main(String[] args) {
		Smartphone sp = new Smartphone();
		sp.connectwhatsapp();
		sp.takevideo();
		sp.sendmsg();
		sp.makecall();
		sp.savecontact();
				

	}

}
