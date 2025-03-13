import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Бугунку кундун аба ырайы канча градусту тузот ");
        int temperature = scanner.nextInt();

        if ( temperature >= 30) {
            System.out.println("Аба ыссык. Жеңил кийим кийиңиз.");
        } else if (temperature >= 0 && temperature <= 30) {
            System.out.println("Анда кадимки кийим кииңиз.");
        } else {
            System.out.println("Аба суук. Жылуу кийим кийиңиз.");
        }


        System.out.println("Сиз канча балл алдыныз?");
        int num = scanner.nextInt();
        if (num >= 90 && num <= 100) {
            System.out.println("Сизге коюлган баа: 5");
        } else if (num >= 70 && num <= 89) {
            System.out.println("Сизге коюлган баа: 4");
        } else if (num >= 50 && num <= 69) {
            System.out.println("Сизге коюлган баа: 3");
        } else if (num >= 0 && num <= 49) {
            System.out.println("Сизге коюлган баа: 2");
        }
        else {
            System.out.println("Алган баллынызды жазыныз (Мисалы 0 дон 100 чейин)");
        }

        scanner.close();


    }
}