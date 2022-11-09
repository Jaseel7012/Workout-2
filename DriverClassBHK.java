class OneBHK{
    double roomArea;
    double hallArea;
    double price;
    OneBHK(){
        roomArea=0.0;
    }
    OneBHK(double roomArea,double hallArea,double price){
       this.roomArea=roomArea;
        this.hallArea=hallArea;
        this.price=price;


    }
    void method(){
        System.out.println("Room  area"+roomArea +"hall area :"+hallArea+", price :"+price);
    }
}
class TwoBHK extends OneBHK{
    double room2Area;
    TwoBHK(){
        super();
        room2Area=0.0;
    }
    TwoBHK(double roomarea,double hallarea,double price,double room2Area){
        super(roomarea,hallarea,price);
        this.room2Area=room2Area;
    }
    void method(){
        super.method();
        System.out.println("room2 area"+room2Area);
    }
}


public class DriverClassBHK {
    public static void main(String[] args) {
        OneBHK ob1=new OneBHK();
        TwoBHK ob2=new TwoBHK(120,200,100,13);
        TwoBHK ob3=new TwoBHK(10.0,20.0,200.0,10);
        TwoBHK ob4=new TwoBHK();
        ob2.method();
        ob1.method();
        ob3.method();
        ob4.method();
    }
}
