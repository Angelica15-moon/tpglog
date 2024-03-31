package iut.bad;

public class Femme extends Humain {
    public Femme(String nom, String prenom, int age) {
        super(nom, prenom, age);
    }
    
    public static void main(String[] args) {
        Homme homme = new Homme("Rabe", "Koto", 30);
        Femme femme = new Femme("Mamy", "Soa", 25);

        homme.ami(femme,2);
    }
}