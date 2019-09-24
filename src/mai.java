import java.util.Scanner;
public class mai {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String[] str = {"Hello", "Hi", "How", "What", "How"};
        System.out.println("Enter the word you are looking for: ");
        String guess = input.nextLine();
        int count = 0;
        boolean isExit = false;
        for (int i = 0; i < str.length; i ++){
            if (str[i].equals(guess)){
                count++;
                isExit = true;
            }
        }
        if (isExit) {
            System.out.print("Your word: " + guess + ": " + count + " time");
        } else {
            System.out.print("not found");
        }
    }
}
