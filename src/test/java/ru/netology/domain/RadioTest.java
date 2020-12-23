package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
@Test
    public void shouldSetParams() {
        Radio radio = new Radio();

        radio.setStationNumber(1);
        radio.setVolume(1);
    }
}