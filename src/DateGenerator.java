/**
 * This class is to process length of a text.
 * 
 * @author sitiaishah
 *
 */
public class DateGenerator {

	
	/**
	 * This method count the number of texts and returns it to the client.
	 * 
	 * 
	 */
	public String getCurrentDate() {
		
		//String currentDate = new Date().toString();
		
		//return currentDate;
		
		String text = "Hello, my name is Siti Aishah!";
		String length = String.valueOf(count(text));
		
		return length;
	}
	
	public static int count(String text) {
		
		if (text == null || text.isEmpty()) {
			
			return 0;
		}
		
		String[] words = text.split("\\s+");
		return words.length;
	}
	
}
