import java.util.ArrayList;
import java.util.List;

class Car extends Transport {
    private int mileage; //пробег
    private boolean techInsp; //техосмотр

    //конструктор
    public Car(int mileage, boolean techInsp, int power, int cost, String number, String brand ){
        super(power, cost, number, brand);
        this.mileage = mileage;
        this.techInsp = techInsp;
    }

    public int getMileage(){
        return mileage;
    }

    public boolean isTechInsp() {
        return techInsp;
    }
}
