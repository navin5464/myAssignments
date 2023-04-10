package week3.day1inheritance;

public class Mobile {
	
	public void sendmsg()
	{
		System.out.println("Good morning ppl");
	}
    public void makecall() 
    {
		System.out.println("call my friend1");
	}
    public void savecontact() 
    {
	    System.out.println("save the contact2");}

	public static void main(String[] args) {
		Mobile m = new Mobile();
            m.sendmsg();
            m.makecall();
            m.savecontact();
	}

}
