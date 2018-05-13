import random

def custom_shuffle(items):
    n = len(items)
    for i in range(n):
        j = random.randint(0, n-1)
        items[i], items[j] = items[j], items[i]

if __name__ == '__main__':
    inputs = input("Enter items to be shuffled").split()
    copy = list(inputs)
    print(inputs)
    custom_shuffle(inputs)
    print(inputs)
    print(copy)
    random.shuffle(copy)
    print(copy)
