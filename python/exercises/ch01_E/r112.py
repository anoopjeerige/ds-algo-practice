from random import randrange

def c_choice(data):
    return data[randrange(len(data))]

if __name__ == '__main__':
    user_data = input("Enter a sequence of items").split()
    print("Item chosen at random from the sequence: {}".format(c_choice(user_data)))
