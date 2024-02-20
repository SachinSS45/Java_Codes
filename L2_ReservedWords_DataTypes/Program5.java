package L2_ReservedWords_DataTypes;

public class Program5 {
    public static void main(String[] args) {
        // Compiler => TypeChecking
        // float range :: (1.4E-45 to 3.4028235E38)
        //JVM :: allocates memory of (4 bytes : 32 bits)for data varible on RAM.
        //float data = 1.4203;//It will give error it will think it as a double so
        // you have to use 'f' or 'F' at last
        float data = 2343;//No Error
        float data1 = 3434.34000000000000000f;
        System.out.println(data);//2343.0
        System.out.println(data1);//3434.34
        System.out.println("MIN VALUE : " + Float.MIN_VALUE);
        System.out.println("MAX VALUE : " + Float.MAX_VALUE);
    }
    
}
