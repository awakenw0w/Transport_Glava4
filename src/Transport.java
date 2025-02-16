abstract class Transport {
    protected int power, cost; // мощность стоимость
    protected String number, brand; // номер марка

    //конструктор
    public Transport(int power, int cost, String number, String brand){
        this.power = power;
        this.cost = cost;
        this.number = number;
        this.brand = brand;
    }

    public int getCost(){
        return cost;
    }

    public String getBrand(){
        return brand;
    }


}
