package week3.day2;

public class JavaConnection implements DatabaseConnection{

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Connected to the DB connection");
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("Disconnected from the DB connection");
	}

	@Override
	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("Updated the scripts provided");
	}
public static void main(String[] args) {
	JavaConnection obj=new JavaConnection();
	obj.connect();
	obj.executeUpdate();
	obj.disconnect();
}
}
