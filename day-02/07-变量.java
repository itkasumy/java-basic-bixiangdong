class BianLiang {
    public static void main(String[] args) {
        // 定义变量的格式
        // 数据类型 变量名 = 初始化值；
        // 定义一个 int 类型的变量，值为 6
        int i = 6;
        System.out.println(i);
        i = 20;
        System.out.println(i);

        byte b = 2;
        System.out.println(b);
        b = 127;
        System.out.println(b);
        // b = 128;  不兼容的类型: 从int转换到byte可能会有损失

        short s = 30000;
        System.out.println(s);

        long l = 9l;
        System.out.println(l);

        float f = 2.3f;
        System.out.println(f);

        double d = 34.56;
        System.out.println(d);

        char c = 'a';
        char c1 = '1';
        char c2 = ' ';

        boolean bo = true;
        bo = false;
    }
}