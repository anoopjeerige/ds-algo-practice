num_courses = 0
total_points = 0
points = {'A+':4.0, 'A':4.0, 'A-':3.67, 'B+':3.33, 'B':3.0,
'B-':2.67, 'C+':2.33, 'C':2.0, 'C':1.67, 'D+':1.33, 'D':1.0, 'F':0.0}
print("Enter the grades one by one and a blank line at the end")
for _ in range(10):
    grade = input()
    if grade == '':
        break
    elif grade not in points:
        print("Unknown grade {0} being ignored".format(grade))
    else:
        num_courses += 1
        total_points += points[grade]
if num_courses > 0:
    print("Your GPA is {0:.3op}".format(total_points/num_courses))
