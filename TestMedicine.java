import java.util.Random;

class Medicine{
    public void displayLabel(){
        System.out.println("Company Name:");
        System.out.println("Address:");
    }
}
class Tablet extends Medicine{
    public void displayLabel(){
        super.displayLabel();
        System.out.println("*****Tablet***** \nStore in cool dry place");
    }
}
class Syrup extends Medicine{
    public void displayLabel(){
        super.displayLabel();
        System.out.println("***** Syrup *****\nDirected by physician");
    }
}
class Ointment extends Medicine{
    public void displayLabel(){
        super.displayLabel();
        System.out.println("*****Ointment******\nFor external use only");
    }
}

public class TestMedicine {
    public static void main(String[] args) {
        Random r=new Random();
        int result=r.nextInt(4-1)+1;
        System.out.println(result);
        switch (result){
            case 1:
                Tablet t=new Tablet();

                t.displayLabel();
                break;
            case 2:
                Syrup s=new Syrup();
                s.displayLabel();
                break;
            case 3:
                Ointment o=new Ointment();
                o.displayLabel();
                break;
            default:
                System.out.println("Invalid data");
        }
    }
}
