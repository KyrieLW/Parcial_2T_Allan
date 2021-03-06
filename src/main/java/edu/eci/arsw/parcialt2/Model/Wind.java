package edu.eci.arsw.parcialt2.Model;

public class Wind {

    private Double speed;
    private Double deg;
    private Double gust;

    public Wind(){

    }

    public Wind(Double speed, Double deg, Double gust) {
        this.speed = speed;
        this.deg = deg;
        this.gust = gust;
    }
    public Wind(Double speed, Double deg) {
        this.speed = speed;
        this.deg = deg;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public Double getDeg() {
        return deg;
    }

    public void setDeg(Double deg) {
        this.deg = deg;
    }

    public Double getGust() {
        return gust;
    }

    public void setGust(Double gust) {
        this.gust = gust;
    }
}
