class Node:
    def __init__(self, element):
        self.element = element
        self.next = None


class singlyLinkedlist:
    def __init__(self):
        self.head = None

    def print_list(self):
        cur_node = self.head
        while cur_node:
            print(cur_node.element)
            cur_node = cur_node.next

    # Add element at the end of the list
    def append(self, element):
        new_node = Node(element)

        if self.head is None:
            self.head = new_node
            return

        last_node = self.head
        while last_node.next:
            last_node = last_node.next
        last_node.next = new_node

    # Insert element at the beginning of the list
    def prepend(self, element):
        new_node = Node(element)

        new_node.next = self.head
        self.head = new_node

    def insert_after_node(self, prev_node, element):
        if not prev_node:
            print("Previous node is not in the list")
            return

        new_node = Node(element)

        new_node.next = prev_node.next
        prev_node.next = new_node


    # Reverse List
    def reverse_iterative(self):
        prev = None
        cur = self.head
        while cur:
            nxt = cur.next
            cur.next = prev
            prev = cur
            cur = nxt
        self.head = prev


    # Remove Duplicate
    def remove_duplicates(self):
        cur = self.head
        prev = None

        dup_values = dict()
        
        while cur:
            if cur.element in dup_values:
                prev.next = cur.next
                cur = None
            else:
                dup_values[cur.element] = 1
                prev = cur
            cur = prev.next

    # Lenght Calculation
    def lenght(self):
        count = 0
        cur_node = self.head

        while cur_node:
            count += 1
            cur_node = cur_node.next
        return count

    # Delete Node
    def delete_node(self, key):
        cur_node = self.head

        if cur_node and cur_node.element == key:
            self.head = cur_node.next
            cur_node = None
            return

        prev = None
        while cur_node and cur_node.element != key:
            prev = cur_node
            cur_node = cur_node.next
        if cur_node is None:
            return

        prev.next = cur_node.next
        cur_node = None

    # Delete from the beginging
    def del_begin(self):
        if self.head is None:
            print("List has no elements")
        else:
            self.head = self.head.next            

    # Delete from the end
    def del_end(self):
        if self.head is None:
            print("List has no elements")
        elif self.head.next is None:
            self.head = None
        else:
            last_node = self.head
        while last_node.next.next is not None:
            last_node = last_node.next
        last_node.next = None

        
          
            

llist = singlyLinkedlist()


llist.append("A")
llist.append("B")
llist.append("C")
llist.append("D")
llist.append("E")

# llist.delete_node("B")

# print(llist.lenght())

# llist.append(1)
# llist.append(6)
# llist.append(1)
# llist.append(4)
# llist.append(2)
# llist.append(2)
# llist.append(4)
# llist.append(1)

# llist.reverse_iterative()

# llist.remove_duplicates()

# llist.prepend("E")

# llist.del_begin()

# llist.del_end()

# llist.insert_after_node(llist.head.next, "E")

llist.print_list()
