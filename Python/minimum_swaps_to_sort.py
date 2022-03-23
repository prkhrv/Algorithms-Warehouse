a = [1,5,4,3,2]

def min_swaps(arr):
    ans = 0
    control = arr.copy()
    control.sort()

    for index in range(0,len(arr)):
        if control[index] != arr[index]:
            ans = ans+1
            
            swap(arr,index,indexOf(arr,control[index]))
    
    return ans


def swap(arr,i,j):
    arr[i],arr[j] = arr[j],arr[i]

def indexOf(arr,elem):
    for i in range(len(arr)):
        if arr[i] == elem:
            return i
    return -1

print(min_swaps(a))
