
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.radio.services.NewRadio;

public class NewRadioTest {

    @Test
    public void maxRadioStation() {
        NewRadio radio = new NewRadio();

        radio.setCurrentRadioStation(9);
        radio.next();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStation() {
        NewRadio radio = new NewRadio();

        radio.setCurrentRadioStation(0);
        radio.next();

        int expected = 1;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void previousRadioStation() {
        NewRadio radio = new NewRadio();
        radio.setCurrentRadioStation(5);

        radio.prev();
        int expected = 4;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void backRadioStation() {
        NewRadio radio = new NewRadio();
        radio.setCurrentRadioStation(0);

        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentRadioStation() {
        NewRadio radio = new NewRadio();
        radio.setCurrentRadioStation(8);
        int expected = 8;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void belowZeroRadioStation() {
        NewRadio radio = new NewRadio();
        radio.setCurrentRadioStation(-1);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void overMaxRadioStation() {
        NewRadio radio = new NewRadio();
        radio.setCurrentRadioStation(10);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void nextVolume() {
        NewRadio radio = new NewRadio();

        radio.setCurrentRadioVolume(7);
        radio.aboveNextRadioVolume();
        int expected = 8;
        int actual = radio.getCurrentRadioVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void previousRadioVolume() {
        NewRadio radio = new NewRadio();
        radio.setCurrentRadioVolume(5);
        radio.prevRadioVolume();
        int expected = 4;
        int actual = radio.getCurrentRadioVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void beforeZeroRadioVolume() {
        NewRadio radio = new NewRadio();
        radio.setCurrentRadioVolume(1);
        radio.prevRadioVolume();
        int expected = 0;
        int actual = radio.getCurrentRadioVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentRadioVolume() {
        NewRadio radio = new NewRadio();

        radio.setCurrentRadioVolume(10);
        int expected = 10;
        int actual = radio.getCurrentRadioVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void overCurrentRadioVolume() {
        NewRadio radio = new NewRadio();

        radio.setCurrentRadioVolume(11);
        int expected = 0;
        int actual = radio.getCurrentRadioVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void belowCurrentRadioVolume() {
        NewRadio radio = new NewRadio();

        radio.setCurrentRadioVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentRadioVolume();
        Assertions.assertEquals(expected, actual);
    }
}





