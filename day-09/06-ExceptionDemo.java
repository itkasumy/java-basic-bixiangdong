class FuShuException extends Exception {
    private int value;

    FuShuException(String msg, int value) {
        super(msg);
        this.value = value;
    }

    public int getVal() {
        return value;
    }
}

class ExcepDemo2 {
    int div(int a, int b) throws FuShuException
    {
        if(b < 0)
            throw new FuShuException("chuxianlechushushifushudeqingkuang------ / by fushu", b);

        return a / b;
    }
}

class ExceptionDemo2
{
    public static void main(String[] args)
    {
        ExcepDemo2 d = new ExcepDemo2();
        try {
            int x = d.div(4, -5);
            System.out.println("x=" + x);
        } catch (FuShuException e) {
            System.out.println(e.toString());
            System.out.println("chushuchuxianlefushu...");
        }
        
        System.out.println("over");
    }
}