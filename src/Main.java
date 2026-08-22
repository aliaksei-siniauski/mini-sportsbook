public class Main {

    public static void main(String[] args) {

        Player player = new Player(1, 100.0, "Ali");

        System.out.println("Initial:");
        System.out.println(player);

        player.deposit(50);

        System.out.println("\nAfter deposit:");
        System.out.println(player);

        player.withdraw(20);

        System.out.println("\nAfter withdrawal:");
        System.out.println(player);
    }
}