import java.util.Scanner;

public class Videotek {
private Scanner sc = new Scanner(System.in);
private Film[] films = new Film[10];
private int nbFilm;

   public void creerFilm() {
         System.out.println("Veuillez rentrer le titre du film :");
         String titre = sc.next();
         System.out.println("Veuillez donner le nom du réalisateur :");
         String realisateur = sc.next();
         System.out.println("Veuillez renseigner la note du film sur Allociné :");
         double note = sc.nextDouble();
         System.out.println("Veuillez renseigner le prix de vente du film : ");
         double prix = sc.nextDouble();


      Film film = new Film();
      film.setTitre(titre);
      film.setRealisateur(realisateur);
      film.setNbEtoile(note);
      film.setPrix(prix);
      System.out.println(film);
      films[nbFilm] = film;
      nbFilm = nbFilm+1;

   }





   public void voirCatalogue() {
      double prixTotal = 0;
      double moyenneNote = 0;
      System.out.println("Voici les films actuellement disponibles : ");
      for (Film film : films){
         System.out.println(film);
         if (film != null) {
            prixTotal += film.getPrix();
            moyenneNote += film.getNbEtoile()/nbFilm;
         }
      }
      System.out.println("Le prix du catalogue s'élève à : " + prixTotal + " euros.");
      System.out.println("La note moyenne des films du catalogue est de " + moyenneNote + " étoiles.");

   }
}
