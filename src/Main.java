public class Main {
    public static void main(String[] args) {
        int payment = 1500_00; // В копейках
        if (payment >= 1000_00){
            int bonus = payment / 100_00;
            System.out.println(bonus);
        }
    }
}
