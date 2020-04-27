package AnimalRescue;

public class AnimalFood {
    private String name;
    private float price;
    private float quantity;
    private float stockAvailability;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public float getPrice(){
        return price;
    }
    public void setPrice(float price){
        this.price=price;
    }
    public float getQuantity(){
        return quantity;
    }
    public void setQuantity(float quantity){
        this.quantity=quantity;
    }
    public float getStockAvailability(){
        return stockAvailability;
    }
    public void setStockAvailability(float stockAvailability){
        this.stockAvailability=stockAvailability;
    }

}
