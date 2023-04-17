package week3.day2abstraction;

public class samsung extends AndroidTv {

	public static void main(String[] args) {
		samsung sam = new samsung();
             sam.openapp();
             sam.playvideo();
	}

	public void playvideo() {
		System.out.println("play my video");
		
	}

}
