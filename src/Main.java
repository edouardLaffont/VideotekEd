import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        Videotek videotek = new Videotek();
        nouveauFilm(videotek);
        videotek.voirCatalogue();

    }

    private static void nouveauFilm(Videotek videotek) {
        do {
            videotek.creerFilm();
            System.out.println("Voulez-vous ajouter un nouveau film ?");
            System.out.println("1 - Oui");
            System.out.println("2 - Non");
        } while (sc.nextInt()== 1);

    }
}
