import java.util.Scanner;

public class EmployeeResult {
    String name;
    int Emp_id;
    String result;
    int assessment1;int assessment2;
    int assessment3;
    boolean b=true;
    EmployeeResult(int assessment1,int assessment2,int assessment3){
        this.assessment1=assessment1;
        this.assessment2=assessment2;
        this.assessment3=assessment3;
        if (((assessment1>=0)&&(assessment1<=100))&&((assessment2>=0)&&(assessment2<=100))&&
                ((assessment3>=0)&&(assessment3<=100))){
            this.b=true;

            if((assessment1>=75)&&(assessment3>=75)&&(assessment2>=75)){
                this.result="promoted";
            }else {
                this.result="Demoted";
            }
        }else {
            this.b=false;
            System.out.println("Invalid data,Please enter values between 1 and 100");
        }


    }
    public void display(){
        if (b==true){
            double total=assessment1+assessment2+assessment3;
            float percentage=(float) (total/3);
            System.out.println(result);
            System.out.println("Total :"+total+ "\nPercentage:"+percentage+"%");
        }
        else {
            System.out.println("Nothing to Display ,Display only if Assessment values are between 0 and 100");
        }

    }

    public static void main(String[] args) {
        System.out.println("Enter assessment1 ,assessment2 and assessment 3 values...");
        Scanner sc=new Scanner(System.in);
        EmployeeResult n1=new EmployeeResult(sc.nextInt(), sc.nextInt(), sc.nextInt());
        n1.display();
    }

}


