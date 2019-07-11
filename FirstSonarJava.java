
import java.io.File;
import java.io.IOException;

public class FirstSonarJava {

	public static final String abc="";
	public static String [] strings1 = {"first","second"};
	
	
	public static void main(String[] args) {
		String MayBeNull = null;
		System.out.println("Hello SonarQube "+MayBeNull);
		
		//this is not a valid loop
		for (int i = 11; i < 15; i++) { 
			System.out.println("Loop not true  even once");
		}
			
	}
	


}
