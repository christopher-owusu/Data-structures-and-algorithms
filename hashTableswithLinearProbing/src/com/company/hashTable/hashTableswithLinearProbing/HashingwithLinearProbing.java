package com.company.hashTable.hashTableswithLinearProbing;

import java.util.Arrays;

public class HashingwithLinearProbing {

    private StoredStudents[] hashtable;

    public HashingwithLinearProbing() {
        hashtable = new StoredStudents[5];
    }

    private boolean occupiedIndex(final int hashIndex) {
        return hashtable[hashIndex] != null;
    }

    private int hashfunction(String key) {
        return key.length() % hashtable.length;
    }


    public void printHashTable() {
        Arrays.stream(hashtable).forEach(System.out::println);
    }

    public void put(String key, Students students) {
        int hashIndex = hashfunction(key);

        int stopIndex = 0;
        if (occupiedIndex(hashIndex)) {
            if (hashIndex == hashtable.length - 1) {
                hashIndex = 0;
            }
            if (occupiedIndex(hashIndex)) {
                while (occupiedIndex(hashIndex) && stopIndex < hashtable.length) {
                    hashIndex++;
                    stopIndex++;
                    if (stopIndex == hashtable.length) {
                        break;
                    }
                    if (hashIndex == hashtable.length) {
                        hashIndex = 0;
                    }
                }
            }
        }
        if (stopIndex == hashtable.length) {
            System.out.println("Hashtable is full");
        }else {
            hashtable[hashIndex] = new StoredStudents(key, students);
        }
    }

    public Students get(String key) {
        int hashIndex = hashfunction(key);
        if (hashtable[hashIndex].key.equals(key)) {
            return hashtable[hashIndex].students;
        }else {
            int stopIndex = 0;

            while (!hashtable[hashIndex].key.equals(key)) {
                if (stopIndex == hashtable.length) {
                    break;
                }
                if (hashIndex == hashtable.length - 1) {
                    hashIndex = 0;
                }
                hashIndex++;
                stopIndex++;
            }
        }
        if (hashtable[hashIndex].key.equals(key)) {
            return hashtable[hashIndex].students;
        }
        return null;
    }
}
