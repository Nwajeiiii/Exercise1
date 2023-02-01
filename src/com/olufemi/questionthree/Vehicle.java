package com.olufemi.questionthree;

public class Vehicle {

    private String vehicleName;
    private String engineCC;
    private String model;

    private Owner owner;


    public Vehicle(String vehicleName, String engineCC, String model) {
        this.vehicleName = vehicleName;
        this.engineCC = engineCC;
        this.model = model;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getEngineCC() {
        return engineCC;
    }

    public void setEngineCC(String engineCC) {
        this.engineCC = engineCC;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

//    implementing an inner static class
    public static class Owner{

        private String ownerName;
        private int cnicNumber;
        private String phoneNumber;

        public Owner(String ownerName, int cnicNumber, String phoneNumber) {
            this.ownerName = ownerName;
            this.cnicNumber = cnicNumber;
            this.phoneNumber = phoneNumber;
        }

        public String getOwnerName() {
            return ownerName;
        }

        public void setOwnerName(String ownerName) {
            this.ownerName = ownerName;
        }

        public int getCnicNumber() {
            return cnicNumber;
        }

        public void setCnicNumber(int cnicNumber) {
            this.cnicNumber = cnicNumber;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }
    }

    void printOwnerDetails(Vehicle.Owner owner) {
        System.out.println(owner);
    }

}
