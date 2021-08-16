package com.company.mergeSort3c;

class linkedList {
    node head = null;
    static class node {
        int val;
        node next;

        public node(int val)
        {
            this.val = val;
        }
    }

    node sortedMerge(node a, node b)
    {
        node result = null;
        if (a == null)
            return b;
        if (b == null)
            return a;


        if (a.val <= b.val) {
            result = a;
            result.next = sortedMerge(a.next, b);
        }
        else {
            result = b;
            result.next = sortedMerge(a, b.next);
        }
        return result;
    }

    node mergeSort(node h)
    {

        if (h == null || h.next == null) {
            return h;
        }


        node middle = getMiddle(h);
        node nextofmiddle = middle.next;


        middle.next = null;


        node left = mergeSort(h);


        node right = mergeSort(nextofmiddle);


        node sortedlist = sortedMerge(left, right);
        return sortedlist;
    }

    public static node getMiddle(node head)
    {
        if (head == null)
            return head;

        node slow = head, fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    void push(int element)
    {
        node new_node = new node(element);
        new_node.next = head;

        head = new_node;
    }

    void printList(node headEle)
    {
        while (headEle != null) {
            System.out.print(headEle.val + " ");
            headEle = headEle.next;
        }
    }

}

public class Main {

    public static void main(String[] args) {
	// write your code here

        linkedList list = new linkedList();

        list.push(4);
        list.push(18);
        list.push(5);
        list.push(12);
        list.push(3);
        list.push(1);

        list.head = list.mergeSort(list.head);

        System.out.print(" Sorted Linked List is: ");

        list.printList(list.head);
    }
}
