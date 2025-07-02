import java.util.*;
public class BitwiseOperationsWithFloatingPointVariables {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        int x=(int) a;
        int y=(int) b;
        int And=x & y;
        int Or=x | y;
        int Xor= x ^ y;
        int Nand= (~x) & y;
        System.out.println("Bitwise AND result: "+And);
        System.out.println("Bitwise OR result: "+Or);
        System.out.println("Bitwise XOR result: "+Xor);
        System.out.println("Bitwise NOT and AND result: "+Nand);
    }
}