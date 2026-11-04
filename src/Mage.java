public class Mage extends Personnage implements Soigneur{
    private int mana;

    public Mage(String nom){
        this(nom, 100, 100);
    }

    public Mage(String nom, int pv, int mana){
        super(nom, pv);
        this.mana = mana;
    }

    @Override
    public void soigner(Personnage cible){
        if(mana>=5) {
            cible.prendreSoins(5);
            mana -= 5;
        }else {
            System.out.println("Pas assez de mana");
        }
    }
    @Override
    public String toString(){
        String message = super.toString() + " et je suis un Mage";
        return message;
    }
}
