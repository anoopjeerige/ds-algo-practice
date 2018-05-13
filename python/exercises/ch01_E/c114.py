def odd_product(input_list):
    done = False
    for i in range(len(input_list)):
        if not done:
            for j in range(len(input_list)):
                if j != i:
                    if (int(input_list[i]) * int(input_list[j])) % 2 != 0:
                        print("Pair ({}, {}) has odd product".format(input_list[i], input_list[j]))
                        done = True
                        break

def odd_product_better(n):
    count = 0
    odd_pair = []
    for item in n:
        if int(item) % 2 != 0:
            odd_pair.append(item)
            count += 1
    if count == 2:
        print("Pair ({}, {}) has odd product".format(odd_pair[0], odd_pair[1]))


if __name__ == '__main__':
    user_in = input("Enter sequence of numbers").split()
    odd_product(user_in)
    odd_product_better(user_in)
