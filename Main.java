//assignment 2
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //asking a line of text
        System.out.print("Enter a String: ");
        String str = scanner.nextLine();
        //creating a stack of characters
        Stack<Character> stack = new Stack<Character>();
        //looping through the string, adding each character to the stack
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        System.out.print("Reversed String: ");
        //now looping until stack is empty
        while (!stack.isEmpty()) {
            //popping top element from stack, printing it
            System.out.print(stack.pop());
        }
       
        System.out.println();
        //stack uses Last In First Out approach, values are removed in the opposite order in which they are added,
    }
}
