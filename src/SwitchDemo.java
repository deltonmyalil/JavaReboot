/**
 * Switch Statement
 */
public class SwitchDemo {
    public static void main(String[] args) {
        int switchValue = 4;
        switch (switchValue) {
            case 1:
                System.out.println(1);
                break;
            case 2: case 4: case 5:  // This is how you provide multiple cases in a single block
                System.out.println("Accepts 2, 4 or 5");
                System.out.println("Actually it was " + switchValue);
                break;
            case 3:
                System.out.println(3);
                //break;  // since break is not here it will print 3 then go to default and print default
            default:
                System.out.println("Default");
        }
    }
}
