public class Casting {
    public static void main(String[] args) {
        // Explicit Casting
        int i = 120;
        // byte b = i; - Would run into conversion error as an int is a bigger size in bytes than byte
        // Specifying what you want the integer to be converted too will fix this issue (ex. below)
        byte b = (byte) i; // Compiler turns the integer value into a byte

        // if int i was to be set above a bytes range, it would return something very weird. (ex. below)
        // int i = 130;
        // byte b = (byte) i;
        // ^ returns -126..

        // --------------------------------------------------------------------------------------------------

        // Implicit Casting
        // Let's try converting a byte to a int - smaller to larger byte size. 
        
    }
}