public class Main {
    public static void main(String[] args) {
        int account = 30000; // Копейки
        int admission = 20000; // Копейки
        if (admission >= 20000){
            int bonus = admission / 10000;
            account = bonus + ((account + admission) / 100);
            System.out.println(account);
        }   else {
            account = (account + admission) / 100;
            System.out.println(account);
        }
    }
}
