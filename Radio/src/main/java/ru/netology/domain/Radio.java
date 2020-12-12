package ru.netology.domain;
public class Radio {
    private int maxVolume = 10;
    private int minVolume = 0;
    private int maxChannel = 9;
    private int minChannel = 0;
    private int currentVolume;
    private int currentChannel;

    public void increaseChannel() {
        if (currentChannel < maxChannel) {
            currentChannel++;
            return;
        }

        if (currentChannel == maxChannel) {
            this.currentChannel = maxChannel;
            return;
        }
        if (currentChannel > maxChannel) {
            this.currentChannel = minChannel;
            return;
        }
    }

    public void decreaseChannel() {
        if(currentChannel>minChannel){
            currentChannel--;
            return;
        }

        if (currentChannel == minChannel) {
            this.currentChannel = minChannel;
            return;
        }
            }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
            return;
        }

        if(currentVolume==maxVolume){
            this.currentVolume=maxVolume;
        }
        return;
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
            return;
        }

        if(currentVolume==minVolume){
            this.currentVolume=minVolume;
          }
        return;
    }

    public int getCurrentChannel(){
            return currentChannel;
        }

        public int getCurrentVolume() {
            return currentVolume;
        }

        public void setCurrentVolume(int currentVolume){
            if (currentVolume > maxVolume) {
                this.currentVolume = maxVolume;
                return;
            }
            if (currentVolume < minVolume) {
                this.currentVolume = minVolume;
                return;
            }
            this.currentVolume = currentVolume;
        }


        public void setCurrentChannel ( int currentChannel){
            if (currentChannel > maxChannel) {
                this.currentChannel = maxChannel;
                return;
            }
            if (currentChannel < minChannel) {
                this.currentChannel = minChannel;
                return;
            }
            this.currentChannel = currentChannel;
        }


        public int getMaxChannel () {
            return maxChannel;
        }

        public void setMaxChannel ( int maxChannel){
            this.maxChannel = maxChannel;
        }

        public int getMaxVolume () {
            return maxVolume;
        }

        public void setMaxVolume ( int maxVolume){
            this.maxVolume = maxVolume;
        }

        public int getMinChannel () {
            return minChannel;
        }

        public void setMinChannel ( int minChannel){
            this.minChannel = minChannel;
        }

        public int getMinVolume () {
            return minVolume;
        }

        public void setMinVolume ( int minVolume){
            this.minVolume = minVolume;
        }
    }




