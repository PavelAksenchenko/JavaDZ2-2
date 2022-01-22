public class Main {
    public static void main(String[] args) {
        int score =300;
        int depositAccount =2200;
        int bonus;

        if (depositAccount > 1000) {
            bonus = depositAccount / 100;
        }
        else {
            bonus = 0;
        }

        int balance = score + depositAccount + bonus;
        System.out.println("Баланс пополнен, Ваш баланс: " + balance + " руб. Ваш бонус: " + bonus + " руб.");
    }
}
