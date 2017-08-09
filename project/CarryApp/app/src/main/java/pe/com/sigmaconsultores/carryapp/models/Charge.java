package pe.com.sigmaconsultores.carryapp.models;

/**
 * Created by rhurtado on 07/08/2017.
 */

public class Charge {

    private String denomination;
    private String description;

    private double weight;
    private double heigth;
    private double width;
    private double large;

    private double fragility;


    public Charge() {
    }

    public String getDenomination() {
        return denomination;
    }

    public void setDenomination(String denomination) {
        this.denomination = denomination;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLarge() {
        return large;
    }

    public void setLarge(double large) {
        this.large = large;
    }

    public double getFragility() {
        return fragility;
    }

    public void setFragility(double fragility) {
        this.fragility = fragility;
    }



}
