// QUESTION:  https://www.codewars.com/kata/53dbd5315a3c69eed20002dd/train/java
package CodeWars;

import java.util.ArrayList;
import java.util.List;

//// FOR UNIT TESTING
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListFiltering {
    public static void main(String[] args) {
        ListFiltering.filterList(List.of(1, 2, "a", "b"));
        ListFiltering.filterList(List.of(1, 2, "a", "b", 0, 15));
        ListFiltering.filterList(List.of(1, 2, "a", "b", "aasf", "1", "123", 231));
    }
    public static List<Object> filterList(final List<Object> list) {
        if (list.isEmpty()){
            return list;
        }
        List<Object> myList = new ArrayList<>();
        for (Object object: list) {
            if (object instanceof Integer){
                myList.add(object);
            }
        }
        return myList;
    }
}

//class ExampleTests {
//    @Test
//    public void examples() {
//        assertEquals(List.of(1, 2), ListFiltering.filterList(List.of(1, 2, "a", "b")), "For input: [1, 2, \"a\", \"b\"]");
//        assertEquals(List.of(1, 0, 15), ListFiltering.filterList(List.of(1, "a", "b", 0, 15)), "For input: [1, \"a\", \"b\", 0, 15]");
//        assertEquals(List.of(1, 2, 123), ListFiltering.filterList(List.of(1, 2, "aasf", "1", "123", 123)), "For input: [1, 2, \"aasf\", \"1\", \"123\", 123]");
//    }
//}
