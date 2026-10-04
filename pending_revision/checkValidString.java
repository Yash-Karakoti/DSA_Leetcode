import java.util.Stack;

public class checkValidString {
    public boolean checkValidString(String s) {
        Stack<Integer> openBrackets = new Stack<>();
        Stack<Integer> star = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                openBrackets.push(i);
            } else if (ch == '*') {
                star.push(i);
            } else {
                if (!openBrackets.isEmpty()) {
                    openBrackets.pop();
                } else if (!star.isEmpty()) {
                    star.pop();
                } else {
                    return false;
                }
            }
        }

        while (!openBrackets.isEmpty() && !star.isEmpty()) {
            if (openBrackets.pop() > star.pop()) {
                return false; 
            }
        }

        return openBrackets.isEmpty();
    }
}
