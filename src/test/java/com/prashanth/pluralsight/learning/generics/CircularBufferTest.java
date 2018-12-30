package com.prashanth.pluralsight.learning.generics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CircularBufferTest {

    private CircularBuffer circularBuffer = new CircularBuffer(2);

    @Test
    void shouldOfferPollableElement() {
        assertTrue(circularBuffer.offer(1));
        assertEquals(1, circularBuffer.poll());
        assertNull(circularBuffer.poll());
    }

    @Test
    void shouldNotOfferWhenBufferIsFull() {
        assertTrue(circularBuffer.offer(1));
        assertTrue(circularBuffer.offer(2));
        assertFalse(circularBuffer.offer(3));
    }

    @Test
    void shouldNotPollWhenBufferIsEmpty() {
        assertNull(circularBuffer.poll());
    }

    @Test
    void shouldRecycleBuffer() {
        assertTrue(circularBuffer.offer(1));
        assertTrue(circularBuffer.offer(2));
        assertEquals(1, circularBuffer.poll());
        assertTrue(circularBuffer.offer(3));
        assertEquals(2, circularBuffer.poll());
        assertEquals(3, circularBuffer.poll());
    }
}