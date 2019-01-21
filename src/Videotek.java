import java.util.Scanner;
import java.util.ArrayList;

public class Videotek {

    private Scanner sc = new Scanner(System.in);
    private ArrayList<Film> films = new ArrayList<>();

    public void creerFilm() {
        System.out.println("Veuillez rentrer le titre du film :");
        String titre = sc.next();
        System.out.println("Veuillez donner le nom du réalisateur :");
        String realisateur = sc.next();
        System.out.println("Veuillez renseigner la note du film sur Allociné :");
        double note = sc.nextDouble();
        System.out.println("Veuillez renseigner le prix de vente du film : ");
        double prix = sc.nextDouble();

        insererFilmCatalogue(titre, realisateur, note, prix);
    }

    public void insererFilmCatalogue(String titre, String realisateur, double note, double prix) {
        Film film = new Film();
        film.setTitre(titre);
        film.setRealisateur(realisateur);
        film.setNbEtoile(note);
        film.setPrix(prix);
        System.out.println(film);
        films.add(film);
    }

    public void voirCatalogue() {
        double prixTotal = 0;
        double moyenneNote = 0;
        System.out.println("Voici les films actuellement disponibles : ");
        for (Film film : films) {
            System.out.println(film);
            prixTotal += film.getPrix();
            moyenneNote += film.getNbEtoile() / films.size();
        }
        System.out.println("Le prix du catalogue s'élève à : " + prixTotal + " euros.");
        System.out.println("La note moyenne des films du catalogue est de " + moyenneNote + " étoiles.");

    }

    public void voirFilmsCingEtoiles(double note) {
        for (Film film : films) {
            if (film.getNbEtoile() == note) {
                System.out.println(film);
            }
        }
    }

    public void voirFilmRealisateur(String realisateur) {
        films.forEach(film -> {
            if (film.getRealisateur().toLowerCase().contains(realisateur.toLowerCase())) {
                System.out.println(film);
            }
        });
    }
}
