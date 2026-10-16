public class Mage extends Personnage{
    private int mana;

    public Mage(String nom){
        this(nom, 100);
    }

    public Mage(String nom, int mana){
        super(nom, 50);
        this.mana = mana;
    }

    @Override
    public String toString(){
        String message = super.toString() + " et je suis un Mage";
        return message;
    }
}
