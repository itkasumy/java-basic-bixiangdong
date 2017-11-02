class ExcepDemo { // throws Exception
    int div(int a, int b) throws ArithmeticException, ArrayIndexOutOfBoundsException
    {
        int[] arr = new int[a];
        System.out.println(arr[4]);

        return a / b;
    }
}

class ExceptionDemo { // throws Exception
    public static void main(String[] args) // throws ArithmeticException
    {
        ExcepDemo d = new ExcepDemo();

        try {
            int x = d.div(4, 1);
            System.out.println("x = " + x);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.toString());
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.toString());
        }
        /*catch (Exception e) {
            System.out.println("......");
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }*/
        System.out.println("over");
    }
}