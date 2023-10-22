/* 10808 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.List;


public class Main {
	public void solution() throws Exception{
		int[] data = new int[26];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        
        /* What I Learned : toCharArray()*/
        for(char alphabet : word.toCharArray()) {
        	if ('a' <= alphabet && alphabet <= 'z') {
                int index = alphabet - 'a';
                data[index] += 1;
            }
        }
        
        for(int count : data) {
        	System.out.print(count + " ");
        }
        
        
             
	}
	
	public static void main(String[] args) throws Exception{
		new Main().solution();
	}

}
