package ArraysNumber;


import java.util.List;
import java.util.stream.Collectors;
public class ArraysNumber {
    public String compareAverages(List<Integer> list1, List<Integer> list2) {
        double average1 = calculateAverage(list1);
        double average2 = calculateAverage(list2);

        if (average1 > average2) {
            return "Первый список имеет большее среднее значение";
        } else if (average1 < average2) {
            return "Второй список имеет большее среднее значение";
        } else {
            return "Средние значения равны";
        }
    }

    double calculateAverage(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Список чисел не может быть пустым");
        }

        return list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);
    }
}

