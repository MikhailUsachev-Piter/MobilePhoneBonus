public class Main {
    public static void main(String[] args) {
        int amount = 1_820_00; // Копейки
        int limit = 100_00; // Копейки
        int bonus = amount / limit;
           if (limit >= 1000_00) {
               bonus = amount / limit;
           }
               System.out.println(bonus);
    }
}
