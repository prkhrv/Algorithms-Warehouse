class Stack:
    def __init__(self) -> None:
        self.data = []
    
    def push(self,val):
        self.data.insert(0,val)

    def pop(self):
        self.data.pop(0)
    
    def show(self):
        print(self.data)
        


my_stack = Stack()
my_stack.push(2)
my_stack.push(1)
my_stack.push(3)
my_stack.push(5)
my_stack.pop()
my_stack.push(6)


my_stack.show()



    