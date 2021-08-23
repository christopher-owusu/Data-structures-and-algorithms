package com.company.hashTable.hashTableswithLinearProbing;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Hashing {

    private Students[] hashtable;

    public Hashing() {
        hashtable = new Students[10];
    }

    private int hashFunction(String key) {
        return key.length() % hashtable.length;
    }

    void put(final String key, final Students students) {
        int hashindex = hashFunction(key);

        if (hashtable[hashindex] != null) {
            System.out.println("Collision has occured at index: " + hashindex + " key: " + key);
        }else {
            hashtable[hashindex] = students;
        }
    }

    public void printHashTable() {
        Arrays.stream(hashtable).forEach(System.out::println);
    }

    public Students get(String key) {
        int hashIndex = hashFunction(key);
        return hashtable[hashIndex];
    }
}
