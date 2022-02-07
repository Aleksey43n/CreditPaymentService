public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int period = 12; // ввести количество месяцев
        float result = service.calculate(period);
        System.out.println("Ежемесячный платеж составит " + result + " рублей");
    }
}
