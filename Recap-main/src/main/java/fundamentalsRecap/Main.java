package fundamentalsRecap;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello World.");
//        System.out.println("Hello Geta");
//        System.out.println("Switch to main branch again");
//        System.out.println("new line");
//        System.out.println("Hello Geta.");
//        System.out.println("Switch to main branch again.");
//        System.out.println("Adaugam o linie noua in main.");
        Animal animal = new Cat();
        animal.walk();
        System.out.println(animal.n);
        System.out.println(10 * 20 + "Javatpoint");
        System.out.println("Javatpoint" + 10 * 20);
        System.out.println("Javatpoint" + 10 + 20);
        String s1 = "Ana";
        String s2 = "Ana";
        String s3 = new String("Ana");
        String s4 = new String("Ana");

        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s3.equals(s4));
        ImmutableClass immutableObject = new ImmutableClass(3,"a");
//        immutableObject.x = 3;
//        System.out.println(immutableObject.x);
//        immutableObject.x = 5;
        System.out.println(immutableObject.getX());
    }
}
