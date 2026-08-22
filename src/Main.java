public class Main {

    public static void main(String[] args) {

        Player player = new Player(1, 100.0, "Ali");

        System.out.println("Initial balance: " + player.getBalance());

        try {
            player.withdraw(150);
        } catch (InsufficientFundsException e) {
            System.out.println("Withdrawal failed: " + e.getMessage());
        }

        System.out.println("Final balance: " + player.getBalance());
    }
}