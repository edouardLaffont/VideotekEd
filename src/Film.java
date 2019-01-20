public class Film {
    private double nbEtoile;
    private String realisateur;
    private String titre;

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    private double prix;

    public double getNbEtoile() {
        return nbEtoile;
    }

    public void setNbEtoile(double nbEtoile) {
        this.nbEtoile = nbEtoile;
    }

    public String getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(String realisateur) {
        this.realisateur = realisateur;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    @Override
    public String toString() {
        return "Film{" +
                "nbEtoile=" + nbEtoile +
                ", realisateur='" + realisateur + '\'' +
                ", titre='" + titre + '\'' +
                ", prix=" + prix +
                '}';
    }
}
