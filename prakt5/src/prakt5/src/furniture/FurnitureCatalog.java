package furniture;

import java.util.Scanner;

public class FurnitureCatalog extends FurnitureShop implements ConsoleInterface {
    public FurnitureCatalog(String shopName, Furniture[] assortment) {
        super(shopName, assortment);
    }

    @Override
    public void showInfo() {
        int num = 0;
        System.out.println("\n" + "Ассортимент магазина " + getShopName() + "\n");
        for (Furniture el : assortment) {
            System.out.println(
                    "Номер: " + (++num) + "\n"
                            + "Название: " + el.getName() + "\n"
                            + "Материал: " + el.getMaterial() + "\n"
                            + "Цена: " + el.getPrice()
            );
            System.out.println("");
        }
    }

    @Override
    public void getInfo() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите номер товара, который желаете приобрести:");

            try {
                int num = sc.nextInt();

                System.out.println("Вы действительно желаете приобрести " + assortment[num - 1].getName() + " за " + assortment[num - 1].getPrice() + "$?");
                System.out.println("Введите 1 если да, или любое другое число если нет, чтобы закрыть каталог введите 2\n");

                int op = sc.nextInt();

                if (op == 1) {
                    System.out.println("Вы успешно приобрели " + assortment[num - 1].getName() + " за " + assortment[num - 1].getPrice() + "$!");
                } else if(op == 2){
                    System.out.println("До свидания!");
                    break;
                }

            } catch (Exception ex) {
                System.err.println("Неверный ввод!");
            }
        }

    }
}
