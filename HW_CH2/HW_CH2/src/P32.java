import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P32 {
	public static void main(String[] args) throws IOException {
		System.out.println("input the int to stop the for loop(1~10)");

		BufferedReader b = new 
				BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(b.readLine());
		for(int i = 1; i<=10; i++) {
			System.out.println("number " + i);
			if (i == num)
				break;
		}
	}
}
