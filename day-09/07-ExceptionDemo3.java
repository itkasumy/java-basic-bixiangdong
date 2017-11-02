class ExcepDemo3 {
    int div(int a, int b)
    {
        if(b == 0)
            throw new ArithmeticException("divide by zero");
        return a / b;
    }
}

class ExceptionDemo3
{
    public static void main(String[] args)
    {
        ExcepDemo3 d = new ExcepDemo3();
        int x = d.div(4, 0);
        System.out.println("x=" + x);
        
        System.out.println("over");
    }
}