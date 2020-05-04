public class Main {
    public static void main(String[] args) {
        int payment = 200_00; // В копейках
        if (payment >= 1000_00){
            int bonus = payment / 100_00;
            System.out.println(bonus);
        } else {
            int bonus = 0;
            System.out.println(bonus);
        }
    }
}
