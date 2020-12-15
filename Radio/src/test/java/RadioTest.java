import org.junit.jupiter.api.Test;
import ru.netology.domain.Radio;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    void increaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(7);
        radio.increaseVolume();
        assertEquals(8, radio.getCurrentVolume());
    }

    @Test
    void decreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(7);
        radio.decreaseVolume();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    void increaseChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(6);
        radio.increaseChannel();
        assertEquals(7, radio.getCurrentChannel());
    }

    @Test
    void increaseChannelmaxChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(9);
        radio.increaseChannel();
        assertEquals(9, radio.getCurrentChannel());
    }

    @Test
    void decreaseChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(6);
        radio.decreaseChannel();
        assertEquals(5, radio.getCurrentChannel());
    }

    @Test
    void decreaseChannelminChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(0);
        radio.decreaseChannel();
        assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    void upMaximumeChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(20);
        radio.increaseChannel();
        assertEquals(9, radio.getCurrentChannel());
    }

    @Test
    void downminimumeChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(-10);
        radio.decreaseChannel();
        assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    public void increaseVolumeFromMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void decreaseVolumeFromMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void anyValueChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(5);

        assertEquals(5, radio.getCurrentChannel());
    }

    @Test
    public void previousChannelFromMin() {
        Radio radio = new Radio();
        radio.setCurrentChannel(0);
        radio.decreaseChannel();
        assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    public void nextChannelFromMax() {
        Radio radio = new Radio();
        radio.setCurrentChannel(9);
        radio.increaseChannel();
        assertEquals(9, radio.getCurrentChannel());
    }

    @Test
    public void increaseVolumeFromAnyValue() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void increaseVolumeDownMinimum() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-10);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void VolumeFromAnyValue() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void decreaseVolumeUpMaximum() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.decreaseVolume();
        assertEquals(9, radio.getCurrentVolume());
    }

    @Test
    public void workGetMaxChannel() {
        Radio radio = new Radio();
        radio.getMaxChannel();
        assertEquals(9, radio.getMaxChannel());
    }

    @Test
    public void worksetMaxChannel() {
        Radio radio = new Radio();
        radio.setMaxChannel(10);
        assertEquals(10, radio.getMaxChannel());
    }

    @Test
    public void workgetMinChannel() {
        Radio radio = new Radio();
        radio.setMinChannel(-2);
        assertEquals(-2, radio.getMinChannel());
    }

    @Test
    public void workgetMinVolume() {
        Radio radio = new Radio();
        radio.setMinVolume(-2);
        assertEquals(-2, radio.getMinVolume());
    }

    @Test
    public void workgetMaxVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(20);
        assertEquals(20, radio.getMaxVolume());
    }
}




