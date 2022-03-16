package ru.netology.manager;

public class AfishaManager {

    private int countFilms; // количество выводимых фильмов

    private FilmItem[] items = new FilmItem[countFilms];// создание пустого массива

    public AfishaManager(int countFilms) { // конструктор с количеством выводимых фильмов пользователем
        this.countFilms = countFilms;
    }

    public AfishaManager() { // конструктор с количеством выводимых фильмов по умолчанию (10)
        this.countFilms = 10;
    }


    public void addFilm(FilmItem item) {
        int length = items.length + 1;
        FilmItem[] tmp = new FilmItem[length];

        System.arraycopy(items, 0, tmp, 0, items.length); // переносим старый массив

        // добавляем новый фильм
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public FilmItem[] findAll() { // Вывод всех фильмов в порядке добавления
        return items;
    }

    public FilmItem[] findLast() { // вывод фильмов в обратном от добавления порядке

        int resultLength;
        if (items.length >= countFilms) {
            resultLength = countFilms;
        } else {
            resultLength = items.length;
        }
        FilmItem[] result = new FilmItem[resultLength];

        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }
}
