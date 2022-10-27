
public class P43 {
	public static void main(String[] args) {
		int []money = {222,922,228,22222,9321};
		for (int i = 0;i<money.length;i++) {
			System.out.println("person " + (money.length - 5 + i + 1) + " have: " + money[i]);
		}
		System.out.println("total: " + money.length + " person");
	}
}
