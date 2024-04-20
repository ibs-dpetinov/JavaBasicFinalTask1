import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Введите текущий курс доллара по отношению к рублю");
        double course = console.nextDouble();
        System.out.println("Введите количество рублей");
        int rubles = console.nextInt();
        double dollars = rubles / course;
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Курс доллара: " + df.format(course));
        System.out.println("Количество рублей: " + rubles);
        System.out.println("Итого: " + df.format(dollars));
    }
}