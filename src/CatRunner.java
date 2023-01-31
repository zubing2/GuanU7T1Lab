import java.util.ArrayList;

public class CatRunner {
    public static void main(String[] args) {

        ArrayList<Cat> cats = new ArrayList<Cat>();
        Cat cat1 = new Cat("Ben");
        Cat cat2 = new Cat("Andy");
        Cat cat3 = new Cat("David");
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        System.out.println(cats);

        Cat cat4 = new Cat("Ray");
        cats.set(2, cat4);
        System.out.println(cats);
        System.out.println(cat3);
        cat4.setName(cat4.getName() + " Meow");
        System.out.println(cat4);
        for (int i = 0; i < cats.size(); i++) {
            String temp = cats.get(i).getName().toUpperCase();
            cats.get(i).setName(temp);
        }
        System.out.println(cats);
        cats.add(new Cat("SAM"));
        System.out.println(cats);
    }
}
