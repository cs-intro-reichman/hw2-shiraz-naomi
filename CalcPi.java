// Computes an approximation of PI.
public class CalcPi {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		double sum = 1;
		int term = -1;
		for (int i = 1; i <= n; i++) {
			sum += term * Math.pow(i + 2, -1);
			term = term * -1;
		}
		System.out.println(sum * 4);

	}
}
