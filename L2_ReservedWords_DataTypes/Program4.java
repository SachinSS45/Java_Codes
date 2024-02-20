package L2_ReservedWords_DataTypes;

public class Program4 {
    public static void main(String[] args) {
        // Compiler => TypeChecking
        // long range :: (-9223372036854775808 to 9223372036854775807)
        // long data = 9223372039;//It will give error it will think it as a integer so
        // you have to use 'L' or 'l' at last
        long data = 24323423432423L;
        System.out.println(data);
        System.out.println("MIN VALUE : " + Long.MIN_VALUE);
        System.out.println("MAX VALUE : " + Long.MAX_VALUE);
    }
}
