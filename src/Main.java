import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Videotek videotek = new Videotek();
        videotek.insererFilmCatalogue("Django","Quentin Tarantino",4d, 3.21);
        videotek.insererFilmCatalogue("Star Wars", "George Lucas", 5d, 10.65);
        videotek.insererFilmCatalogue("Le Seigneur des Anneaux", "Peter Jackson",5d, 11.99);
        videotek.voirCatalogue();
        System.out.println("Afficher les films par note reçues : ");
        double noteClassement = sc.nextDouble();
        videotek.voirFilmsCingEtoiles(noteClassement);
        System.out.println("Veuillez rentrer le nom ENTIER du réalisateur : ");
        String nomRealisateur = sc.next();
        videotek.voirFilmRealisateur(nomRealisateur);
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
