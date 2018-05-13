def my_reverse(n):
    result = []
    for i in range(1, len(n)+1):
        result.append(n[-i])
    return result

if __name__ == '__main__':
    to_reverse = input("Enter seqeuence of items separated by spaces to be reversed\n").split()
    print("Original sequence: {0} \nReversed sequence: {1}".format(to_reverse, my_reverse(to_reverse)))
