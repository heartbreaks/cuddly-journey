import java.util.Comparator;

// Класс HumanComparatorByLName
public class HumanComparatorByLName implements Comparator<Human> {
    @Override
    public int compare(Human h1, Human h2) {
        return h1.getLastName().compareTo(h2.getLastName());
    }
}
