/**
 * @author pengjunjie
 * @create 2020-01-14 10:48 AM
 */
public class FizzBuzz {
    public static String out(int i) {
        String result = "";
        if (i % 3 == 0) {
            result += "Fizz";
        }
        if (i % 5 == 0) {
            result += "Buzz";
        }
        if (result.equals("")) {
            result = "" + i;
        }
        return result;
    }
}
