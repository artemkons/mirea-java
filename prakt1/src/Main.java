
public class Main {
    public static void main(String[] args) {
        harmonic(10);
    }

    public static void harmonic(int length) {
        double el, sum = 0;
        for (double i = 1; i <= length; i++) {
            el = 1 / i;
            System.out.println(el);
            sum += el;
        }
        System.out.println("Сумма ряда: " + sum);
    }

    public static void array(int size) {
        int[] arr = new int[size];

        for (int i = 0; i < size; i++)
            arr[i] = (int) (Math.random() * 10);

        System.out.println("Несортированный массив: ");
        for (int el : arr)
            System.out.println(el);

        int t;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }

        System.out.println("Отсортированынй массив:");
        for (int el : arr)
            System.out.println(el);
    }

    public static int fact(int num) {
        int res = 1;
        for (int i = 1; i <= num; i++)
            res *= i;
        return res;
    }
}
