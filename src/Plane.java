import java.util.ArrayList;
import java.util.List;

class Plane extends Transport {
    private int flyingHeight; //высота полета

    //конструктор
    public Plane(int power, int cost, String number, String brand, int flyingHeight){
        super(power, cost, number, brand);
        this.flyingHeight = flyingHeight;
    }

    public int getFlyingHeight(){
        return flyingHeight;
    }


}