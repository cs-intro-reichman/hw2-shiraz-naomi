// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int num = Integer.parseInt(args[0]);
		String type = args[1];
		int current = 0;
		if (type.equals("v")) {
			for (int j = 1; j <= num; j++) {
				current = j;
				int count = 1;
				System.out.print(current);
				 if (current == 1) {
                    System.out.print(" 4 2 1");
                    count = 4;
					
				while (current != 1) {
					if (current % 2 == 0) {
						current = current / 2;
					} else {
						current = current * 3 + 1;
					}
					System.out.print(" " + current);
					count++;
				}

				System.out.println(" (" + count + ")");
			}
		}
		System.out.println("Every one of the first " + num + " hailstone sequences reached 1.");
	}
}
