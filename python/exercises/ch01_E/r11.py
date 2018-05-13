def is_multiple(n, m):
    return n % m == 0


if __name__ == '__main__':
    x, y = input("Is n a mutiple of m?.\nEnter n and m : ").split()
    print("Is {} a mutiple of {} : {}".format(x, y, is_multiple(int(x), int(y))))
