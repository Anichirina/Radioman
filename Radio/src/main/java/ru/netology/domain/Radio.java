package ru.netology.domain;
public class Radio {
    private int maxVolume = 10;
    private int minVolume = 0;
    private int maxChannel = 9;
    private int minChannel = 0;
    private int currentVolume;
    private int currentChannel;


    public int getCurrentChannel() {
        return currentChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if(currentVolume>maxVolume){
            return;
        }
        if(currentVolume<minVolume){
            return;
        }
        this.currentVolume=currentVolume;

    }

    public void setCurrentChannel(int currentChannel) {
        {
            if (currentChannel >= maxChannel) {
                return;
            }
            if (currentChannel <= minChannel) {
                return;
            }
            this.currentChannel = currentChannel;
        }
        this.currentChannel = currentChannel;
    }

    public int getMaxChannel() {
        return maxChannel;
    }

    public void setMaxChannel(int maxChannel) {
        this.maxChannel = maxChannel;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinChannel() {
        return minChannel;
    }

    public void setMinChannel(int minChannel) {
        this.minChannel = minChannel;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }
}

