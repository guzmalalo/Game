public class Personnage {
    protected String nom;
    private int pv; // point de vie
    protected int niveau;

    protected Arme arme;

    public void setArme(Arme arme){
        this.arme =arme;
    }

    public Personnage(String nom, int pv){
        if (pv < 0){
            throw new IllegalArgumentException("Nombre negatifs");
        }

        this.nom = nom;
        this.pv = pv;
        niveau = 1;
    }

    public void prendreDegats(int degats){
        if( degats  >= 0 ){
            pv = pv - degats;
            if (pv < 0){
                pv = 0;
            }
            System.out.println(nom + " a pris "+ degats + " en degats");
        }
    }

    public void prendreSoins(int soins){
        if(soins < 0 || pv >= 100) {
            return;
        }

        pv+= soins;
        pv = pv>100 ? 100:pv; // if ternaire
    }


    public int getPv(){
        return pv;
    }


    public void attaque(Personnage cible){
        System.out.println(this.nom + " attaque " + cible.nom);
        cible.prendreDegats(10);
    }


    protected String presentation(){
        return "Bonjour voyageur, je m'appelle " + nom;
    }

    @Override
    public String toString(){
        String message= presentation();
        return message;
    }

}
