def minmax(data):
    d_min = d_max = data[0]
    for a in data[1:]:
        if a < d_min:
            d_min = a
        if a > d_max:
            d_max = a
    return d_min, d_max

if __name__ == '__main__':
    in_str = input("input numbers, seprate with blank:")
    data = [float(d) for d in in_str.split()]
    data_minmax = minmax(data)
print("min :{} max: {}".format(data_minmax[0], data_minmax[1]))
