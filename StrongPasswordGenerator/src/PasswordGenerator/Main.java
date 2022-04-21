package PasswordGenerator;

import java.util.Random;

public class Main {
	

	public static void main(String[] args) {
		
		char[]symbols= {'!','#','%',';','?','*','-','+','/','&','<','>','|','[',']','=','@','_','€','$',':','\'',};
		int []numbers= {0,1,2,3,4,5,6,7,8,9};
		
		
		
		
		System.out.println(generatePassword(symbols,numbers));
		
		
		
		

	}
	
	static String generatePassword(char[]symbols, int[]numbers) {
			Random random=new Random();
			String password="";
			
			
		for(int i=0;i<6;i++) {
			
				password+=""+symbols[random.nextInt(0,symbols.length)];
				
				password+=""+numbers[random.nextInt(0,numbers.length)];
				
				char c = (char)(random.nextInt(26) + 'a');
				c=Character.toUpperCase(c);
				password+=""+c;
				
				c = (char)(random.nextInt(26) + 'a');
				password+=""+c;
				
			
		}
		
		return password;
		
		
		
		
		
	}

}
