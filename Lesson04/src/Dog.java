<<<<<<< HEAD
/**
 * Created with IntelliJ IDEA.
 * User: eddiewashington
 * Date: 7/1/13
 * Time: 7:01 PM
 * To change this template use File | Settings | File Templates.
 */
public class Dog {
    public Dog() {
        this.numberOfLegs = 4;
        this.name = "Fido";
    }
    public Dog(String name) {
        this.name = name;
    }
=======

public abstract class Dog implements Moveable {
    private String name;

    private Dog() {
        super();
    }

    public Dog(String name) {
        this();
        this.name = name;
    }

    public final int numberOfLegs() {
        return 4;
    }

>>>>>>> 36711eca12ec6b9e678bac043bdcab80496249a5
    public String bark() {
        return "Woof!";
    }

<<<<<<< HEAD
    public int numberOfLegs() {
        return 4;
    }

    public int numberOfLegs;
    public String name;
=======
    public String getName() {
        return this.name;
    }

    public String move() {
        return "Walked 4 steps!";
    }

    public abstract String getBreed();
>>>>>>> 36711eca12ec6b9e678bac043bdcab80496249a5
}
