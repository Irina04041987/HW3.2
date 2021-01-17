public class Main {
    public static void main(String[] args) {
        int Balance = 100;
        int Deposit = 1150;
        int Bonus;
        int TotalBalance;
        if (Deposit > 1000){
            Bonus = Deposit/100;
        }
        else {
            Bonus = 0;
        }
        TotalBalance = Balance + Deposit + Bonus;
        System.out.println("Итоговая сумма на счету - " + TotalBalance);
        System.out.println("Бонус составил - " + Bonus);
    }
}
