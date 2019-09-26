import java.util.Scanner;

public class mai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = "Hello World";
        System.out.println("Enter the word you are looking for: ");
        //String guess = input.nextLine();
        int count = 0;
        char character = input.next().charAt(0);

        for (int i = 0; i < str.length(); i++) {
            if (character == str.charAt(i)) {
                count += 1;
            }
        }
        System.out.println("String has " + count + " " + character);
    }
}
