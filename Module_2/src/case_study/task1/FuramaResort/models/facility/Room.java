package case_study.task1.FuramaResort.models.facility;

public class Room extends Facility{
   private String freeServiceIncluded;

    public String getFreeServiceIncluded() {
        return freeServiceIncluded;
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }
    public Room(){

    }
    public Room(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public Room(String nameService, double usingArea, double rentCost, int peopleInRoom, String typeOfRent, String freeServiceIncluded) {
        super(nameService, usingArea, rentCost, peopleInRoom, typeOfRent);
        this.freeServiceIncluded = freeServiceIncluded;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeServiceIncluded='" + freeServiceIncluded + '\'' +
                '}';
    }
}
