package project.warehouse;

import project.material.Material;
import project.stuff.Transformable;
import project.vessel.Containable;

public class Factory {

    private Warehouse warehouse;

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public void createVesselBox(int capacity, double volume,
                                Material material, Transformable stuff, Class<?> clazz){
        //TODO implement me
    }

    private Containable createVessel(double volume, Material material,
                                            Transformable stuff, Class<?> clazz){
        //TODO implement me

        return null;
    }

}
