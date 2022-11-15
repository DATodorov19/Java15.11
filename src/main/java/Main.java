public class Main {
    public static void main(String [] args){
        Animal animal = new Animal(10,"meat");
        System.out.println(animal.getAge());
        System.out.println(animal);
        animal.setAge(11);
        System.out.println(animal.getAge());
        System.out.println(animal);
        ImmutableAnimal immAnimal = new ImmutableAnimal(10,"meat");
        System.out.println(immAnimal);
        System.out.println(immAnimal.getAge() + " " + immAnimal.getFood());
        ImmutableAnimal newImmAnimal = immAnimal.changeAge(11);
        System.out.println(newImmAnimal);
        System.out.println(newImmAnimal.getAge()+ " "+ newImmAnimal.getFood());
    }
}