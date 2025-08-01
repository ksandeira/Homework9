import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int[] payments = {5_000, 7_500, 8_300, 10_000, 12_500};
        int total = 0;
        for (int i = 0; i < payments.length; i++) {
            total += payments[i];
        }
        System.out.println("Сумма трат за месяц составила " + total + " рублей");

        System.out.println("Задание 2");
        int[] payments2 = Arrays.copyOf(payments, payments.length);
        int minPayments = payments2[0];
        int maxPayments = payments2[0];
        for (int payment : payments2) {
            if (payment < minPayments) {
                minPayments = payment;
            }
            if (payment > maxPayments) {
                maxPayments = payment;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minPayments + " рублей. Максимальная сумма трат за неделю составила " + maxPayments + " рублей.");

        System.out.println("Задание 3");
        int[] payments3 = Arrays.copyOf(payments, payments.length);
        int total1 = 0;
        for (int cost : payments3) {
            total1 += cost;
        }
        double averageSpend = (double) total1 / payments3.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageSpend + " рублей.");

        System.out.println("Задание 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            char back = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = back;
        }
        for (char reverse : reverseFullName) {
            System.out.print(reverse);
        }
    }
}