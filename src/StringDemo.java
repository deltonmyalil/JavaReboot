/**
 * 3 - StringDemo
 */
public class StringDemo {
    public static void main(String[] args){
        String myString = "This is a string";
        System.out.println("My string is :" + myString);
        myString = myString + " this is the rest";
        System.out.println("The next string is: "+myString);
        String numberString = "123";
        int num = 1000;
        numberString = numberString + num;  // int num is converted dynamically into string and then concatenated
        System.out.println(numberString);  // then this concatenated string is printed
    }
}
