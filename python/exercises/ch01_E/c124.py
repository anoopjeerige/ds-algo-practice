def count_vowels(s):
    result = 0
    for ch in s:
        if ch in 'aeiou':
            result += 1;
    return result

if __name__ == '__main__':
    ch_string = input("Enter a character string: ")
    print("Count of vowels : {}".format(count_vowels(ch_string)))
