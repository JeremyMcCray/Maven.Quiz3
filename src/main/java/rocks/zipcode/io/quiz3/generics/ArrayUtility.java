package rocks.zipcode.io.quiz3.generics;

import java.util.function.Function;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }



    public SomeType findOddOccurringValue() {

        for (SomeType elem: array) {

        }
        return null;
    }


    public SomeType findEvenOccurringValue() {

        return null;
    }


    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        int counter = 0;
        for (SomeType element: array) {
            if(element.equals(valueToEvaluate)){
                counter++;
            }
        }
        return counter;
    }


    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        return null;
    }
}
