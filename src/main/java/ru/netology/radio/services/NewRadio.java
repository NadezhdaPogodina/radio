
package ru.netology.radio.services;

public class NewRadio {

    private int currentRadioStation;
    private int currentRadioVolume;
    private int maxRadioStation;


    public NewRadio() {
        this.maxRadioStation = 9;
    }

    public void standard() {
        maxRadioStation = maxRadioStation + 1;
    }


    public NewRadio(int radioStationCount) {
        this.maxRadioStation = radioStationCount - 1;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public void setMaxRadioStation(int radioStationCount) {
        this.maxRadioStation = radioStationCount - 1;
    }


    public void next() {
        if (currentRadioStation != maxRadioStation) {
            currentRadioStation = currentRadioStation + 1;

        } else {
            currentRadioStation = 0;
        }
    }

    public void prev() {
        if (currentRadioStation != 0) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = maxRadioStation;
        }
    }


    public int getCurrentRadioStation() {

        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {

        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;

    }


    public void aboveNextRadioVolume() {

        currentRadioVolume = currentRadioVolume + 1;

    }

    public void prevRadioVolume() {

        currentRadioVolume = currentRadioVolume - 1;

    }


    public int getCurrentRadioVolume() {

        return currentRadioVolume;
    }

    public void setCurrentRadioVolume(int newCurrentRadioVolume) {

        if (newCurrentRadioVolume > 100) {

            return;
        }

        if (newCurrentRadioVolume < 0) {

            return;
        }
        currentRadioVolume = newCurrentRadioVolume;
    }

}


















