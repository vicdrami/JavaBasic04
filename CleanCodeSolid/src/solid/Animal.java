package solid;

public interface Animal {
    String name = null;

    public String makeSound();
}

interface Mamifero extends Animal {
    public int getNumberOfTeeths();
}

interface Ave extends Animal {
    public int flightDistance();
}

public class cat implements Mamifero {
    private String name;

    public cat(String name){
        this.name = name;
    }

    @Override
    public String makeSound() {
        return "Meow";
    }

    @Override
    public int getNumberOfTeeths() {
        return 24;
    }
}

class dog implements Mamifero {
    private String name;

    public dog(String name){
        this.name = name;
    }

    @Override
    public String makeSound() {
        return "Woof! Woof!";
    }

    @Override
    public int getNumberOfTeeths() {
        return 30;
    }
}

class chicken implements Ave {
    private String name;

    public chicken(){
        this.name = name;
    }

    @Override
    public String makeSound() {
        return "Cluck";
    }

    @Override
    public int flightDistance() {
        return 0;
    }
}

class duck implements Ave {
    private String name;

    public duck(String name){
        this.name = name;
    }

    @Override
    public String makeSound() {
        return "Quack";
    }

    @Override
    public int flightDistance() {
        return 5000;
    }
}



