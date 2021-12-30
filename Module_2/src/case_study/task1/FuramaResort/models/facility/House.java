package case_study.task1.FuramaResort.models.facility;

public class House extends Facility {
    private String roomStandard;
    private int numberOfFloor;
    public House() {
    }

    public House(String roomStandard, int numberOfFloor) {
        this.roomStandard = roomStandard;
        this.numberOfFloor = numberOfFloor;
    }

    public House(String nameService, double usingArea, double rentCost, int peopleInRoom, String typeOfRent, String roomStandard, int numberOfFloor) {
        super(nameService, usingArea, rentCost, peopleInRoom, typeOfRent);
        this.roomStandard = roomStandard;
        this.numberOfFloor = numberOfFloor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public String toString() {
        return "House{" +
                "roomStandard='" + roomStandard + '\'' +
                ", numberOfFloor=" + numberOfFloor +
                '}';
    }
}
