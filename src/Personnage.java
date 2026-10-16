public class Personnage {
    protected String nom;
    private int pv; // point de vie
    protected int niveau;

    public Personnage(String nom, int pv){
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

    public int getPv(){
        return pv;
    }


    public void attaque(Personnage cible){
        System.out.println(this.nom + " attaque " + cible.nom);
        cible.prendreDegats(10);
    }

    @Override
    public String toString(){
        String message= "Bonjour voyageur, je m'appelle " + nom;
        return message;
    }

}
