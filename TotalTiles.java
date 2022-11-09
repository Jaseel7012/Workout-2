import java.util.Scanner;

class Tile{
    int edge_length;
    int area;
    Tile(int length){
        this.edge_length=length;
        this.area=edge_length*edge_length;
    }
}
class Floor{
    int length;
    int width;
    int area_floor;

    Floor(int length,int width){
        this.length=length;
        this.width=width;

    }

    public void totalTiles(Tile t){
        area_floor=width*length;
        int number_of_tiles=area_floor/t.area;
        System.out.println(number_of_tiles);
    }
}
public class TotalTiles {
    public static void main(String[] args) {
        System.out.println("Enter Length and Width of Floor");
        Scanner sc=new Scanner(System.in);
        Floor ob1=new Floor(sc.nextInt(), sc.nextInt());
        System.out.println("Enter the edge of Tile");
        Tile t=new Tile(sc.nextInt());
        ob1.totalTiles(t);
    }
}
