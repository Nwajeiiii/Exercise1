package com.olufemi.questionthree;

public class Main {


    public static void main(String[] args) {

//        over-riding the method of a class using anonymous inner class
//        Vehicle vehicle = new Vehicle("Toyota", "1000cc", "GR86"){
//
//            @Override
//            public void setEngineCC(String engineCC) {
//                super.setEngineCC(engineCC);
//            }
//        };

        // over-riding the method of a class using anonymous inner class
        Vehicle car = new Vehicle("Toyota", "1500", "2020");

        car.setVehicleName("Honda");
        System.out.println("Car Name: " + car.getVehicleName());

        Vehicle.Owner owner = new Vehicle.Owner("John Doe", 12345-67890, "1234567890");
        owner.setOwnerName("Jane Doe");
        System.out.println("Owner Name: " + owner.getOwnerName());

        new Vehicle.Owner("John Doe", 12345-67890, "1234567890") {
            @Override
            public String getOwnerName() {
                return "Anonymous Owner";
            }
        };
//        System.out.println("Anonymous Owner Name: " + anonymousOwner.getOwnerName());



//    pass an anonymous inner class as method argument
        Vehicle v = new Vehicle("Suzuki", "1300", "Cultus");
        car.printOwnerDetails(new Vehicle.Owner("John Doe", 1234567890, "0300000000"));


    }

}
