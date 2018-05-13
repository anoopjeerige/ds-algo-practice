def minmax(data):
    # one approach
    #sorted_data = sorted(data)
    #return sorted_data[0], sorted_data[-1]
    x_min = x_max = data[0]
    for x in data[1:]:
        if x < x_min:
            x_min = x
        if x > x_max:
            x_max = x

    return x_min, x_max

if __name__ == '__main__':
    user_data = input("Enter a sequence of one or more numbers: ").split()
    print("Smallest - {0[0]} Largest - {0[1]}".format(minmax(list(map(int, user_data)))))
