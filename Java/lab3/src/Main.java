
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Логические операции");
        int x = 5, y = 12, z = 13;
        if (x < y && !(y + z < x || z + x > y))
        {
            System.out.println("condition = true");
        } 
        else
        {
            System.out.println("condition = false");
        }
        System.out.println();

        System.out.println("Тернарные операции");
        int min = x < y ? x : y;
        System.out.println("min(x, y) = " + min);
        System.out.println();


        System.out.println("Поразрядные логические операции");
        x = 9;
        y = 11;
        System.out.println("x = " + x + " ("+ Integer.toBinaryString(x) + ")");
        System.out.println("y = " + y + " (" + Integer.toBinaryString(y) + ")");
        System.out.println();

        int result = x & y;
        System.out.println("x & y = " + result + " (" + Integer.toBinaryString(result) + ")");
        result = x | y;
        System.out.println("x | y = " + result + " (" + Integer.toBinaryString(result) + ")");
        result = x ^ y;
        System.out.println("x ^ y = " + result + " (" + Integer.toBinaryString(result) + ")");
        result = ~x;
        System.out.println("~x = " + result + " (" + Integer.toBinaryString(result) + ")");
        System.out.println();

        
        System.out.println("Операции сдвига");
        result = x >> 1;
        System.out.println("x >> 1 = " + result + " (" + Integer.toBinaryString(result) + ")");
        result = x << 1;
        System.out.println("x << 1 = " + result + " (" + Integer.toBinaryString(result) + ")");
        result = (~x) >> 1;
        System.out.println("(~x) >> 1 = " + result + " (" + Integer.toBinaryString(result) + ")");
        result = (~x) >>> 1;
        System.out.println("(~x) >>> 1 = " + result + " (" + Integer.toBinaryString(result) + ")");
    }
}