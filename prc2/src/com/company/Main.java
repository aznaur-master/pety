// Main.java:

package com.company;

class Main
{
    public static void main(String[] args)
    {
        Author author1 = new Author("Dmitriy", "dima@domain.url", 'M');
        Author author2 = new Author("Egor", "egor@domain.url", 'M');

        System.out.println(author1);
        System.out.println();
        System.out.println(author2);
    }
}

// Output:

/*
Author:
Name = Dmitriy
Email = dima@domain.url
Gender = M

Author:
Name = Egor
Email = egor@domain.url
Gender = M
 */