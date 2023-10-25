/* 10828 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Stack;


public class Main {
	public void solution() throws Exception{
		Stack<Integer> s = new Stack<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        /* What I Learned : StringBuilder */
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < N; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	String command = st.nextToken();
        	
        	if (command.equals("push")) {
        		int num = Integer.parseInt(st.nextToken());
                s.push(num);
        	}
        	else if (command.equals("pop")) {
        		if (s.isEmpty()) {
                    sb.append(-1).append('\n');
                } else {
                    sb.append(s.pop()).append('\n');
                }
        	}
        	 else if (command.equals("size")) {
                 sb.append(s.size()).append('\n');
             } else if (command.equals("empty")) {
                 if (s.isEmpty()) {
                     sb.append(1).append('\n');
                 } else {
                     sb.append(0).append('\n');
                 }
             } else if (command.equals("top")) {
                 if (s.isEmpty()) {
                     sb.append(-1).append('\n');
                 } else {
                     sb.append(s.peek()).append('\n');
                 }
             }
        	else {
        		continue;
        	}   
       
        }
        System.out.println(sb);          
	}
	
	public static void main(String[] args) throws Exception{
		new Main().solution();
	}

}
