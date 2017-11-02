class StaticCode {
	StaticCode() {
		System.out.println("a");
	}
    static {
        System.out.println("b");
    }
    {
        System.out.println("c");
    }
    StaticCode(int x) {
    	System.out.println("d");
    }
    public static void show() {
    	System.out.println("show run");
    }
}

class StaticCodeDemo {
	/*static {
		System.out.println("b");
	}*/
    public static void main(String[] args) {
//    	new StaticCode();
//    	new StaticCode();
//    	StaticCode.show();
//    	StaticCode s = null;
//        System.out.println("Hello World");
    	new StaticCode(6);
    }
    /*static {
		System.out.println("c");
	}*/
}