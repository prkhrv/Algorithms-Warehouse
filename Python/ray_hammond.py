from itertools import permutations
 
n = 20
cols = range(n)

def board(vec):
    print ("\n".join('.' * i + 'Q' + '.' * (n-i-1) for i in vec) + "\n===\n")

for vec in permutations(cols):
    if n == len(set(vec[i]+i for i in cols)) \
         == len(set(vec[i]-i for i in cols)):
        board(vec)