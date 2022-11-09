public class MathFunction {

    public  void multiply(int a,int b){
        int mul=a*b;
        System.out.println(mul);
    }
    public  void multiply(float a,float b){
        float mul=a*b;
        System.out.println(mul);
    }
    public  void multiply(int a,float b){
        float mul=a*b;
        System.out.println(mul);
    }


    public static void main(String[] args) {

        MathFunction a=new MathFunction();
        a.multiply(1,2);
        a.multiply(1,5.0f);
        a.multiply(2.3f,6.7f);

    }
}
