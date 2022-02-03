public class Main {
    public static void main(String[] args) {
       int balance = 100;
       int payment = 100; // сумма единаличного платежа
       int bonus = 1; // за каждые внесенные 100 рублей
       int limit =100; // минимальная сумма на которую начисляются бонусы

       int amountBonus;
       if (payment >= 1000) {
           amountBonus = payment * bonus / limit;
       }
       else {
           amountBonus = 0;
       }
       int total = balance + payment + amountBonus;
        System.out.println(" Баланс счета составляет " + total + " Из них бонусов " + amountBonus);
    }
}
