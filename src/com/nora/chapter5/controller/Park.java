package com.nora.chapter5.controller;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nora on 20.01.17.
 */
public class Park {

    private String parkName;
    private List<Attraction> attractions = new ArrayList<Attraction>();
    Attraction attraction;
    private String workTime;

    public Park() {
        parkName = "";
        workTime = "";
    }

    public Park(String parkName, String workTime) {
        this.parkName = parkName;
        this.workTime = workTime;
    }

    public Park(String parkName) {
        this(parkName,"");
    }

    private class Attraction {

        private String nameAttraction;
        private double price;

        public Attraction() {
            nameAttraction = "";
            price = 0;
        }

        public String getNameAttraction() {
            return nameAttraction;
        }

        public void setNameAttraction(String nameAttraction) {
            this.nameAttraction = nameAttraction;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
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

    public void  setAttraction (String nameAttraction,double price){
        attraction = new Attraction();
        attraction.setNameAttraction(nameAttraction);
        attraction.setPrice(price);
        attractions.add(attraction);
    }

    public String attractionInformation(){
        String info ="";
            for(Attraction attraction:attractions) {
                info += "'" + attraction.getNameAttraction() + "'" + "( price for one ticket = " + attraction.getPrice() + ")";
            }
        return info;
    }

    @Override
    public String toString() {
        return "Park{" +
                "parkName='" + parkName + '\'' +
                ", attraction --> {" + attractionInformation() +"}"+
                ", workTime='" + workTime + '\'' +
                '}';
    }
}
