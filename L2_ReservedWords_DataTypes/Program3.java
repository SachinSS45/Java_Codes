package L2_ReservedWords_DataTypes;

public class Program3 {
    public static void main(String[] args) {
        //Compiler ->TypeChecking
        //int :: -2147483648 to +2147483647
        //JVM :: allocates memory of (4 byte : 32 bits)for data varible on ram
        int data = 35678;
        System.out.println(data);//32678
        System.out.println("MIN VALUE : "+Integer.MIN_VALUE);
        System.out.println("MAX VALUE : "+Integer.MAX_VALUE);
       //int data2 = 2147483648;//error : integer number is too large
       int data1 = 'r';
       System.out.println(data1);//114
    }
}
