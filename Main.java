public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int deposit = 1150;
        int bonus;
        int totalBalance;
        if (deposit > 1000) {
            bonus = deposit / 100;
        } else {
            bonus = 0;
        }
        totalBalance = balance + deposit + bonus;
        System.out.println("Итоговая сумма на счету - " + totalBalance);
        System.out.println("Бонус составил - " + bonus);
    }
}
