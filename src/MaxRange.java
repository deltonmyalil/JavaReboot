//2 - maximum range of datatypes
public class MaxRange {
    public static void main(String[] args){
        int intMinValue= -2_147_483_648; // -2.1 billion is the negative threshold of int
        int intMaxValue=2_147_483_647; // +2.1 billion is the positive threshold of int
        // int uses 2's complement binary notation of 32 bit (4 Byte) with range -(2^31)<= int <= (2^31)-1 in this VM
        byte byteMinValue= -128; // smallest value stored by a byte
        byte byteMaxValue= 127; // largest value stored by a byte is 127
        //byte uses 2's complement 8 bit binary representation: (-2)^(8-1)<=n<=2^(8-1)-1
        //use byte if you want to store a small number
        short shortMinValue= -32768; //short is 16 bit 2's complement
        short shortMaxValue= 32767; // range of short is from -32k to 32k-1
        // use short if you want to store a larger number than byte as short is made of two bytes
        long longMinValue= -9_223_372_036_854_775_808L; //Always put an 'L' or an 'l' at the end of the long value
        long longMaxValue= -9_223_372_036_854_775_807L; //Put L in the end
        //long is 64 bit 2's complement number, range is from -(2^64) to 2^64-1

        //float and double
        int myIntValue = 5;
        float myFloatValue = 5f; //if you want to specifically instruct for float, append f to the value
        //float takes up 32 bits IEEE 754 32 bit Standard. 1 bit for sign, 8 bits for biased exponent, 23 bits for Mantissa
        double myDoubleValue = 5d;  //if you want to specifically instruct for double, append d to the value
        //double takes up 64 bits of data. It is IEEE 754 64 bit Standard: 1 bit for sign, 11 bits for biased exponent, 20 bits for Mantissa
        System.out.println("Integer Value is " + myIntValue/3);
        System.out.println("Float Value is " + myFloatValue/3); // shows 7 decimal places
        System.out.println("Double Value is " + myDoubleValue/3); // shows 16 decimal places
        //Double is faster in 64 bit modern computers as they are optimised for 64bit FP computation
        //Use double instead of float to make codes efficient

        //char and boolean
        char myChar = 'a'; // takes up two bytes
        char unicodeChar = '\u0D05'; // malayalam letter aa - use slash u followed by the code
        System.out.println(unicodeChar);
        boolean myBool = true; // unlike Python, t is not capitalized; takes 1 bit
    }
}
