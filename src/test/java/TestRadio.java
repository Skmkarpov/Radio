import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRadio {

    @Test
    void testSetNextChannelMiddle() {
        Radio myRadio = new Radio(10);
        myRadio.setChannel(5);
        myRadio.setNextChannel();
        int actual = myRadio.getCurrentChannel();
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    void testSetNextChannelMax() {
        Radio myRadio = new Radio();
        myRadio.setChannel(9);
        myRadio.setNextChannel();
        int actual = myRadio.getCurrentChannel();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void testSetPreviousChannelMiddle() {
        Radio myRadio = new Radio();
        myRadio.setChannel(5);
        myRadio.setPreviousChannel();
        int actual = myRadio.getCurrentChannel();
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    void testSetPreviousChannelMin() {
        Radio myRadio = new Radio();
        myRadio.setChannel(0);
        myRadio.setPreviousChannel();
        int actual = myRadio.getCurrentChannel();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void testSetChannelCorrect() {
        Radio myRadio = new Radio();
        myRadio.setChannel(5);
        int actual = myRadio.getCurrentChannel();
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void testSetChannelMoreThanMax() {
        Radio myRadio = new Radio();
        myRadio.setChannel(3);
        myRadio.setChannel(25);
        int actual = myRadio.getCurrentChannel();
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    void testSetChannelLessThanMin() {
        Radio myRadio = new Radio();
        myRadio.setChannel(5);
        myRadio.setChannel(-1);
        int actual = myRadio.getCurrentChannel();
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void testSetMoreSound() {
        Radio myRadio = new Radio();
        myRadio.setSoundLevel(50);
        myRadio.setMoreLoud();
        int actual = myRadio.getCurrentLoud();
        int expected = 51;
        assertEquals(expected, actual);
    }

    @Test
    void testSetLessSound() {
        Radio myRadio = new Radio();
        myRadio.setSoundLevel(50);
        myRadio.setLessLoud();
        int actual = myRadio.getCurrentLoud();
        int expected = 49;
        assertEquals(expected, actual);
    }

    @Test
    void testSetLessThanMinSound() {
        Radio myRadio = new Radio();
        myRadio.setSoundLevel(0);
        myRadio.setLessLoud();
        int actual = myRadio.getCurrentLoud();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void testSetMoreThanMaxSound() {
        Radio myRadio = new Radio();
        myRadio.setSoundLevel(100);
        myRadio.setMoreLoud();
        int actual = myRadio.getCurrentLoud();
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    void testSetCurrentSoundLessThanMin() {
        Radio myRadio = new Radio();
        myRadio.setSoundLevel(23);
        myRadio.setSoundLevel(-1);
        int actual = myRadio.getCurrentLoud();
        int expected = 23;
        assertEquals(expected, actual);
    }

    @Test
    void testSetCurrentSoundMoreThanMax() {
        Radio myRadio = new Radio();
        myRadio.setSoundLevel(8);
        myRadio.setSoundLevel(105);
        int actual = myRadio.getCurrentLoud();
        int expected = 8;
        assertEquals(expected, actual);
    }
}