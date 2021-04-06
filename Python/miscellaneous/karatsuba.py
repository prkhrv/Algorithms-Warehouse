#Karatsuba multiplication

def karatsuba(num1,num2):
    n1 = str(num1)
    n2 = str(num2)
    
    if num1 < 10 or num2 <10:
        return num1*num2
    
    maxLength = max(len(n1),len(n2))
    split = maxLength // 2
    a,b = int(n1[:-split]),int(n1[-split:])
    c,d = int(n2[:-split]),int(n2[-split:])
    z0 = karatsuba(a,c)
    z1 = karatsuba(b,d)
    z2 = karatsuba((a + b), (c + d))
    
    return (z0*10**(2*split)) + ((z2-z1-z0)*10**(split))+z1


print(karatsuba(3141592653589793238462643383279502884197169399375105820974944592,2718281828459045235360287471352662497757247093699959574966967627))
