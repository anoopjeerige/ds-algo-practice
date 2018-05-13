def is_even(n):
    return n >> 1 << 1 == n
    #return not n & 1

if __name__ == '__main__':
    x = int(input("n is even.\nEnter n: "))
    print("{}".format(is_even(x)))
