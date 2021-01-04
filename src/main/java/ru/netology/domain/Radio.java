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

    public void buttons() {
        System.out.println("|Previous|  |Next|");
        System.out.println("       |-|  |+|");
    }

    public int[] radioButtons(String buttonValue, int stationNumber, int volume) {
//        Scanner scanner = new Scanner(System.in);
        if (buttonValue.equals("Previous")) {
            if (stationNumber == 0) {
                stationNumber = 9;
            } else
                stationNumber--;
        }

        if (buttonValue.equals("Next")) {
            if (stationNumber == 9) {
                stationNumber = 0;
            } else
                stationNumber++;
        }

        if (buttonValue.equals("-")) {
            if (volume == 1) {
                volume = 1;
            } else
                volume--;
        }

        if (buttonValue.equals("+")) {
            if (volume == 10) {
                volume = 10;
            } else
                volume++;
        }
//        if (buttonValue.equals("Previous")
//                && stationNumber == 0) {
//            stationNumber = 9;
//        } else if (buttonValue.equals("Previous")
//                && stationNumber != 0) {
//            stationNumber--;
//        }

//        if (buttonValue.equals("Next")
//                && stationNumber == 9) {
//            stationNumber = 0;
//        } else if (buttonValue.equals("Next")
//                && stationNumber != 9) {
//            stationNumber++;
//        }
//
//        if (buttonValue.equals("-")
//                && volume == 1) {
//            volume = 1;
//        } else if (buttonValue.equals("-")
//                && volume != 1) {
//            volume--;
//        }
//
//        if (buttonValue.equals("+")
//                && volume == 10) {
//            volume = 10;
//        } else if (buttonValue.equals("+")
//                && volume != 10) {
//            volume++;
//        };

        int[] values = {stationNumber, volume};
        return values;
    }
}


