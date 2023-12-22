public class Main
{
    public static void main(String[] args)
    {
        String str1 = "First";
        String str2 = "__Second_";
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);

        System.out.println("Длина строки 1: " + str1.length());
        System.out.println("4 символ в 1 строке: " + str1.charAt(3));
        System.out.println("Объединение 1 и 2 строк: " + str1.concat(str2));
        System.out.println("Проверка равенства строки 1 и 2 " + str1.equalsIgnoreCase(str2));
        System.out.println("Индекс первого вхождения 'cond' в строке 2: " + str2.indexOf("cond"));
        System.out.println("Подстрока str1 со 2-го символа: " + str1.substring(1));
        System.out.println("1 строка в нижнем регистре: " + str1.toLowerCase());
        System.out.println("1 строка в верхнем регистре: " + str1.toUpperCase());
        System.out.println("2 строка с заменой нижнего подчеркивания: " + str2.replace("_", "!"));
    }
}