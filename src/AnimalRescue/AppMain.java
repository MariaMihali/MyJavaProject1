package AnimalRescue;

public class AppMain {
    public static void main(String[] args) {

        Animal myAnimal = new Animal();

        System.out.println(myAnimal.name);
        System.out.println(myAnimal.age);
        System.out.println(myAnimal.healtCondition);
        System.out.println(myAnimal.hungerSenzation);
        System.out.println(myAnimal.stateOfMind);
        System.out.println(myAnimal.favoriteFood);
        System.out.println(myAnimal.recreationActivity);

        Adapter myAdapter = new Adapter();
        System.out.println(myAdapter.name);
        System.out.println(myAdapter.moneyAvailable);

        animalFood myAnimalFood = new animalFood();
        System.out.println(myAnimalFood.name);
        System.out.println(myAnimalFood.price);
        System.out.println(myAnimalFood.quantity);
        System.out.println(myAnimalFood.stockAvailability);

        recreationActivity myRecreationActivity = new recreationActivity();
        System.out.println(myRecreationActivity.name);

        medicalStaff myMedicalStaff = new medicalStaff();
        System.out.println(myMedicalStaff.name);
        System.out.println(myMedicalStaff.speciality);







    }
}
