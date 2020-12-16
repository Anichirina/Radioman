import org.junit.jupiter.api.Test;
import ru.netology.domain.Radio1;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    void increaseVolume() {
        Radio1 radio = new Radio1();
        radio.setCurrentVolume(7);
        radio.increaseVolume();
        assertEquals(8, radio.getCurrentVolume());
    }

    @Test
    void decreaseVolume() {
        Radio1 radio = new Radio1();
        radio.setCurrentVolume(7);
        radio.decreaseVolume();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    void increaseChannel() {
        Radio1 radio = new Radio1();
        radio.setCurrentChannel(6);
        radio.increaseChannel();
        assertEquals(7, radio.getCurrentChannel());
    }

    @Test
    void increaseChannelmaxChannel() {
        Radio1 radio = new Radio1();
        radio.setCurrentChannel(91);
        radio.increaseChannel();
        assertEquals(9, radio.getCurrentChannel());
    }

    @Test
    void decreaseChannel() {
        Radio1 radio = new Radio1();
        radio.setCurrentChannel(6);
        radio.decreaseChannel();
        assertEquals(5, radio.getCurrentChannel());
    }

    @Test
    void decreaseChannelminChannel() {
        Radio1 radio = new Radio1();
        radio.setCurrentChannel(0);
        radio.decreaseChannel();
        assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    void DownMimumeChannel() {
        Radio1 radio = new Radio1();
        radio.setCurrentChannel(-2);
        radio.increaseChannel();
        assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    void downminimumeChannel() {
        Radio1 radio = new Radio1();
        radio.setCurrentChannel(-10);
        radio.decreaseChannel();
        assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    public void increaseVolumeFromMaxVolume() {
        Radio1 radio = new Radio1();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void decreaseVolumeFromMinVolume() {
        Radio1 radio = new Radio1();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void anyValueChannel() {
        Radio1 radio = new Radio1();
        radio.setCurrentChannel(5);

        assertEquals(5, radio.getCurrentChannel());
    }

    @Test
    public void previousChannelFromMin() {
        Radio1 radio = new Radio1();
        radio.setCurrentChannel(0);
        radio.decreaseChannel();
        assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    public void nextChannelFromMax() {
        Radio1 radio = new Radio1();
        radio.setCurrentChannel(9);
        radio.increaseChannel();
        assertEquals(9, radio.getCurrentChannel());
    }

    @Test
    public void increaseVolumeFromAnyValue() {
        Radio1 radio = new Radio1();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void increaseVolumeDownMinimum() {
        Radio1 radio = new Radio1();
        ;
        radio.setCurrentVolume(-10);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void VolumeFromAnyValue() {
        Radio1 radio = new Radio1();
        radio.setCurrentVolume(100);

        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void decreaseVolumeUpMaximum() {
        Radio1 radio = new Radio1();
        radio.setCurrentVolume(100);
        radio.decreaseVolume();
        assertEquals(9, radio.getCurrentVolume());
    }

    @Test
    public void workGetMaxChannel() {
        Radio1 radio = new Radio1();
        radio.getMaxChannel();
        assertEquals(9, radio.getMaxChannel());
    }

    @Test
    public void worksetMaxChannel() {
        Radio1 radio = new Radio1();
        radio.setMaxChannel(10);
        assertEquals(10, radio.getMaxChannel());
    }

    @Test
    public void workgetMinChannel() {
        Radio1 radio = new Radio1();
        radio.setMinChannel(-2);
        assertEquals(-2, radio.getMinChannel());
    }

    @Test
    public void workgetMinVolume() {
        Radio1 radio = new Radio1();
        radio.setMinVolume(-2);
        assertEquals(-2, radio.getMinVolume());
    }

    @Test
    public void workgetMaxVolume() {
        Radio1 radio = new Radio1();
        radio.setMaxVolume(20);
        assertEquals(20, radio.getMaxVolume());
    }
}


