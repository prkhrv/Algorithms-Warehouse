def push(element):
    global top
    top = top+1
    stack.append(element)

def pop():
    global top

    if top >= 0:
         temp = stack[top]
         stack.remove(stack[top])
         top = top-1
         print("{} is popped out".format(temp))
    else:
        print("stack is Empty ")




stack = list()
top  = -1
push(5)
push(4)
push(6)
push(7)
print("stack ")
print(stack)

pop()
print(stack)
push(0)
print(stack)
pop()
