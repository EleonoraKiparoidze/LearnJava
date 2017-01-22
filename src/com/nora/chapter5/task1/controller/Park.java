package com.nora.chapter5.task1.controller;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nora on 20.01.17.
 */
public class Park {

    private String parkName;
    private List<Attraction> attractions = new ArrayList<Attraction>();
    private String workTime;

    public Park() {
    }

    public Park(String parkName, String workTime) {
        this.parkName = parkName;
        this.workTime = workTime;
    }

    public Park(String parkName) {
        this.parkName = parkName;
    }

    private class Attraction {

        private String nameAttraction;
        private double price;

        Attraction() {
        }

        String getNameAttraction() {
            return nameAttraction;
        }

        void setNameAttraction(String nameAttraction) {
            this.nameAttraction = nameAttraction;
        }

        double getPrice() {
            return price;
        }

        void setPrice(double price) {
            this.price = price;
        }
    }

    public String getParkName() {
        return parkName;
    }

    public void setParkName(String parkName) {
        this.parkName = parkName;
    }

    public String getWorkTime() {
        return workTime;
    }

    public void setWorkTime(String workTime) {
        this.workTime = workTime;
    }

    public void setAttraction(String nameAttraction, double price) {
        Attraction attraction = new Attraction();
        attraction.setNameAttraction(nameAttraction);
        attraction.setPrice(price);
        attractions.add(attraction);
    }

    private String attractionInformation() {
        String info = "";
        for (Attraction attraction : attractions) {
            info += "'" + attraction.getNameAttraction() + "'" + "( price for one ticket = " + attraction.getPrice() + ")";
        }
        return info;
    }

    @Override
    public String toString() {
        return "Park{" +
                "parkName='" + parkName + '\'' +
                ", attraction --> {" + attractionInformation() + "}" +
                ", workTime='" + workTime + '\'' +
                '}';
    }
}
