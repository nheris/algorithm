import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

 
public class Main {
	public static void main(String[] args) throws IOException {
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int row = Integer.parseInt(st.nextToken());
		int col = Integer.parseInt(st.nextToken());
		int[][] arr1 = new int[row][col];
		int[][] arr2 = new int[row][col];
		
		for(int i=0; i<row;i++) {
			st = new StringTokenizer(br.readLine()," ");
			for(int k=0; k<col;k++) {
				arr1[i][k] = Integer.parseInt(st.nextToken());
			}
		}
		for(int i=0; i<row;i++) {
			st = new StringTokenizer(br.readLine()," ");
			for(int k=0; k<col;k++) {
				arr2[i][k] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=0; i<row;i++) {
			for(int k=0; k<col;k++) {
				System.out.printf(arr1[i][k] + arr2[i][k] +" ");
			}
			System.out.println();
			
		}
		
		br.close();
	}
}