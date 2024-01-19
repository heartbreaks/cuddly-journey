import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ListManipulation {
    public static void main(String[] args) {
        int N = 10; // Замените 10 на желаемый размер массива
        Integer[] numbers = new Integer[N];

        // Заполняем массив случайными числами
        for (int i = 0; i < N; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }

        // Создаем список List из массива
        List<Integer> list = new ArrayList<>(Arrays.asList(numbers));
        System.out.println("Исходный список: " + list);

        // Сортируем список в натуральном порядке
        Collections.sort(list);
        System.out.println("Список после сортировки: " + list);

        // Сортируем список в обратном порядке
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Список после обратной сортировки: " + list);

        // Перемешиваем список
        Collections.shuffle(list);
        System.out.println("Перемешанный список: " + list);

        // Циклический сдвиг на 1 элемент
        Collections.rotate(list, 1);
        System.out.println("Список после циклического сдвига: " + list);

        // Оставляем в списке только уникальные элементы
        List<Integer> uniqueList = list.stream().distinct().collect(Collectors.toList());
        System.out.println("Список уникальных элементов: " + uniqueList);

        // Оставляем в списке только дублирующиеся элементы
        List<Integer> duplicateList = list.stream()
                .filter(n -> Collections.frequency(list, n) > 1)
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Список дублирующихся элементов: " + duplicateList);

        // Получаем массив из списка
        Integer[] newArray = list.toArray(new Integer[0]);
        System.out.println("Массив из списка: " + Arrays.toString(newArray));
    }
}
