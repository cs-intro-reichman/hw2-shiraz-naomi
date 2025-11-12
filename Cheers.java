
public class Cheers {
        public static void main(String[] args) {
                String word = args[0];
                int n = Integer.parseInt(args[1]);
                word = word.toUpperCase();
                String useAn = "AEFHILMNORSX";

                for (int i = 0; i < word.length(); i++) {
                        System.out.print("Give me ");
                        char c = word.charAt(i);
                        if (useAn.indexOf(c) != -1) {
                                System.out.println("an " + c + "!");
                        } else {
                                System.out.println("a " + c + "!");
                        }

                }

                System.out.println("What does that spell?");
                for (int i = 0; i < word.length(); i++) {
                        System.out.println(word + "!!!");
                }
        }
}
