package case_study.task1.FuramaResort.models;

public class Booking {
    private String idBoooking;
    private String firstDay;
    private String lastDay;
    private String idCustomer;
    private String nameService;
    private String typeService;

    public Booking() {
    }

    public Booking(String idBoooking, String firstDay, String lastDay, String idCustomer, String nameService, String typeService) {
        this.idBoooking = idBoooking;
        this.firstDay = firstDay;
        this.lastDay = lastDay;
        this.idCustomer = idCustomer;
        this.nameService = nameService;
        this.typeService = typeService;
    }

    public String getIdBoooking() {
        return idBoooking;
    }

    public void setIdBoooking(String idBoooking) {
        this.idBoooking = idBoooking;
    }

    public String getFirstDay() {
        return firstDay;
    }

    public void setFirstDay(String firstDay) {
        this.firstDay = firstDay;
    }

    public String getLastDay() {
        return lastDay;
    }

    public void setLastDay(String lastDay) {
        this.lastDay = lastDay;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getTypeService() {
        return typeService;
    }

    public void setTypeService(String typeService) {
        this.typeService = typeService;
    }
}
