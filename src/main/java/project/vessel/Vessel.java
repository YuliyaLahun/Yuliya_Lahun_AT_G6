package project.vessel;


import project.material.MaterialTypes;

public abstract class Vessel {

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public MaterialTypes getMaterial() {
        return material;
    }

    public void setMaterial(MaterialTypes material) {
        this.material = material;
    }

    private double volume;
    private double diameter;
    private int weight;
    private MaterialTypes material;

    public Vessel(double volume, double diameter, int weight, MaterialTypes material) {
        this.volume = volume;
        this.diameter = diameter;
        this.weight = (int) (material.getDensity()*volume/4);
        this.material = material;
    }
}
