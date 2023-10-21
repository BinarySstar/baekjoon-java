/* 1158 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Deque;
import java.util.LinkedList;


public class Main {
	public void solution() throws Exception{
		Deque<Integer> people = new LinkedList<>();
		Deque<Integer> removePeople = new LinkedList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
        for (int i = 1; i <= N; i++) {
            people.offer(i);
        }
        
        int count = 0;
        while (!people.isEmpty()) {
            count++;
            int data = people.poll();
            if (count == K) {
                removePeople.offer(data);
                count = 0;
            } else {
                people.offer(data);
            }
        }
        
        StringBuilder result = new StringBuilder();
        result.append("<");
        while (!removePeople.isEmpty()) {
            result.append(removePeople.poll());
            if (!removePeople.isEmpty()) {
                result.append(", ");
            }
        }
        result.append(">");
        System.out.println(result);
           
	}
	
	public static void main(String[] args) throws Exception{
		new Main().solution();
	}

}
