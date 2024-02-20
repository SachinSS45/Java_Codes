package L2_ReservedWords_DataTypes;

public class Program2 {
    public static void main(String[] args) {
        //Compiler ->TypeChecking
        // short :: -32768 to +32767
        //JVM :: allocates memory of (2 byte : 16 bits)for data varible on ram
        short data = 130;
        System.out.println(data);//130
        System.out.println("MIN VALUE : "+Short.MIN_VALUE);
        System.out.println("MAX VALUE : "+Short.MAX_VALUE);
        //Short data2 = 2342434;//Incompaitable types : possible lossy conversion from int to short
    }
}
