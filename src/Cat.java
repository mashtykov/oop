public class Cat {
    private String name;
    int age;
    boolean hungry = true;
    public static int count = 0;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        if (newName != "") {
            this.name = name;
        }

    }

    private void meow() {
        System.out.println("м€у!");
    }

    public void wontToOut() {
        System.out.println("скребет дверь");
        meow();
    }

    public void countCats() {
        count++;
        System.out.println("создана кошка номер " + count);
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        countCats();
    }

    public Cat() {
        countCats();
    }
}
