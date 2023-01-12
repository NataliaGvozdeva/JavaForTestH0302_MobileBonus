public class Main {
    public static void main(String[] args) {

        int startBalance = 2_000;
        int renewal = 500;

        int bonuses = renewal > 1000 ? renewal / 100 : 0;

        System.out.println("Количество бонусов = " + bonuses + " и итоговая сумма = " + (startBalance + renewal + bonuses));

    }
}
