def read_std_input():
    data = []
    while True:
        try:
            data.append(input("Enter the data: "))
        except EOFError:
            break

    for i in range(1, len(data)+1):
        print(data[-i])

if __name__ == '__main__':
    read_std_input()
