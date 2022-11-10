import java.util.Scanner;

class Faculty{
    String facultyId;
    double salary;
}
class FullTimeFaculty extends Faculty{
    double basic;
    double allowance;
    FullTimeFaculty(double basic,double allowance,String fac_id){
        this.basic=basic;
        this.allowance=allowance;
        this.facultyId=fac_id;
    }
    public float salaryFullTime(){
        float result=(float) basic+(float) allowance;
        return result;
    }
    void salaryDisplay(){
        salary=salaryFullTime();
        System.out.println("faculty id : "+facultyId+"\n salary is"+salaryFullTime());
    }
}
class PartTimeFaculty extends Faculty{
    int hours;
    double rate;
    PartTimeFaculty(int hour,double rate,String faculty_id){
        this.facultyId=faculty_id;
        this.hours=hour;
        this.rate=rate;
    }
    double salaryPartTime(){
        return hours*rate;
    }
    void salaryDisplay(){
        salary=salaryPartTime();
        System.out.println("faculty id :"+facultyId+"\nPart time faculty  salary: "+salaryPartTime());
    }
}
public class DriverClass {
    public static void main(String[] args) {
        System.out.println("Enter Full time faculty id..");
        Scanner sc_fid1=new Scanner(System.in);
        String fac_id1= sc_fid1.next();
        System.out.println("basic salary/ If part time faculty,type hours");

        System.out.println("allowance/If part time faculty ,type rate per hour");
        Scanner sc=new Scanner(System.in);
        FullTimeFaculty ob1=new FullTimeFaculty(sc.nextFloat(),sc.nextFloat(),fac_id1);
        ob1.salaryDisplay();
        System.out.println("Enter part time faculty id..");
        Scanner sc_pid1=new Scanner(System.in);
        String fac_pid1= sc_pid1.next();
        PartTimeFaculty obj2=new PartTimeFaculty(sc.nextInt(),sc.nextDouble(),fac_pid1);
        obj2.salaryDisplay();
        System.out.println("Enter  Full time  faculty id..");
        Scanner sc_fid2=new Scanner(System.in);
        String fac_fid2= sc_fid2.next();
        System.out.println("basic salary/ If part time faculty,type hours");
        System.out.println("allowance/If part time faculty ,type rate per hour");
        Scanner sc1=new Scanner(System.in);
        FullTimeFaculty ob3=new FullTimeFaculty(sc1.nextFloat(),sc1.nextFloat(),fac_fid2);
        ob3.salaryDisplay();
        System.out.println("Enter  part time faculty id..");
        Scanner sc_pid2=new Scanner(System.in);
        String fac_pid2= sc_pid2.next();
        PartTimeFaculty obj4=new PartTimeFaculty(sc1.nextInt(),sc1.nextDouble(),fac_pid2);
        obj4.salaryDisplay();
    }
}
