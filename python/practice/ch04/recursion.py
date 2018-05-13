import os

def factorial(n):
    if n == 0:
        return 1
    else:
        return n * factorial(n-1)

def draw_line(tick_length, tick_label=''):
    line = "-" * tick_length
    if tick_label:
        line += ' ' + tick_label
    print(line)

def draw_interval(center_length):
    if center_length > 0:
        draw_interval(center_length - 1)
        draw_line(center_length)
        draw_interval(center_length - 1)

def draw_ruler(num_inches, major_length):
    draw_line(major_length, str(0))
    for i in range(1, 1 + num_inches):
        draw_interval(major_length - 1)
        draw_line(major_length, str(i))

def binary_search(data, target, low, high):
    if low > high:
        return False
    else:
        mid = (low + high) // 2
        if target == data[mid]:
            return True
        elif target < data[mid]:
            return binary_search(data, target, low, mid - 1)
        else:
            return binary_search(data, target, mid + 1, high)

def disk_usage(path):
    total = os.path.getsize(path)
    if os.path.isdir(path):
        for item in os.listdir(path):
            total += disk_usage(os.path.join(path, item))
    print('{0:<7}'.format(total), path)
    return total

if __name__=='__main__':
    #print(factorial(4))
    #draw_line(5, str(5))
    #draw_ruler(1, 5)
    #print(binary_search([1, 2, 3, 4], 5, 0, 3))
    disk_usage("/home/anoop/practice")
