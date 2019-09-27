package enums;

public class App {
     
    public static void main(String[] args) {
        Animal animal = Animal.DOG;
        switch(animal) {
        case CAT:
            System.out.println("Cat");
            break;
        case DOG:
            System.out.println("Dog");
            break;
        case MOUSE:
            break;
        default:
            break;
        }

        System.out.println(Animal.DOG);//Dog and This animal is called: Fido
        System.out.println("Enum name as a string: " + Animal.DOG.name());//Enum name as a string: DOG
        System.out.println(Animal.MOUSE.getName());//Jerry
        System.out.println(Animal.MOUSE.getClass());//class enums.Animal
        System.out.println(Animal.DOG instanceof Object);//true
        System.out.println(Animal.DOG instanceof Enum);//true

        Animal animal2 = Animal.valueOf("CAT");
        System.out.println(animal2);//This animal is called: Fergus
    }
 
}