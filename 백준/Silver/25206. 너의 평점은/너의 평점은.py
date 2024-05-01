sum_credit = 0
total_grade = 0

for i in range(20):
    subject, credit, grade = input().split()
    credit = float(credit)
    if grade != 'P':
        sum_credit += credit
        if(grade=='A+'):
            total_grade += credit * 4.5
        elif(grade=='A0'):
            total_grade += credit * 4.0
        elif(grade=='B+'):
            total_grade += credit * 3.5
        
        elif(grade=='B0'):
            total_grade += credit * 3.0
        elif(grade=='C+'):
            total_grade += credit * 2.5
        elif(grade=='C0'):
            total_grade += credit * 2.0
        elif(grade=='D+'):
            total_grade += credit * 1.5
        elif(grade=='D0'):
            total_grade += credit * 1.0
        elif(grade=='F'):
            total_grade += credit * 0.0

average = total_grade/sum_credit

print(round(average,6))

# (credit*grade)