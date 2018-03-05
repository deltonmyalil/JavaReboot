/**
 * Codeblocks inside a conditional
 */
public class Conditionals {
    public static void main(String[] args) {
        boolean swt = true;
        if (swt) {
            int innerVar = 10;
            System.out.println("yes");
            System.out.println(innerVar);  // inner var defined in this codeblock is accessible here
        } else {
            System.out.println("no");
//          System.out.println(innerVar);  //innerVar cannot be accessed outside of its codeblock - this will give an error
        }
    }
}
