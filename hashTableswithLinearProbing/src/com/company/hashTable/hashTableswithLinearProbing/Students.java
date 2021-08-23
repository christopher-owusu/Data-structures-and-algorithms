package com.company.hashTable.hashTableswithLinearProbing;

public class Students {

    private int id;
    private String fname;
    private String lname;

    public Students(final int id, final String fname, final String lname) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
    }

    public int getID() { return id; }

    public String getFname() { return fname; }

    public String getLname() { return lname; }

    public String toString() {
        return "Students{" + "id = " + id + ", fname = " + fname + ", lname = " + lname + " \"}";
    }

}
