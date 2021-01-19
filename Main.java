public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int upbalance = 1500;
        double bonus = 0;

        if (upbalance > 1000) {
            bonus = Math.floor(upbalance / 100);
        }

        double finalbalance = balance + upbalance + bonus;

        System.out.println("Итоговая сумма: " + finalbalance);
        System.out.println("Итоговый бонус: " + bonus);
    }


}
