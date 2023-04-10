package week3.day1inheritance;

public class Androidphone extends Mobile {
	public void takevideo()
	{
		System.out.println("start to take video");
	}

	public static void main(String[] args) {
		Androidphone ap = new Androidphone();
		ap.takevideo();
		ap.sendmsg();
		ap.makecall();
		ap.savecontact();

	}

}
