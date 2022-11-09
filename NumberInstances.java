public class NumberInstances {
    static int count=0;
    public NumberInstances(){
        count++;
    }

    public static void main(String[] args) {
        NumberInstances o1=new NumberInstances();
        NumberInstances o2=new NumberInstances();
        o1=null;
        o1=o2;
        o1.finalize();
        System.gc();
        System.out.println(count);
    }protected void finalize(){
        System.out.println("object destructed");
        count--;
    }
}
