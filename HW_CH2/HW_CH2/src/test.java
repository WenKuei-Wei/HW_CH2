import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test{
	public static void main(String[] args) throws IOException{
		BufferedReader a = new
				BufferedReader(new InputStreamReader(System.in));
		int t,i=1;
		
		
		do {		
			String str = a.readLine();
			t = Integer.parseInt(str);
			System.out.println("次數 "+i);
			i++;
		}while(t != 2022);
		
		
		System.out.println("你終於猜到t = "+t);
	}
}