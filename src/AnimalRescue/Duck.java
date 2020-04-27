package AnimalRescue;

public class Duck {
    private String name ;
    private int age;
    private int healtCondition;
    private int hungerSenzation;
    private int stateOfMind;
    private String favoriteFood;
    private String recreationActivity;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getHealtCondition(){
        return healtCondition;
    }
    public void setHealtCondition(int healtCondition){
        this.healtCondition=healtCondition;
    }
    public int getHungerSenzation(){
        return hungerSenzation;
    }
    public void setHungerSenzation(int hungerSenzation){
        this.hungerSenzation=hungerSenzation;
    }
    public int getStateOfMind(){
        return stateOfMind;
    }
    public void setStateOfMind(int stateOfMind){
        this.stateOfMind=stateOfMind;
    }
    public String getFavoriteFood(){
        return favoriteFood;
    }
    public void setFavoriteFood(String favoriteFood){
        this.favoriteFood=favoriteFood;
    }
    public String getRecreationActivity(){
        return recreationActivity;
    }
    public void setRecreationActivity(String recreationActivity){
        this.recreationActivity=recreationActivity;
    }

    public void eat () {
        System.out.println("Eating...");
    }


}
