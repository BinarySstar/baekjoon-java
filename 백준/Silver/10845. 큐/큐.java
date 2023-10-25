/* 10845 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.LinkedList;
import java.util.Queue;


public class Main {
	public void solution() throws Exception{
		Queue<Integer> queue = new LinkedList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        /* What I Learned : StringBuilder */
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < N; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	String command = st.nextToken();
        	
        	if (command.equals("push")) {
                int num = Integer.parseInt(st.nextToken());
                queue.offer(num);
            } else if (command.equals("pop")) {
                if (queue.isEmpty()) {
                    sb.append(-1).append('\n');
                } else {
                    sb.append(queue.poll()).append('\n');
                }
            } else if (command.equals("size")) {
                sb.append(queue.size()).append('\n');
            } else if (command.equals("empty")) {
                if (queue.isEmpty()) {
                    sb.append(1).append('\n');
                } else {
                    sb.append(0).append('\n');
                }
            } else if (command.equals("front")) {
                if (queue.isEmpty()) {
                    sb.append(-1).append('\n');
                } else {
                    sb.append(queue.peek()).append('\n');
                }
            } else if (command.equals("back")) {
                if (queue.isEmpty()) {
                    sb.append(-1).append('\n');
                } else {
                    int last = 0;
                    for (int num : queue) {
                        last = num;
                    }
                    sb.append(last).append('\n');
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
