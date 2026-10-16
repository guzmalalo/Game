//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Mage gandalf = new Mage("Gandalf", 1000);
    Guerrier gimli = new Guerrier("Gimli", 100);

    System.out.println(gandalf);
    System.out.println(gimli);

    System.out.println(gandalf.getPv());
    gimli.attaque(gandalf);
    System.out.println(gandalf.getPv());


}
