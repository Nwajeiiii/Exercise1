package com.olufemi.questionthree;

public class Main {


    public static void main(String[] args) {

//        over-riding the method of a class using anonymous inner class
        Vehicle vehicle = new Vehicle("Toyota", "1000cc", "GR86"){

            @Override
            public void setEngineCC(String engineCC) {
                super.setEngineCC(engineCC);
            }
        };


//    pass an anonymous inner class as method argument

    }

}
