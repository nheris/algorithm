import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {     
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		Queue<Integer> q = new LinkedList<>();
		
		StringBuilder sb = new StringBuilder();
		
		int last = 0;
		while(N-- > 0) {
			String str = br.readLine();
			if(str.startsWith("push")) {
				int value = Integer.parseInt(str.split(" ")[1]);
                q.add(value);
                last = value;
			}
			else if(str.equals("pop")) sb.append(q.isEmpty()?"-1":q.remove()).append('\n');
			else if(str.equals("size")) sb.append(q.size()).append('\n');
			else if(str.equals("empty")) sb.append(q.isEmpty()?"1":"0").append('\n');
			else if(str.equals("front")) sb.append(q.isEmpty()?"-1":q.peek()).append('\n');
			else sb.append(q.isEmpty()?"-1":last).append('\n');
		}
		
		System.out.println(sb);
	}
}
