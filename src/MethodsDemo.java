public class MethodsDemo {
    public static void main(String[] args) {
        double a = calculateScore(8,2);
        System.out.println(a);
        double b = calculateScore(7,3);
        System.out.println(b);
        double c = calculateScore(10,0);
        System.out.println(c);
    }
    public static double calculateScore(double scoreOutOfTen, int offset) {
        //System.out.println("Calculating score out of 100");
        //System.out.println("Score is : " + (scoreOutOfTen*10+offset));  // concatenation + has more precedence than addition, hence the brackets
        return (scoreOutOfTen*10+offset);
    }
}
