/*
Used this resource when ran into switch problems: https://www.geeksforgeeks.org/check-for-balanced-parentheses-in-an-expression/
 */

package Problem1;


public class ValidParentheses {

    public static boolean isValid(String str) {

        if (str == null) {
            return true;
        }
        if (str.length() % 2 != 0) { // odd number get outta here
            return false;
        }

        LinkedListStack<Character> stack = new LinkedListStack<Character>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{') {
                stack.push(str.charAt(i));
            }
            else {
                if (stack.size() == 0) {
                    return false;
                }
                switch (str.charAt(i)) { // nintendo switch

                    case ')':
                        if (stack.pop() != '(') {
                            return false;
                        }
                        break;
                    case ']':
                        if (stack.pop() != '[') {
                            return false;
                        }
                        break;

                    case '}':
                        if (stack.pop() != '{') {
                            return false;
                        }
                        break;
                }
            }
        }
        return stack.size() == 0;
    }
}
