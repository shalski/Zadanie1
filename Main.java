public class Main {
    public static void main(String[] args) {

        Animal dog = new Animal("canis");
        dog.name = "Kudlaty";
        dog.weight = 12.1;

        System.out.println("Masz psa, nazywa się: ");
        System.out.println(dog.name);
        System.out.println(dog.isAlive);
        System.out.println(dog.species);

        Animal cat = new Animal("siamese");
        cat.name = "Siersciuch";
        cat.weight = 3.9;

        System.out.println("Masz kota, nazywa się: ");
        System.out.println(cat.name);
        System.out.println(cat.isAlive);
        System.out.println(cat.species);

        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        System.out.println(cat.weight);
        cat.feed();
        cat.takeForAWalk();




    }
}