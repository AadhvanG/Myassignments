package week3.day1;

public class Browser {

	static int browserversion= 10;
	static String browsername="Chrome";
	
	public void openURL()
	{
		System.out.println("URL OPENED");
	}
	
	public void closeBrowser() {
		System.out.println("Browser closed");
	}
	
	public void navigateBack()
	{
		System.out.println("Navigated back");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Browser run = new Browser();
		run.closeBrowser();
		run.navigateBack();
		run.openURL();
		
		
		
	}

}
