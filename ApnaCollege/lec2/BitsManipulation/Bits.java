package ApnaCollege.lec2.BitsManipulation;

public class Bits {
    public static void main(String[] args) {
        int n = 5;
        int pos = 2;
        int bitMask = 1 << pos;

        // GET BIT
        // if ((bitMask & n) == 0) {
        // System.out.println("Bit is Zero");
        // } else {
        // System.out.println("Bit is one");
        // }

        // SET BIT
        // int newBit = bitMask | n;
        // System.out.println(newBit);

        // CLEAR BIT    
        int notBitMask = ~bitMask;
        System.out.println(notBitMask&n);
    }
}
