
public class Main {
    public static void main(String[] args) {
        Dog[] dogs = {
                new Dog("Немецкая овчарка", "коричневый", 3),
                new Dog("Английский бульдог", "чёрный", 2),
                new Dog("Чихуахуа", "белый", 10)
        };

        System.out.println(dogs[2].toHumanAge());
    }
}
