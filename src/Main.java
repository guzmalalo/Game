//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Mage gandalf = new Mage("Gandalf");
    Guerrier gimli = new Guerrier("Gimli");
    Paladin aragorn = new Paladin("Aragorn", 85, 100, 100);

    gandalf.soigner(aragorn);
    gandalf.soigner(aragorn);


    System.out.println("Points de vie de aragorn "+ aragorn.getPv());

}
