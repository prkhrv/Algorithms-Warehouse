#binary_search

test_arr = [2, 5, 6, 1, 8, 3]


def binary_search(arr, top, bottom, key):

    if bottom >= top:
        mid = (top+bottom)//2

        if arr[mid] == key:
            return mid
        
        elif arr[mid] > key:
            return binary_search(arr,top,mid-1,key)
        
        elif arr[mid] < key:
            return binary_search(arr,mid+1,bottom,key)
    else:
        return -1


# driver code
test_arr.sort()
print(test_arr)
res = binary_search(test_arr, 0, len(test_arr)-1, 8)
if res != -1: 
    print("Element is present at index", str(res)) 
else: 
    print("Element is not present in array") 
