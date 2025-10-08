package solid;
class AnimalImpersion {
    protected Animal animal;

    public AnimalImpersion(Animal animal){
        this.animal = animal;
    }

    public void animalSound() {
        String sound = this.animal.makeSound();
        String name = getName();

        System.out.println("El sonido que hace " + name + " es " + sound);
    }

    public String getName() {
        return this.animal.name;
    }

}

class MamiferoImpresion {

    protected Mamifero mamifero;

    public MamiferoImpresion(Mamifero mamifero){
        this.mamifero = mamifero;
    }

    public void animalTeeths() {
        int totalTeeth = this.mamifero.getNumberOfTeeths();
        String name = getName();

        System.out.println(name + " tiene " + totalTeeth + " dientes");
    }

    public String getName() {
        return this.mamifero.name;
    }
}

class AveImpresion {

    protected Ave ave;

    public AveImpresion(Ave ave){
        this.ave = ave;
    }

    public void animalTeeths() {
        int flightMeters = this.ave.flightDistance();
        String name = getName();

        System.out.println(name + " puede volar " + flightMeters + " metros");
    }

    public String getName() {
        return this.ave.name;
    }
}
