public class Main
{
    public static void main(String[] args)
    {
        //Switch принимает Byte, Short, Character, Integer, String, Enum:

        Byte test_byte = 1;
        switch (test_byte)
        {
            case 1:
                System.out.println("test_byte = 1");
                break;
            case 2:
                System.out.println("test_byte = 2");
                break;
            default:
                System.out.println("test_byte = ?");
                break;
        }

        Short test_short = 10000;
        switch (test_short)
        {
            case 10000:
                System.out.println("test_short = 10000");
                break;
            case 30000:
                System.out.println("test_short = 30000");
                break;
            default:
                System.out.println("test_short = ?");
                break;
        }

        Character test_char = 'a';
        switch (test_char)
        {
            case 'a':
                System.out.println("test_char = a");
                break;
            case 'b':
                System.out.println("test_char = b");
                break;
            default:
                System.out.println("test_char = ?");
                break;
        }

        Integer _int = 200;
        switch (_int)
        {
            case 100:
                System.out.println("_int = 100");
                break;
            case 200:
                System.out.println("_int = 200");
                break;
            default:
                System.out.println("_int = ?");
                break;
        }

        String _string = "abc";
        switch (_string)
        {
            case "abc":
                System.out.println("_string = abc");
                break;
            case "xyz":
                System.out.println("_string = xyz");
                break;
            default:
                System.out.println("_string = ?");
                break;
        }

        enum Alphabet
        {
            abc,
            xyz
        }

        Alphabet type = Alphabet.xyz;
        String test_type = switch (type)
        {
            case abc -> "Лингвист";
            case xyz -> "Математик";
        };
        System.out.println("test_type = " + test_type);
    }
}