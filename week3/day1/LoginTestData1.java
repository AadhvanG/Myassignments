package week3.day1;

public class LoginTestData1 extends TestData{

	public void enterUsername() {
		// TODO Auto-generated method stub
		System.out.println("UserName: ");
	}
	 public void enterPassword() {
		System.out.println("Password: ");// TODO Auto-generated method stub

	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     LoginTestData1 data1 = new LoginTestData1();
    		 data1.enterCredentials();
    		 data1.enterUsername();
    		 data1.enterPassword();
	}

}
