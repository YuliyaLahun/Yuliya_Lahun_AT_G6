package project.factory;

import project.boxing.Bottle;

//- [ ] в нем создать 3 бутылки, объёмом 0.5, 1, 1.5 лира с газировкой
//- [ ] - открыть поочередно все бутылки и выпустить из них газ
public class Runner {

    public static void main(String[] args) {

        Bottle bottleHalfLiter = new Bottle(0.5);
        bottleHalfLiter.open();

        Bottle bottleLiter = new Bottle(1.0);
        bottleLiter.open();

        Bottle bottleLiterAndAHalf = new Bottle(1.5);
        bottleLiterAndAHalf.open();


    }
}
