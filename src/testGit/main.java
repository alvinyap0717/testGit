package testGit;

public class main {

	public static void main(String[] args) {
		System.out.println("This is a git test project");
		System.out.println("This is new line feature1");
		System.out.println("This is new items from master");
		System.out.println(showItem());
		System.out.println("newthings");
	}
	
	public static String showItem() {
		return "new things from feature2";
	}
}
