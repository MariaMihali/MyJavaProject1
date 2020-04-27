package AnimalRescue;

public class AppMain2 {

    public static void main(String[] args) {

        Adapter adapter1=new Adapter();
        adapter1.setName("adapter1");
        adapter1.setMoneyAvailable(50);
        System.out.println(adapter1.getName());
        System.out.println(adapter1.getMoneyAvailable());

        AnimalFood animalFoodDog=new AnimalFood();
        animalFoodDog.setName("cereals");
        animalFoodDog.setPrice(6.5f);
        animalFoodDog.setQuantity(3.5f);
        animalFoodDog.setStockAvailability(50f);
        System.out.println(animalFoodDog.getName());
        System.out.println(animalFoodDog.getPrice());
        System.out.println(animalFoodDog.getQuantity());
        System.out.println(animalFoodDog.getStockAvailability());

        Boy Andrew=new Boy();
        Andrew.setName("Andrew");
        System.out.println(Andrew.getName());

        Cat  kitty=new Cat();
        kitty.setName("kitty");
        kitty.setAge(2);
        kitty.setHealtCondition(10);
        kitty.setHungerSenzation(10);
        kitty.setStateOfMind(10);
        kitty.setFavoriteFood("cereals");
        kitty.setRecreationActivity("walk");
        System.out.println(kitty.getName());
        System.out.println(kitty.getAge());
        System.out.println(kitty.getHealtCondition());
        System.out.println(kitty.getHungerSenzation());
        System.out.println(kitty.getStateOfMind());
        System.out.println(kitty.getFavoriteFood());
        System.out.println(kitty.getRecreationActivity());

        Dog rex=new Dog();
        rex.setName("rex");
        rex.setAge(1);
        rex.setHealtCondition(10);
        rex.setHungerSenzation(10);
        rex.setStateOfMind(10);
        rex.setFavoriteFood("cereals");
        rex.setRecreationActivity("walk");
        System.out.println(rex.getName());
        System.out.println(rex.getAge());
        System.out.println(rex.getHealtCondition());
        System.out.println(rex.getHungerSenzation());
        System.out.println(rex.getStateOfMind());
        System.out.println(rex.getFavoriteFood());
        System.out.println(rex.getRecreationActivity());

        Duck duffy=new Duck();
        duffy.setName("duffy");
        duffy.setAge(1);
        duffy.setHealtCondition(10);
        duffy.setHungerSenzation(10);
        duffy.setStateOfMind(10);
        duffy.setFavoriteFood("seeds");
        duffy.setRecreationActivity("swimming");
        System.out.println(duffy.getName());
        System.out.println(duffy.getAge());
        System.out.println(duffy.getHealtCondition());
        System.out.println(duffy.getHungerSenzation());
        System.out.println(duffy.getStateOfMind());
        System.out.println(duffy.getFavoriteFood());
        System.out.println(duffy.getRecreationActivity());

        Girl Kate=new Girl();
        Kate.setName("Kate");
        System.out.println(Kate.getName());

        Nurse Sofia=new Nurse();
        Sofia.setName("Sofia");
        System.out.println(Sofia.getName());

        RecreationActivity walk=new RecreationActivity();
        walk.setName("walk");
        System.out.println(walk.getName());
        RecreationActivity swimming=new RecreationActivity();
        swimming.setName("swimming");
        System.out.println(swimming.getName());
        RecreationActivity purss=new RecreationActivity();
        purss.setName("purss");
        System.out.println(purss.getName());
        RecreationActivity obstacoleCourse=new RecreationActivity();
        obstacoleCourse.setName("obstacoleCourse");
        System.out.println(obstacoleCourse.getName());

        SuggestedTreatment treatment1=new SuggestedTreatment();
        treatment1.setName("treatment1");
        treatment1.setDurationOfTreatment("one week");
        System.out.println(treatment1.getName());
        System.out.println(treatment1.getDurationOfTreatment());

        Veterinarian James=new Veterinarian();
        James.setName("James");
        System.out.println(James.getName());
























    }
}
