import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();

        try {
            deck.shuffle();
            deck.head();
            deck.pick();
            List<Card> hand = deck.hand();
            for (Card card : hand) {
                System.out.println("Carta en la mano: " + card);
            }
            showMenu(deck);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void showMenu(Deck deck) throws Exception {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Sacar carta del tope");
            System.out.println("2. Seleccionar una carta aleatoria");
            System.out.println("3. Repartir una mano de 5 cartas");
            System.out.println("4. Salir");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    try {
                        deck.head();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        deck.pick();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        deck.hand();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    exit = true;
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }
}
