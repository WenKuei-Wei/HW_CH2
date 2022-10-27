import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P34 {
	public static void main(String[] args) throws IOException {
		System.out.println("input the int to skip the number of the for loop(1~10)");

		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br1.readLine());
		for(int i = 1; i<=10; i++) {
			
			if (i == num)
				continue;
			System.out.println("number " + i);
		}
	}
}
