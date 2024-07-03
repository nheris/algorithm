
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=a;i++) {
			for(int j=0; j<a-i;j++) {
				System.out.printf(" ");
			}
			for(int k=0; k<i*2-1;k++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		for(int i = a-1; i >= 0 ; i--) {
			for(int j=0; j<a-i;j++) {
				System.out.printf(" ");
			}
			for(int k=0; k<i*2-1;k++) {
				System.out.printf("*");
			}
			System.out.println();
		}

	}
}