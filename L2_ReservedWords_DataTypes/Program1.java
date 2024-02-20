package L2_ReservedWords_DataTypes;
public class Program1{
    public static void main(String[] args){
        //Compiler -> Typechecking 
        //byte  :: -128 to 127
        //JVM :: allocates memory of (1 byte : 8 bits) for data variable on ram
        byte data = 10;
        System.out.println("MAX RANGE :: "+Byte.MAX_VALUE);//127
        System.out.println("MIN RANGE :: "+Byte.MIN_VALUE);//-128
        System.out.println(data);//10
        
        //byte data2 = 130;// incompatible types : possible lossy converison from int to byte.
    }
}