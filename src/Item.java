public class Item {

    private double price;
    private String name;

    public Item(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public double getPrice(){
        return price;
    }

    public String getName(){
        return name;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void  setName(String name){
        this.name = name;
    }
}
