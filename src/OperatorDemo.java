/**
 * Operator demo
 */
public class OperatorDemo {
    public static void main(String[] args){
        /*int result = 1+2;
        System.out.println("1 + 2 =" + result);
        int prevResult = result;
        result--;
        System.out.println(result);*/
        double n = 20;
        double m = 80;
        double l = n+m;
        double p = l*25;
        double r = l % 40;
        if (r > 20)
            System.out.println("Over the limit");
        else
            System.out.println("Under the Limit");

    }
}