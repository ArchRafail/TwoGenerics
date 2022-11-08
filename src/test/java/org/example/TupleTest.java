package org.example;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class TupleTest {

    @Test
    public void checkInstanceCreationAndGenerics() {

        Double testValueDouble = 12345.6789;
        Tuple<Double, Integer> tupleTwoValues2 = Tuple.of(testValueDouble);
        Double resultValueDouble2 = tupleTwoValues2.getFirst();
        assertEquals(testValueDouble, resultValueDouble2);
        Integer resultIntValue2 = tupleTwoValues2.getSecond();
        assertNull(resultIntValue2);

        Tuple<Float, String> tupleTwoValues3 = Tuple.of();
        Float resultValueFloat3 = tupleTwoValues3.getFirst();
        String resultValueString3 = tupleTwoValues3.getSecond();
        assertNull(resultValueFloat3);
        assertNull(resultValueString3);
    }

    @Test
    public void checkSettersAndGetters() {
        Tuple<Integer, String> tupleInstance = Tuple.of();
        assertNull(tupleInstance.getFirst());
        int intValue = 98765;
        tupleInstance.setFirst(intValue);
        assertEquals(intValue, tupleInstance.getFirst());
        String stringValue = "Auxiliary string value";
        tupleInstance.setSecond(stringValue);
        assertEquals(stringValue, tupleInstance.getSecond());
    }

    @Test
    public void checkConstructionModifier(){
        Constructor<?>[] constructors = Tuple.class.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            assertEquals("private", Modifier.toString(constructor.getModifiers()));
        }
    }

}
