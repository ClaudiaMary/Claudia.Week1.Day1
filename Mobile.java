package week1.day1;

public class Mobile {
	
	public static void main(String[] args) {
		
		Mobile getData = new Mobile();
		getData.saveContact();
		getData.sendMessage();
		getData.makeCall(9500003228L);
		String msg = getData.sendMessage();
		System.out.println(msg);
		
	}
	
	public void saveContact() {
		long contactNo=9840492726L;
		System.out.println(contactNo);
			}
	
	private String sendMessage() {
		String messageToSend = "Selenium Course Jan Batch";		
		return messageToSend;		
	}
	
	void makeCall(long numberToCall) {
		System.out.println(numberToCall);
	}
}
