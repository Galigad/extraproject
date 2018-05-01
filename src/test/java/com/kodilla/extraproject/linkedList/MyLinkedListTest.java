package com.kodilla.extraproject.linkedList;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class MyLinkedListTest {
    @Test
    public void testAddingToList() {
        //Given
        MyLinkedList list = new MyLinkedList();
        list.add("Jeden");
        list.add("Dwa");
        list.add("Trzy");
        //When
        String result = list.get(2);
        //Then
        Assert.assertEquals("Trzy", result);
    }

    @Test
    public void testSearchingList() {
        //Given
        MyLinkedList list = new MyLinkedList();
        for (int i = 0; i < 1000; i++) {
            list.add(String.valueOf(String.valueOf(i)));
        }
        //When
        String result = list.get(429);
        //Then
        Assert.assertEquals("429", result);
    }

    @Test
    public void testSearchExeption() {
        //Given
        MyLinkedList list = new MyLinkedList();
        for (int i = 0; i < 100; i++) {
            list.add(String.valueOf(String.valueOf(i)));
        }
        //When
        String result = list.get(429);
        //Then
        Assert.assertEquals("There is no such index",result);
    }

    @Test
    public void testDeletingFromList() {
        //Given
        MyLinkedList list = new MyLinkedList();
        for (int i = 0; i < 1000; i++) {
            list.add(String.valueOf(i));
        }
        //When
        Boolean result = list.delete("501");
        //Then
        Assert.assertTrue("501", true);

    }
}
