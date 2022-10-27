import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P45 {
	public static void main(String[] args) throws IOException {
		System.out.println("please input five int");
		int []a = new int[5];

		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i = 0; i<=4; i++) {
			String str = br1.readLine();
			a[i] = Integer.parseInt(str);
		}
		
		for(int j = 0;j<a.length-1;j++) {
			for(int k = j+1; k < a.length;k++) {
				if (a[k]>a[j]) {
					int b = a[k];
					a[k] = a[j];
					a[j] = b;
				}
			}
		}
		for(int y= 0; y <a.length ; y ++)
			System.out.println("名次: 第" + (y+1) + " 名 分數: " + a[y]);

	}
}
