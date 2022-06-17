public class Main {
    public static void main(String[] args) {

        int accountBallance = 205; // денег на счету у пользователя
        int replacement = 1001; // сумма пополнения счета
        int bonuce; // переменная для расчета бонусов

        if (replacement > 1000) {
            bonuce = replacement / 100;
        } else {
            bonuce = 0;
        }
        int lastBallance = accountBallance + replacement + bonuce;
        System.out.println("бонус равен " + bonuce);
        System.out.println("баланс равен " + lastBallance);

    }
}
