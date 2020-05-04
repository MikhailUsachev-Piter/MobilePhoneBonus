public class Main {
    public static void main(String[] args) {
        int payment = 4500_00; // В копейках
        int bonus;
        if (payment >= 1000_00) {
            bonus = payment / 100_00;
        } else {
            bonus = 0;
        }
                System.out.println("Ваш бонус: " + bonus);
        }
    }
