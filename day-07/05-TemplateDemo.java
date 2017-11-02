 abstract class GetTime {
     public final void getTime() {
         long start = System.currentTimeMillis();

         runcode();

         long end = System.currentTimeMillis();

         System.out.println("time:" + (end - start));
     }

     public abstract void runcode();
 }

class SubTime extends GetTime {
    public void runcode() {
        for(int i = 0; i < 4000; i++) {
             System.out.print(i);
         }
     }
}

class TemplateDemo {
    public static void main(String[] args) {
        System.out.print("Hello World!");
        
        SubTime st = new SubTime();
        st.getTime();
    }
} 