def grocery_shops(A, k):
    """
    A an integer array for city centers
    k an integer number of shops
    return an integer
    """
    if not A:
        return 0

    n = len(A) # n is the number of city centers.

    if k >= n: # we should not have more shops than city centers.
        return 0

    A.sort()
    cost = [[0 for _ in range(n + 1)] for _ in range(n + 1)]

    """
    cost[i][j] is the minimum cost to build a shop between city centers i and j
    This shop should be in the median of the city centers.
    """
    for i in range(n):
        for j in range(i, n):
            mid = int(i + (j - i) / 2)
            print("i= ", i, " j= ", j, "Median is: ", mid, " Center:",  A[mid], "\n")

            for r in range(i, mid + 1):
                cost[i + 1][j + 1] += A[mid] - A[r]
                print("dist of ", A[mid] ," --to-> " ,  A[r], " Right ", cost[i + 1][j + 1])
            for r in range(mid + 1, j + 1):
                cost[i + 1][j + 1] += A[r] - A[mid]
                print("dist of ",  A[mid] ," <--to-- " ,  A[r], " Left ", cost[i + 1][j + 1])
            print("COST: ", "(", A[i ], "," ,A[j], " )", cost[i + 1][j + 1], "\n\n")


    # print("cost")
    # for row in cost:
    #   for c in row:
    #     print(c, end = " ")
    #   print()
    """
    dp[i][j] is the minimum cost for the first j city centers with i shops.
    """
    dp = [[float('inf') for _ in range(n + 1)] for _ in range(k + 1)]
    dp[0][0] = 0

    for i in range(1, k + 1):
        for j in range(1, n + 1):
            for r in range(j):
                dp[i][j] = ??? # Fill this out..

    # print("\n\nDP Table")
    # for row in dp:
    #   for c in row:
    #     print(c, end = "       ")
    #   print("\n")

    return dp[-1][-1]


if __name__ == '__main__':

    city_centers_array = [50, 2, 3, 6, 7, 9, 11, 21, 40, 1] # <--- city
    number_of_shops = 5   # <--- number of shops

    print(f"The result is: "
          f"{grocery_shops(city_centers_array, number_of_shops)}")
    print("(The sum of all distances between each city center and its nearest grocery shop)")
