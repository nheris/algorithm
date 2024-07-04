import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String[] args) throws IOException {
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[][] arr = new int[9][9];
		
		StringTokenizer st;
		int num =0;
		int max =0;
		int x = 0, y = 0;
		
		for(int i=0; i<9;i++) {
			st = new StringTokenizer(br.readLine()," ");
			for(int j=0; j<9;j++) {
				num = Integer.parseInt(st.nextToken());
				arr[i][j] = num;
				if(num>max)
					max = num;
			}
		}

		br.close();
		
		for(int i=0; i<9;i++) {
			for(int j=0; j<9;j++) {
				if(arr[i][j] == max) {
					x= i;
					y= j;
					
				}
			}
		}

		System.out.println(max);
		System.out.println((x+1)+" "+(y+1));
	}
}