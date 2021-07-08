package testGit;

public class main {

	public static void main(String[] args) {
		System.out.println("This is a git test project");
		System.out.println("This is new line feature1");
<<<<<<< HEAD
		System.out.println(showItem());
	}
	
	public static String showItem() {
		return "new things from feature2";
=======
		System.out.println("This is new items from master");
>>>>>>> 08f030d (new items from master)
	}

}
