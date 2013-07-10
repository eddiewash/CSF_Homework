public class Dog {

    public Dog(){
        this.numberOfLegs = 4;
        this.name = "Fido";
    }

    public Dog(String name){
        this.name = name;
    }

    public int numberOfLegs;
    public String name;

    public String bark(){
        return "Woof!";
    }

    public int numberOfLegs(){
        return numberOfLegs;
    }

}
