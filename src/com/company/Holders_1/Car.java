package com.company.Holders_1;

import java.time.LocalDateTime;

public class Car <
        WeightType extends Number & Comparable,
        LengthType extends Number & Comparable,
        WidthType extends Number & Comparable> implements Comparable<Car> {
    private String marka;
    private static int id;
    private WeightType masa;
    private LengthType dlugosc;
    private WidthType szerokosc;

    public Car(String marka, WeightType masa, LengthType dlugosc, WidthType szerokosc) {
        this.marka = marka;
        this.masa = masa;
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
        this.id = id++;
    }



    @Override
    public String toString() {
        return "Car{" +
                "id=" + id + '\'' +
                "marka='" + marka + '\'' +
                ", masa=" + masa +
                ", dlugosc=" + dlugosc +
                ", szerokosc=" + szerokosc +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        LocalDateTime time = LocalDateTime.now();
        int hour = time.getHour();
        if(this.masa.compareTo(o.masa) > 0) return 1;
        else if(this.masa.compareTo(o.masa) < 0) return -1;
        else {
            if(hour < 12) return 0;
            else {
                if(this.dlugosc.compareTo(o.dlugosc) > 0) return 1;
                else if(this.dlugosc.compareTo(o.dlugosc) < 0) return -1;
                else {
                    if(this.szerokosc.compareTo(o.dlugosc) > 0) return 1;
                    else if(this.szerokosc.compareTo(o.dlugosc) < 0) return -1;
                    else return 0;
                }
            }
        }
    }
}
