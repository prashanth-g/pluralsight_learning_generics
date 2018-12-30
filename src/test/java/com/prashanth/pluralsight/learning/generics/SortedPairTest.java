package com.prashanth.pluralsight.learning.generics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortedPairTest {

    @Test
    void shouldRetainOrderOfOrderedPair() {
        SortedPair<Integer> pair = new SortedPair<>(1,2);
        assertEquals(1, pair.getFirst().intValue());
        assertEquals(2, pair.getSecond().intValue());
    }

    @Test
    void shouldFlipOrderOfMisorderedPair() {
        SortedPair<Integer> pair = new SortedPair<>(2,1);
        assertEquals(1, pair.getFirst().intValue());
        assertEquals(2, pair.getSecond().intValue());
    }
}