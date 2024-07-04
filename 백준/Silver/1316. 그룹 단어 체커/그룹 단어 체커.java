
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		
		int a = Integer.parseInt(br.readLine());
		
		int num =0; //그룹단어
		
		//단어 수 마다
		for(int i =0;i<a;i++) {
			if(check()) {
				num++;
			}
		}
		
		System.out.println(num);

	}
	public static boolean check() throws IOException {
		int[] arr = new int[26];
		String str = br.readLine();
			
		//철자
		for(int j =0;j<str.length();j++) {
			if(arr[str.charAt(j)-'a']==0||str.charAt(j)==str.charAt(j-1)) {
				arr[str.charAt(j)-97] = 1;
			}
			else {
				return false;	
			}
		}
		
		return true;
			
	}
	
}




