package myapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TrianglePredicator {

    public static int predicate(int a, int b, int c) throws Exception {
        List<Integer> sides = new ArrayList<>(Arrays.asList(a, b, c));
        Collections.sort(sides);

        if (sides.get(0) <= 0 || (sides.get(0) + sides.get(1)) <= sides.get(2)) {
            throw new Exception();
        }

        return (int) sides.stream().distinct().count();
    }
}
