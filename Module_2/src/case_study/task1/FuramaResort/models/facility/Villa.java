package case_study.task1.FuramaResort.models.facility;

public class Villa extends Facility{
    private String roomStandard;
    private double poolArea;
    private int numberOfFloor;

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    public Villa() {
    }

    public Villa(String nameService, double usingArea, double rentCost, int peopleInRoom, String typeOfRent) {
        super(nameService, usingArea, rentCost, peopleInRoom, typeOfRent);
    }

    public Villa(String roomStandard, double poolArea, int numberOfFloor) {
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberOfFloor = numberOfFloor;
    }

    public Villa(String nameService, double usingArea, double rentCost, int peopleInRoom, String typeOfRent, String roomStandard, double poolArea, int numberOfFloor) {
        super(nameService, usingArea, rentCost, peopleInRoom, typeOfRent);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "roomStandard='" + roomStandard + '\'' +
                ", poolArea=" + poolArea +
                ", numberOfFloor=" + numberOfFloor +
                '}';
    }
}
