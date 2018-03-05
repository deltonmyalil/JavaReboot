/**
 Conversion of feet to cm or feet and inches to cm using method overloading
 */
public class MethodOverloadChallenge {
    public static void main(String[] args) {
        System.out.println("5 feet and 2 inch is " + calcImperialToCm(5,2) + "cm");
        System.out.println("7 inches is " + calcImperialToCm(7) + "cm");
    }

    public static double calcImperialToCm(double feet, double inch) {
        if (feet < 0)
            return -1;
        if (inch < 0 || inch >=12)
            return -1;
        return feet*30.48+inch*2.54;
    }

    public static double calcImperialToCm(double inch) {
        if (inch < 0)
            return -1;
        return inch*2.54;
    }
}
// One thing to note here is that the signature of the overloaded method is the number and datatype of the arguments.
//The return type of the arguments cannot be used to identify the target method to be overloaded.