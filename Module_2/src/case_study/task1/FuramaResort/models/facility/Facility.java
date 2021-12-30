package case_study.task1.FuramaResort.models.facility;

public abstract class Facility {
    private String nameService;
    private double usingArea;
    private double rentCost;
    private int peopleInRoom;
    private String typeOfRent;

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getUsingArea() {
        return usingArea;
    }

    public void setUsingArea(double usingArea) {
        this.usingArea = usingArea;
    }

    public double getRentCost() {
        return rentCost;
    }

    public void setRentCost(double rentCost) {
        this.rentCost = rentCost;
    }

    public int getPeopleInRoom() {
        return peopleInRoom;
    }

    public void setPeopleInRoom(int peopleInRoom) {
        this.peopleInRoom = peopleInRoom;
    }

    public String getTypeOfRent() {
        return typeOfRent;
    }

    public void setTypeOfRent(String typeOfRent) {
        this.typeOfRent = typeOfRent;
    }

    public Facility() {
    }

    public Facility(String nameService, double usingArea, double rentCost, int peopleInRoom, String typeOfRent) {
        this.nameService = nameService;
        this.usingArea = usingArea;
        this.rentCost = rentCost;
        this.peopleInRoom = peopleInRoom;
        this.typeOfRent = typeOfRent;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "nameService='" + nameService + '\'' +
                ", usingArea=" + usingArea +
                ", rentCost=" + rentCost +
                ", peopleInRoom=" + peopleInRoom +
                ", typeOfRent='" + typeOfRent + '\'' +
                '}';
    }
}
