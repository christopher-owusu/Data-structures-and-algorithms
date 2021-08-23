package com.company.hashTable.hashTableswithLinearProbing;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Students stu = new Students(1,"Derek", "Mensah");
        Students stu1 = new Students(2,"Maxwell", "Goku");
        Students stu2 = new Students(3,"Patience", "Beauty");
        Students stu3 = new Students(4,"Alice", "Acheampong");
        Students stu4 = new Students(5,"Dominic", "Bigmann");
        Students stu5 = new Students(6,"Kelvin", "Ohene");
        Students stu6 = new Students(7,"Yvette", "Klu");

        // Create for hashing
//        Hashing hashing = new Hashing();
//        hashing.put("Mensah", stu);
//        hashing.put("Goku", stu1);
//        hashing.put("Beauty", stu2);
//        hashing.put("Acheampong", stu3);
//        hashing.put("Bigmann", stu4);
//        hashing.put("Ohene", stu5);
//        hashing.put("Klu", stu6);

        // Create for hashing with linear probing
        HashingwithLinearProbing hashingwithLinearProbing = new HashingwithLinearProbing();
        hashingwithLinearProbing.put("Mensah", stu);
        hashingwithLinearProbing.put("Goku", stu1);
        hashingwithLinearProbing.put("Beauty", stu2);
        hashingwithLinearProbing.put("Acheampong", stu3);
        hashingwithLinearProbing.put("Bigmann", stu4);
        hashingwithLinearProbing.put("Ohene", stu5);
        hashingwithLinearProbing.put("Klu", stu6);


//         Call for hashing
//        hashing.printHashTable();
//        System.out.println("Get for Mensah: " + hashing.get("Mensah"));


        // Call for hashingwithLinearProbing
        hashingwithLinearProbing.printHashTable();
        System.out.println("Get for Mensah: " + hashingwithLinearProbing.get("Mensah"));
        System.out.println("Get for Klu: " + hashingwithLinearProbing.get("Klu"));

    }
}
