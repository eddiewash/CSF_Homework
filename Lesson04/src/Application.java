<<<<<<< HEAD
/**
 * Created with IntelliJ IDEA.
 * User: eddiewashington
 * Date: 7/1/13
 * Time: 7:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class Application {
    public  static void main(String[] args){
        Chihuahua dog = new Chihuahua();


    }
}
=======
public class Application {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Dog fido = new Chihuahua("Fido");
        Dog rover = new Pitbull("Rover");
        DogWalker walker = new DogWalker();
        walker.walkDog(fido);
        walker.walkDog(rover);
    }
}
>>>>>>> 36711eca12ec6b9e678bac043bdcab80496249a5
