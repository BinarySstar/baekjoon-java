import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.List;


public class Main {
	public void solution() throws Exception{
		List<Integer> data = new ArrayList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            data.add(num);
        }
        int findNumber = Integer.parseInt(br.readLine());
        
        int count = 0;
        for (int i : data) {
            if (findNumber == i) {
                count += 1;
            }
        }

        System.out.println(count);
             
	}
	
	public static void main(String[] args) throws Exception{
		new Main().solution();
	}

}
