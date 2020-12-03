// Main.java

package com.company;

class Main
{
    static void reverse(Student[] array)
    {
        for (int i = 0; i < array.length / 2; i++) {
            Student temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }

    static void insertionSort(Student[] array)
    {
        for (int left = 0; left < array.length; left++) {
            // Вытаскиваем значение элемента

            var value = array[left];
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (value.getId() < array[i].getId()) {
                    array[i + 1] = array[i];
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            array[i + 1] = value;
        }
    }

    public static void main(String[] args)
    {
        var students = Student.getSamples();

        for (var t : students) System.out.println(t);

        System.out.println();
        reverse(students);

        for (var t : students) System.out.println(t);

        System.out.println();
        insertionSort(students);

        for (var t : students) System.out.println(t);
    }
}

// Output:
/*
Student{ id=1, firstname='Noah', secondname='Adderiy', age=16 }
Student{ id=2, firstname='Liam', secondname='Allford', age=17 }
Student{ id=3, firstname='William', secondname='Arnold', age=18 }
Student{ id=4, firstname='Mason', secondname='Adderiy', age=19 }
Student{ id=5, firstname='James', secondname='Allford', age=20 }
Student{ id=6, firstname='Benjamin', secondname='Arnold', age=21 }
Student{ id=7, firstname='Noah', secondname='Adderiy', age=22 }
Student{ id=8, firstname='Liam', secondname='Allford', age=23 }
Student{ id=9, firstname='William', secondname='Arnold', age=24 }
Student{ id=10, firstname='Mason', secondname='Adderiy', age=25 }

Student{ id=10, firstname='Mason', secondname='Adderiy', age=25 }
Student{ id=9, firstname='William', secondname='Arnold', age=24 }
Student{ id=8, firstname='Liam', secondname='Allford', age=23 }
Student{ id=7, firstname='Noah', secondname='Adderiy', age=22 }
Student{ id=6, firstname='Benjamin', secondname='Arnold', age=21 }
Student{ id=5, firstname='James', secondname='Allford', age=20 }
Student{ id=4, firstname='Mason', secondname='Adderiy', age=19 }
Student{ id=3, firstname='William', secondname='Arnold', age=18 }
Student{ id=2, firstname='Liam', secondname='Allford', age=17 }
Student{ id=1, firstname='Noah', secondname='Adderiy', age=16 }

Student{ id=1, firstname='Noah', secondname='Adderiy', age=16 }
Student{ id=2, firstname='Liam', secondname='Allford', age=17 }
Student{ id=3, firstname='William', secondname='Arnold', age=18 }
Student{ id=4, firstname='Mason', secondname='Adderiy', age=19 }
Student{ id=5, firstname='James', secondname='Allford', age=20 }
Student{ id=6, firstname='Benjamin', secondname='Arnold', age=21 }
Student{ id=7, firstname='Noah', secondname='Adderiy', age=22 }
Student{ id=8, firstname='Liam', secondname='Allford', age=23 }
Student{ id=9, firstname='William', secondname='Arnold', age=24 }
Student{ id=10, firstname='Mason', secondname='Adderiy', age=25 }

Process finished with exit code 0

 */