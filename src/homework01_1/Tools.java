package homework01_1;

/**
 * Created by Duan Guanhua on 2017/10/13.
 */
public class Tools {
    /**
     * 将十进制数num转化为二进制数，并将对应的二进制数以字符串的方式返回
     *
     * @param num
     * @return
     */

    public static String toBinary(int num) {
        String binaryString = "";
        LinkedStack stack = new LinkedStack();
        if (num ==0) { //0 should be careful
            return "0";
        }
        while (num != 0) {
            int remainder = num % 2;
            num /= 2;
            stack.push(remainder);
        }
        while (!stack.isEmpty()) {
            binaryString +=  stack.pop() + "";
        }
        return binaryString;
    }

    /**
     * 将十进制数num转化为八进制数，并将对应的八进制数以字符串的方式返回
     *
     * @param num
     * @return
     */
    public static String toOctal(int num) {
        //add your code here
        String octalString = "";
        LinkedStack stack = new LinkedStack();
        if (num ==0) {
            return "0";
        }
        while (num != 0) {
            int remainder = num % 8;
            num /= 8;
            stack.push(remainder);
        }
        while (!stack.isEmpty()) {
            octalString += stack.pop() + "";
        }
        return octalString;
    }

    /**
     * 将十进制数num转化为十六进制数，并将对应的十六进制数以字符串的方式返回
     *
     * @param num
     * @return
     */
    public static String toHexadecimal(int num) {
        //add your code here
        char[] c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        String hexadecimalString = "";
        LinkedStack stack = new LinkedStack();
        if (num ==0) {
            return "0";
        }
        while (num != 0) {
            int remainder = num % 16;
            num /= 16;
            stack.push(c[remainder]);
        }
        while (!stack.isEmpty()) {
            hexadecimalString += stack.pop();
        }
        return hexadecimalString;
    }

    /**
     * 利用栈将10进制正整数num转换为d进制，d为2、8或者16
     *
     * @param num
     * @param d
     * @return
     */
    public static String toOther(int num, int d) {
        //add your code here
        String otherString = "";
        LinkedStack stack = new LinkedStack();
        char[] c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        if (num ==0) {
            return "0";
        }
        while (num != 0) {
            int remainder = num % d;
            num /= d;
            stack.push(c[remainder]);
        }
        while (!stack.isEmpty()) {
            otherString += stack.pop();
        }
        return otherString;
    }

    /**
     * 将0-15转化为相应的字符'0'--'9'和'A'--'E'
     *
     * @param n
     * @return
     */
    public static char toChar(int n) {
        if (n >= 0 && n <= 9) {
            return (char) ('0' + n);
        } else if (n >= 10 && n <= 15) {
            return (char) ('A' + n - 10);
        } else {
            throw new IllegalArgumentException();
        }
    }

    /**
     * 检验表达式中符号'[]'及'()'是否匹配
     *
     * @param exp
     * @return
     */
    public static boolean isMatch(String exp) {
        LinkedStack s = new LinkedStack();
        for (char c : exp.toCharArray()) {
            if (c == '[' || c == '(') {
                s.push(c);
            } else if (c == ']' || c == ')') {
                if (s.isEmpty()) {
                    return false;
                }
                char str = (Character) s.pop();
                if (c == ']' && str != '[') {
                    return false;
                } else if (c == ')' && str != '(') {
                    return false;
                }
            }
        }
        return s.isEmpty();
    }
}
