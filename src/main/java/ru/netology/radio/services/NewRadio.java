
package ru.netology.radio.services;

public class NewRadio {

    private int currentRadioStation;

    private int currentRadioVolume;

    public void next() {
        if (currentRadioStation != 9) {
            currentRadioStation = currentRadioStation + 1;

        } else {

            currentRadioStation = 0;
        }
    }

    public void prev() {
        if (currentRadioStation != 0) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = 9;
        }
    }

    public int getCurrentRadioStation() {

        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {

        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > 9) {
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

        if (newCurrentRadioVolume > 10) {

            return;
        }

        if (newCurrentRadioVolume < 0) {

            return;
        }
        currentRadioVolume = newCurrentRadioVolume;
    }

}


















