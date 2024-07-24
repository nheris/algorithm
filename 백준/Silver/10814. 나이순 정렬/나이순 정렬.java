import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		int N = Integer.parseInt(br.readLine());
		
		Register[] r = new Register[N];
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int age = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			r[i] = new Register(age, name);
		}
		
		Arrays.sort(r, (o1,o2) -> {
			return o1.age - o2.age;
		});
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < N; i++) {
			sb.append(r[i]);
		}
		
		System.out.println(sb);
	}	
	
	public static class Register{
		int age;
		String name;
		
		public Register(int age, String name) {
			this.age = age;
			this.name = name;
		}
		
		@Override
		public String toString() {
			return age + " " + name + "\n";
		}
	}
	
	
}