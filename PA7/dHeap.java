/*
 * Name: TODO
 * PID:  TODO
 */

import java.util.*;

/**
 * TODO
 * 
 * @param <T> Generic type
 */
public class dHeap<T extends Comparable<? super T>> implements dHeapInterface<T> {

    private T[] heap; // heap array
    private int d; // branching factor
    private int nelems; // number of elements
    private boolean isMaxHeap; // boolean to indicate whether heap is max or min

    /**
     * Initializes a binary max heap with capacity = 6
     */
    @SuppressWarnings("unchecked")
    public dHeap() {
        /* TODO */
    }

    /**
     * Initializes a binary max heap with a given initial capacity.
     *
     * @param heapSize The initial capacity of the heap.
     */
    @SuppressWarnings("unchecked")
    public dHeap(int heapSize) {
        /* TODO */
    }

    /**
     * Initializes a d-ary heap (with a given value for d), with a given initial
     * capacity.
     *
     * @param d         The number of child nodes each node in the heap should have.
     * @param heapSize  The initial capacity of the heap.
     * @param isMaxHeap indicates whether the heap should be max or min
     * @throws IllegalArgumentException if d is less than one.
     */
    @SuppressWarnings("unchecked")
    public dHeap(int d, int heapSize, boolean isMaxHeap) throws IllegalArgumentException {
        /* TODO */
    }

    @Override
    public int size() {
        /* TODO */
        return -1;
    }

    @Override
    public void add(T data) throws NullPointerException {
        /* TODO */
    }

    @Override
    public T remove() throws NoSuchElementException {
        /* TODO */
        return null;
    }

    @SuppressWarnings("unchecked")
    @Override
    public void clear() {
        /* TODO */
    }

    public T element() throws NoSuchElementException {
        /* TODO */
        return null;
    }

    private void trickleDown(int index) {
        /* TODO */
    }

    private void bubbleUp(int index) {
        /* TODO */
    }

    @SuppressWarnings("unchecked")
    private void resize() {
        /* TODO */
    }

    private int parent(int index) {
        /* TODO */
        return -1;
    }

}
