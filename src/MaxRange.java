//2 - maximum range of datatypes
public class MaxRange {
    public static void main(String[] args){
        int intMinValue= -2_147_483_648; // -2.1 billion is the negative threshold of int
        int intMaxValue=2_147_483_647; // +2.1 billion is the positive threshold of int
        // int uses 2's complement binary notation of 32 bit (4 Byte) with range -(2^31)<= int <= (2^31)-1 in this VM
        byte byteMinValue= -128; // smallest value stored by a byte
        byte byteMaxValue= 127; // largest value stored by a byte is 127
        //byte uses 2's complement 8 bit binary representation: (-2)^(8-1)<=n<=2^(8-1)-1
    }
}
