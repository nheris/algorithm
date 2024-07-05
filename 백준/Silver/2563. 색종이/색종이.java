import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String[] args) throws IOException {
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean[][] arr = new boolean[101][101];
		
		int num = Integer.parseInt(br.readLine()); //종이 수
		int x = 0;
		int y = 0;
		int over = 0; //해당부분
		
		StringTokenizer st;
		
		for(int i=0; i<num; i++) {
			st = new StringTokenizer(br.readLine()," ");
			x= Integer.parseInt(st.nextToken());
			y= Integer.parseInt(st.nextToken());
			
			for(int j=x; j<(x+10);j++) {
				for(int k=y; k<(y+10);k++) {
					if (!arr[j][k]) {
                        arr[j][k] = true;
                        over++;
                    }
				}
			}
			
		}
		br.close();
		System.out.print(over);

	}
}