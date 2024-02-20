package L2_ReservedWords_DataTypes;

public class Program6 {
    public static void main(String[] args) {
        // Compiler => TypeChecking
        // double range :: (4.9E-324 to 1.7976931348623157E308)
        //JVM :: allocates memory of (8 bytes : 64 bits)for data varible on RAM.
        
        double data = 2343;//No Error
        double data1 = 3434.3402432;
        double data2 = 234324.23423D;
        System.out.println(data);//2343.0
        System.out.println(data1);//3434.3402432
        System.out.println(data2);
        System.out.println("MIN VALUE : " + Double.MIN_VALUE);
        System.out.println("MAX VALUE : " + Double.MAX_VALUE);
    }
}
