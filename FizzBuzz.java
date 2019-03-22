public class FizzBuzz
{
    public static void fizzBuzz1()
    {
        for (int x = 1; x <= 100; x++)
        {
            String s = "";
            if (x % 3 == 0)
            {
                s += "Fizz";
            }
            if (x % 5 == 0)
            {
                s += "Buzz";
            }
            if (s.length() == 0)
            {
                s = Integer.toString(x);
                System.out.println(s);
            }
            else
            {
                System.out.println(s);
            }
        }
    }

    public static void fizzBuzz2()
    {
        for (int x = 1; x <= 100; x++)
        {
            if (x % 15 == 0)
            {
                System.out.println("FizzBuzz");
            }
            else if (x % 3 == 0)
            {
                System.out.println("Fizz");
            }
            else if (x % 5 == 0)
            {
                System.out.println("Buzz");
            }
            else
            {
                System.out.println(x);
            }
        }
    }
}


