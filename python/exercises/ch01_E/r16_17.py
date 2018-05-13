def sum_odd_squares(n):
    return sum(x ** 2 for x in range(n) if not x % 2 ==0)

if __name__ == '__main__':
    x = int(input("Enter a positive number: "))
    print("Sum of squares of odds less than {} : {}".format(x, sum_odd_squares(x)))
