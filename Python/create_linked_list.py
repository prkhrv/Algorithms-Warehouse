class Node:
    def __init__(self,data) -> None:
        self.data = data
        self.next = None

class LinkedList:
    def __init__(self) -> None:
        self.head = None

    def insert(self,data):
        newNode = Node(data)
        if(self.head):
            currentNode = self.head
            while(currentNode.next):
                currentNode = currentNode.next
            currentNode.next = newNode
        else:
            self.head = newNode
    
    def view(self):
        headNode = self.head
        while(headNode):
            print(headNode.data,end="-->")
            headNode = headNode.next


    
myList = LinkedList()
arr = [1,2,3,4,5,6,7]

for i in arr:
    myList.insert(i)

myList.view()


