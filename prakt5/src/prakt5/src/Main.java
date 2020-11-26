import dishes.*;
import dogs.*;
import furniture.*;

public class Main {
    public static void main(String[] args) {
        Cup myCup = new Cup("white", "ceramics", "drinking", "cappuccino");
        myCup.fill("cappuccino");
        myCup.useDish();

        Plate myPlate = new Plate("green", "ceramics", "eating", "deep");
        myPlate.useDish();
        myPlate.Wash();


        Dachshund dog = new Dachshund("black", "Sanya");
        dog.walk();
        dog.bark();

        Chihuahua dog2 = new Chihuahua("white", "Leha");
        dog2.walk();
        dog2.bark();


        Furniture[] assortment1 = {
                new Chair("chair", 2.65, "plastic"),
                new Table("table", 10.5, "wood"),
                new Sofa("sofa", 22.65, "wool")};
        FurnitureCatalog ikeaCatalog = new FurnitureCatalog("ikea", assortment1);
        ikeaCatalog.showInfo();
        ikeaCatalog.getInfo();
    }
}
