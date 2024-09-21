package practice;

public class RemoveWhitespaces {
	
	public static void main(String[] args) {
		
		String str = " A u t o m a t i o n ";
		
		String result = str.replaceAll("\\s+", "");
		
		System.out.println(result);
		
	}
}