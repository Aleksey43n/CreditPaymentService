public class CreditPaymentService {
    public int calculate(int period) {
        int amount = 1_000_000; // сумма кридита
        float rate = (float) 9.99; // процент по кредиту
        float monthRate = (rate / 12 / 100);
        float a = (float) Math.pow(1 + monthRate, period) - 1;
        int result = Math.round(amount * (monthRate + monthRate / (a)));
        return result;
    }


}
