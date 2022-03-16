package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.FilmItem;

import static org.junit.jupiter.api.Assertions.*;

class AfishaManagerTest {

    FilmItem first = new FilmItem(
            "first");
    FilmItem second = new FilmItem(
            "second");
    FilmItem third = new FilmItem(
            "third");
    FilmItem four = new FilmItem(
            "four");
    FilmItem five = new FilmItem(
            "five");
    FilmItem six = new FilmItem(
            "six");
    FilmItem seven = new FilmItem(
            "seven");
    FilmItem eight = new FilmItem(
            "eight");
    FilmItem nine = new FilmItem(
            "nine");
    FilmItem ten = new FilmItem(
            "ten");
    FilmItem eleven = new FilmItem(
            "eleven");
    FilmItem twelve = new FilmItem(
            "twelve");

    @Test
        // Добавление и вывод фильмов в порядке добавления
    void addFilm() {
        AfishaManager manager = new AfishaManager();

        manager.addFilm(first);
        manager.addFilm(second);
        manager.addFilm(third);
        manager.addFilm(four);
        manager.addFilm(five);
        manager.addFilm(six);
        manager.addFilm(seven);
        manager.addFilm(eight);
        manager.addFilm(nine);
        manager.addFilm(ten);
        manager.addFilm(eleven);
        manager.addFilm(twelve);

        FilmItem[] expected = {first, second, third, four, five, six, seven, eight, nine, ten,
                eleven, twelve};
        FilmItem[] actual = manager.findAll();
        assertArrayEquals(expected, actual);
    }


    @Test
        // Вывод 10 последних фильмов (по умолчанию) в обратном порядке от добавления
    void findLast1() {
        AfishaManager manager = new AfishaManager();

        manager.addFilm(first);
        manager.addFilm(second);
        manager.addFilm(third);
        manager.addFilm(four);
        manager.addFilm(five);
        manager.addFilm(six);
        manager.addFilm(seven);
        manager.addFilm(eight);
        manager.addFilm(nine);
        manager.addFilm(ten);
        manager.addFilm(eleven);
        manager.addFilm(twelve);

        FilmItem[] expected = {twelve, eleven, ten, nine, eight, seven, six, five, four, third};
        FilmItem[] actual = manager.findLast();
        assertArrayEquals(expected, actual);
    }


    @Test
        // Вывод 11 последних фильмов из 12 (по желанию пользователя) в обратном порядке от добавления
    void findLast2() {
        AfishaManager manager1 = new AfishaManager(11);

        manager1.addFilm(first);
        manager1.addFilm(second);
        manager1.addFilm(third);
        manager1.addFilm(four);
        manager1.addFilm(five);
        manager1.addFilm(six);
        manager1.addFilm(seven);
        manager1.addFilm(eight);
        manager1.addFilm(nine);
        manager1.addFilm(ten);
        manager1.addFilm(eleven);
        manager1.addFilm(twelve);

        FilmItem[] expected = {twelve, eleven, ten, nine, eight, seven, six, five, four, third,
                second};
        FilmItem[] actual = manager1.findLast();
        assertArrayEquals(expected, actual);
    }


    @Test
        // Вывод 12 последних фильмов из 12 (по желанию пользователя) в обратном порядке от добавления
    void findLast3() {
        AfishaManager manager2 = new AfishaManager(12);

        manager2.addFilm(first);
        manager2.addFilm(second);
        manager2.addFilm(third);
        manager2.addFilm(four);
        manager2.addFilm(five);
        manager2.addFilm(six);
        manager2.addFilm(seven);
        manager2.addFilm(eight);
        manager2.addFilm(nine);
        manager2.addFilm(ten);
        manager2.addFilm(eleven);
        manager2.addFilm(twelve);

        FilmItem[] expected = {twelve, eleven, ten, nine, eight, seven, six, five, four, third,
                second, first};
        FilmItem[] actual = manager2.findLast();
        assertArrayEquals(expected, actual);
    }


    @Test
        // Вывод 13 последних фильмов из 12 (по желанию пользователя) в обратном порядке от добавления
    void findLast4() {
        AfishaManager manager3 = new AfishaManager(13);

        manager3.addFilm(first);
        manager3.addFilm(second);
        manager3.addFilm(third);
        manager3.addFilm(four);
        manager3.addFilm(five);
        manager3.addFilm(six);
        manager3.addFilm(seven);
        manager3.addFilm(eight);
        manager3.addFilm(nine);
        manager3.addFilm(ten);
        manager3.addFilm(eleven);
        manager3.addFilm(twelve);

        FilmItem[] expected = {twelve, eleven, ten, nine, eight, seven, six, five, four, third,
                second, first};
        FilmItem[] actual = manager3.findLast();
        assertArrayEquals(expected, actual);
    }

    @Test
        // Вывод одного последнего фильма из 12 (по желанию пользователя) в обратном порядке от добавления
    void findLast5() {
        AfishaManager manager4 = new AfishaManager(1);

        manager4.addFilm(first);
        manager4.addFilm(second);
        manager4.addFilm(third);
        manager4.addFilm(four);
        manager4.addFilm(five);
        manager4.addFilm(six);
        manager4.addFilm(seven);
        manager4.addFilm(eight);
        manager4.addFilm(nine);
        manager4.addFilm(ten);
        manager4.addFilm(eleven);
        manager4.addFilm(twelve);

        FilmItem[] expected = {twelve};
        FilmItem[] actual = manager4.findLast();
        assertArrayEquals(expected, actual);
    }


    @Test
        // Вывод 0 последних фильмов из 12 (по желанию пользователя) в обратном порядке от добавления
    void findLast6() {
        AfishaManager manager4 = new AfishaManager(0);

        manager4.addFilm(first);
        manager4.addFilm(second);
        manager4.addFilm(third);
        manager4.addFilm(four);
        manager4.addFilm(five);
        manager4.addFilm(six);
        manager4.addFilm(seven);
        manager4.addFilm(eight);
        manager4.addFilm(nine);
        manager4.addFilm(ten);
        manager4.addFilm(eleven);
        manager4.addFilm(twelve);

        FilmItem[] expected = {};
        FilmItem[] actual = manager4.findLast();
        assertArrayEquals(expected, actual);
    }
}