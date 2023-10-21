/* 1475 */
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
	public void solution() throws Exception{
		int[] count = new int[10];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        
        for(char c : N.toCharArray()) {
        	int index = c - '0';
        	count[index]++;
        }
        
        count[6] = (int)(count[6] + count[9] + 1) / 2;
        count[9] = 0;
        
        int max = count[0];
        for(int i: count) {
        	if(i > max) {
        		max = i;
        	}
        }
        System.out.println(max);
	}
	
	public static void main(String[] args) throws Exception{
		new Main().solution();
	}

}
