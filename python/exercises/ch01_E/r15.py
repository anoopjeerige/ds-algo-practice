def sum_squares(n):
    assert n > 0
    return sum(x ** 2 for x in range(n))

if __name__ == '__main__':
    x = int(input("Enter a positive number n: "))
    print("Sum of squares less than {} : {}".format(x, sum_squares(x)))
