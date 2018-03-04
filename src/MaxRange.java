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
    }
}
