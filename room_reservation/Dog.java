/**
 * Created with IntelliJ IDEA.
 * User: lambert
 * Date: 7/1/13
 * Time: 7:02 PM
 * To change this template use File | Settings | File Templates.
 */
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
