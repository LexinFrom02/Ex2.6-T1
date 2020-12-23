package ru.netology.domain;

public class Radio {
    private int stationNumber;
    private int volume;

    public int getStationNumber() {
        return stationNumber;
    }

    public void setStationNumber(int stationNumber) {
        if (stationNumber > 9) {
            stationNumber = 0;
        } else if (stationNumber < 0) {
            stationNumber = 9;
        }
        this.stationNumber = stationNumber;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume > 10) {
            volume = 10;
        } else if (volume < 1) {
            volume = 1;
        }
        this.volume = volume;
    }
}


