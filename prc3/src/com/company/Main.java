// Main.java:

package com.company;

class Main
{
    public static void main(String[] args)
    {
        var shapes = new Shape[10];

        for (int i = 0; i < 10; i++)
        {
            if (i % 2 == 0)
            {
                shapes[i] = new Circle(Math.random() * 100, "Black", i % 3 == 0);
            }
            else
            {
                shapes[i] = new Rectangle(Math.random() * 100, Math.random() * 100, "Black",  i % 3 == 0);
            }
        }

        for (var current : shapes)
        {
            System.out.println(current.toString());
            System.out.println();
        }
    }
}

// Output:

/*
Circle:
S=25292,163982
P=563,764761
Color=Black
IsFilled?=true

Rectangle:
S=2292,427007
P=195,928678
Color=Black
IsFilled?=false

Circle:
S=8000,897800
P=317,083975
Color=Black
IsFilled?=false

Rectangle:
S=7852,229244
P=355,323620
Color=Black
IsFilled?=true

Circle:
S=11312,424698
P=377,035968
Color=Black
IsFilled?=false

Rectangle:
S=5037,675872
P=286,707222
Color=Black
IsFilled?=false

Circle:
S=10981,758205
P=371,484648
Color=Black
IsFilled?=true

Rectangle:
S=1538,613942
P=170,725174
Color=Black
IsFilled?=false

Circle:
S=147,057075
P=42,988065
Color=Black
IsFilled?=false

Rectangle:
S=4174,571100
P=274,180090
Color=Black
IsFilled?=true


Process finished with exit code 0
*/