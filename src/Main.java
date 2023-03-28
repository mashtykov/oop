public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.age = 2;
        cat1.hungry = false;
        cat1.setName("Барсик");
        cat1.setName("");

        System.out.println("Имя кошки " + cat1.getName());
        System.out.println("Возраст " + cat1.age);
        System.out.println("кошка голодная? " + cat1.hungry);
        System.out.println();

        cat1.wontToOut();
        System.out.println();

        Cat cat2 = new Cat("Мурзик",3);
        cat1.age = 5;

        System.out.println("Имя кошки " + cat2.getName());
        System.out.println("Возраст " + cat2.age);
        System.out.println("кошка голодная? " + cat2.hungry);
        System.out.println();

        System.out.println("\nЧисло кошек: " );


    }
}
