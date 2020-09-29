package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //Given
        Book book1 = new Book(
                "Na co dybie w wielorybie koniec nosa Eskimosa",
                "Tadeusz Baranowski",
                LocalDate.of(1989, Month.DECEMBER, 1));
        Book book2 = new Book(
                "Przystanek na skraju drogi",
                "A i B. Strugaccy",
                LocalDate.of(1978, Month.JANUARY, 12));
        Book book3 = new Book(
                "Slepowidzenie",
                "Watts Peter",
                LocalDate.of(1998, Month.APRIL, 14));

        Library newLibrary = new Library("Sample book library 1");
        newLibrary.getBooks().add(book1);
        newLibrary.getBooks().add(book2);
        newLibrary.getBooks().add(book3);

        //making shallowClone()
        Library clonedLibrary = null;
        try {
            clonedLibrary = newLibrary.shallowCopy();
            clonedLibrary.setName("Sample book library 2 (cloned - shallow)");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making the deepCopy()
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = newLibrary.deepCopy();
            deepClonedLibrary.setName("Sample book library 3 (cloned - deep)");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //Then
        //When
        System.out.println(newLibrary);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(3, newLibrary.getBooks().size());
        Assert.assertEquals(3, clonedLibrary.getBooks().size());
        Assert.assertEquals(3, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(clonedLibrary.getBooks(), newLibrary.getBooks());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(), newLibrary.getBooks());
    }

}