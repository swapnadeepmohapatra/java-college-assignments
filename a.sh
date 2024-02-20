#!bin/bash

# Calc the grade of a student entering 5 subject marks using switch case

echo "Enter the marks of 5 subjects"
read m1
read m2
read m3
read m4
read m5

sum=$(($m1+$m2+$m3+$m4+$m5))
grade=$(($sum/500))

case $grade in
    10)
        echo "Grade: A"
        ;;
    9)
        echo "Grade: B"
        ;;
    8)
        echo "Grade: C"
        ;;
    7)
        echo "Grade: D"
        ;;
    6)
        echo "Grade: E"
        ;;
    *)
        echo "Grade: F"
        ;;
esac
```