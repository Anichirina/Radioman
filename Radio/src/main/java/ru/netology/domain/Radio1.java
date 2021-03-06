package ru.netology.domain;


public class Radio1 {
    private int maxVolume = 10;
    private int minVolume = 0;
    private int maxChannel = 9;
    private int minChannel = 0;
    private int currentVolume;
    private int currentChannel;

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getMinChannel() {
        return minChannel;
    }

    public void setMinChannel(int minChannel) {
        this.minChannel = minChannel;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMaxChannel() {
        return maxChannel;
    }

    public void setMaxChannel(int maxChannel) {
        this.maxChannel = maxChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int i) {
        this.currentVolume = currentVolume;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int i) {
        this.currentChannel = currentChannel;
    }
    public void increaseChannel() {
        if (currentChannel < minChannel) {
            this.currentChannel = minChannel;
            return;
        }

        if (currentChannel < maxChannel) {
            currentChannel++;
            return;
        }

        if (currentChannel == maxChannel) {
            return;
        }
    }
    public void decreaseChannel() {
        if (currentChannel > maxChannel) {
            this.currentChannel = maxChannel;
            return;
        }

            if (currentChannel == minChannel) {
                return;
            }
            if (currentChannel > minChannel) {
                currentChannel--;
                return;
            }
        }

    public void decreaseVolume() {

              if (currentVolume > maxVolume) {
                this.currentVolume = maxVolume;
                return;
            }
            if (currentVolume > minVolume) {
                currentVolume--;
                return;
            }
            if (currentVolume == minVolume) {
                return;
            }


        }

    public void increaseVolume() {
        if (currentVolume < minVolume) {
            this.currentVolume = minVolume;
            return;
        }
        if (currentVolume < maxVolume) {
            currentVolume++;
            return;
        }
        if (currentVolume == maxVolume) {
            return;
        }

    }
}
