package week1.day1;

public class Car {
	
    public void drivecar()
	{
		System.out.println("Driving the car forward");
	}
    public void applybrake() 
    {
		System.out.println("brake to be applied immediately");
	}
    public void soundhorn() 
    {
	    System.out.println("press horn");
	}
    public void ispuncture() 
    {
		System.out.println("tyre is flat");
	}

	public static void main(String[] args) {
		  Car name = new Car();
              
		     name.drivecar();
		     name.soundhorn();
		     name.applybrake();
		     name.ispuncture();
	}

}
