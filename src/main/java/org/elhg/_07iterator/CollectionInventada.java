package org.elhg._07iterator;

import java.util.Iterator;

public class CollectionInventada<E> implements Iterable<E>{

    private E[] array;
    private static final int DEFAULT_CAPACITY = 10;

    //Numero de elementos que tiene el array actualamente
    private int size;

    public CollectionInventada() {
        this(DEFAULT_CAPACITY);
    }

    public CollectionInventada(int capacity) {
        size = 0;
        // Incorrecto : array = new E[capacity];
        array = (E[]) new Object[capacity];
    }


    public void add (E e){
        ensureCapacity();
        size++;
        array[size] = e;
    }

    private void ensureCapacity() {
        if(size == array.length){
            int newSize = array.length * 2;
            E[] newArray = (E[]) new Object[newSize];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < size;
            }

            @Override
            public E next() {
                currentIndex ++;
                return array[currentIndex];
            }
        };
    }
}
