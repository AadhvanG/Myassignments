package week3.day1;

public class Edge extends Browser{

	static String browsername="Edge";

	public void takeSnap()
	{
		System.out.println("Snapshot captured");
	}
	
	
	public void clearCookies()
	{
		System.out.println("Cookies cleared");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Edge edgeb = new Edge();
		edgeb.closeBrowser();
		edgeb.navigateBack();
		edgeb.openURL();
		edgeb.takeSnap();
		edgeb.clearCookies();
		System.out.println("Broswer : "+ browsername + " and Verison : " + browserversion);
		
		
	}

}
