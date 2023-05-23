package ru.netology.Afish;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AfishaTest {

    @Test

    public void testAfishaAddOneFilm() {
        AfishaManager manager = new AfishaManager();
        manager.add("Film1");

        String[] actual = manager.findAll();
        String[] expected = {"Film1"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void testAfishaAddTwoFilms() {
        AfishaManager manager = new AfishaManager();
        manager.add("Film1");
        manager.add("Film2");

        String[] actual = manager.findAll();
        String[] expected = {"Film1", "Film2"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void testAfishaAdd3Films() {
        AfishaManager manager = new AfishaManager();
        manager.add("Film1");
        manager.add("Film2");
        manager.add("Film3");

        String[] actual = manager.findAll();
        String[] expected = {"Film1", "Film2", "Film3"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAfishaFindLastIfLess5Films() {
        AfishaManager manager = new AfishaManager();
        manager.add("Film1");
        manager.add("Film2");
        manager.add("Film3");

        String[] actual = manager.findLast();
        String[] expected = {"Film3", "Film2", "Film1"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAfishaFindLastIf5Films() {
        AfishaManager manager = new AfishaManager();
        manager.add("Film1");
        manager.add("Film2");
        manager.add("Film3");
        manager.add("Film4");
        manager.add("Film5");

        String[] actual = manager.findLast();
        String[] expected = {"Film5", "Film4", "Film3", "Film2", "Film1"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAfishaFindLastIfMore5Films() {
        AfishaManager manager = new AfishaManager();
        manager.add("Film1");
        manager.add("Film2");
        manager.add("Film3");
        manager.add("Film4");
        manager.add("Film5");
        manager.add("Film6");

        String[] actual = manager.findLast();
        String[] expected = {"Film6", "Film5", "Film4", "Film3", "Film2"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAfishaFindLastIfLimit2() {
        AfishaManager manager = new AfishaManager(1);
        manager.add("Film1");

        String[] actual = manager.findLast();
        String[] expected = {"Film1"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAfishaFindLastIfLimitOnlyOne() {
        AfishaManager manager = new AfishaManager(2);
        manager.add("Film1");
        manager.add("Film2");
        manager.add("Film3");

        String[] actual = manager.findLast();
        String[] expected = {"Film2", "Film1"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAfishaFindLastIfLimitMore5() {
        AfishaManager manager = new AfishaManager(6);
        manager.add("Film1");
        manager.add("Film2");
        manager.add("Film3");
        manager.add("Film4");
        manager.add("Film5");
        manager.add("Film6");

        String[] actual = manager.findLast();
        String[] expected = {"Film6", "Film5", "Film4", "Film3", "Film2", "Film1"};
        Assertions.assertArrayEquals(expected, actual);
    }

}
