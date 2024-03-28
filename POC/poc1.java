package POC;
import java.util.*;

public class poc1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.

        Stack<String> myStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            String stackitm = "";
            if (s.charAt(i) != ' ') {
                stackitm += s.charAt(i);
            } else {
                myStack.push(stackitm);
                stackitm = "";
            }
        }

            List<String> myList = new ArrayList<>(myStack);

            for (String string : myList) {
                System.out.println("\n" + string);
            }
            scan.close();
        }
}
