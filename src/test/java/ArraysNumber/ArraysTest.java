package ArraysNumber;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysTest {
    private ArraysNumber averageComparator = new ArraysNumber();

    @Test
    public void testCompareAverages_FirstListHasGreaterAverage() {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(1, 1, 1);
        String result = averageComparator.compareAverages(list1, list2);
        Assert.assertEquals("Первый список имеет большее среднее значение", result);
    }

    @Test
    public void testCompareAverages_SecondListHasGreaterAverage() {
        List<Integer> list1 = Arrays.asList(1, 1, 1);
        List<Integer> list2 = Arrays.asList(1, 2, 3);
        String result = averageComparator.compareAverages(list1, list2);
        Assert.assertEquals("Второй список имеет большее среднее значение", result);
    }

    @Test
    public void testCompareAverages_AveragesAreEqual() {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(3, 2, 1);
        String result = averageComparator.compareAverages(list1, list2);
        Assert.assertEquals("Средние значения равны", result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalculateAverage_EmptyList() {
        List<Integer> emptyList = Collections.emptyList();
        averageComparator.calculateAverage(emptyList);
    }
}
