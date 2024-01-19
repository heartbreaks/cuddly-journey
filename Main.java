import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

// Проверочный класс
public class Main {
    public static void main(String[] args) {
        HashSet<Human> s = new HashSet<>();
        s.add(new Human("John", "Doe", 30));
        s.add(new Human("Alice", "Smith", 25));
        s.add(new Human("Bob", "Johnson", 40));

        // LinkedHashSet
        LinkedHashSet<Human> linkedHashSet = new LinkedHashSet<>(s);
        System.out.println("LinkedHashSet: " + linkedHashSet);

        // TreeSet с естественным порядком
        TreeSet<Human> treeSet = new TreeSet<>(s);
        System.out.println("TreeSet (natural order): " + treeSet);

        // TreeSet с компаратором по фамилии
        TreeSet<Human> treeSetByLName = new TreeSet<>(new HumanComparatorByLName());
        treeSetByLName.addAll(s);
        System.out.println("TreeSet (by last name): " + treeSetByLName);

        // TreeSet с анонимным компаратором по возрасту
        TreeSet<Human> treeSetByAge = new TreeSet<>(new Comparator<Human>() {
            @Override
            public int compare(Human h1, Human h2) {
                return Integer.compare(h1.getAge(), h2.getAge());
            }
        });
        treeSetByAge.addAll(s);
        System.out.println("TreeSet (by age): " + treeSetByAge);
    }
}
