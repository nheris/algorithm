import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		int len = str.length();
		int num = 0;
 
		for (int i = 0; i < len; i++) {
 
			char cha = str.charAt(i);
 
			if(cha == 'c' && i < len - 1) {	
				if(str.charAt(i + 1) == '=' || str.charAt(i + 1) == '-') {		
					i++;		
				}
				
			}
		    
			else if(cha == 'd' && i < len - 1) {
				if(str.charAt(i + 1) == '-') {	
						i++;
					}
				else if(str.charAt(i + 1) == 'z' && i < len - 2) {
					
					if(str.charAt(i + 2) == '=') {	
						i += 2;
					}
				}
			}
		    
			else if((cha == 'l' || cha == 'n') && i < len - 1) {
				if(str.charAt(i + 1) == 'j') {
					i++;
				}
			}
		    
 
			else if((cha == 's' || cha == 'z') && i < len - 1) {
				if(str.charAt(i + 1) == '=') {
					i++;
				}
			
		    }
		    
			num++;
 
		}
 
		System.out.println(num);
	}
}
