package week3.day1;

public class Chrome extends Browser{

	
	public void openIncognito()
	{
		System.out.println("Incognito mode on");
	}
	
	
	public void clearCache()
	{
		System.out.println("Cache cleared");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Chrome chromed = new Chrome();
		chromed.closeBrowser();
		chromed.navigateBack();
		chromed.openURL();
		chromed.openIncognito();
		chromed.clearCache();
		System.out.println("Broswer : "+ browsername + " and Verison : " + browserversion);
		
		
	}

}
