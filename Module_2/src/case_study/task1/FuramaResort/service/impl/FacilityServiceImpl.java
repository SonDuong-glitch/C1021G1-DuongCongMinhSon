package case_study.task1.FuramaResort.service.impl;

import case_study.task1.FuramaResort.models.facility.Facility;
import case_study.task1.FuramaResort.models.facility.House;
import case_study.task1.FuramaResort.models.facility.Room;
import case_study.task1.FuramaResort.models.facility.Villa;
import case_study.task1.FuramaResort.service.FacilityService;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    private static Map<Facility,Integer> facilityIntegerMap = new LinkedHashMap<>();
    private static Scanner sc = new Scanner(System.in);
    @Override
    public void displayFacility() {
        for (Map.Entry<Facility,Integer> integerEntry : facilityIntegerMap.entrySet()){
            System.out.println("name of service"+integerEntry.getKey() +"Number of people rent "+integerEntry.getValue());
        }
    }

    @Override
    public void addVilla() {
        System.out.println("Input naem service");
        String nameService = sc.nextLine();
        System.out.println("Input area using ");
        double usingArea = Double.parseDouble(sc.nextLine());
        System.out.println("Input rent cost");
        double rentCost = Double.parseDouble(sc.nextLine());
        System.out.println("Input people in room");
        int peopleInRoom = Integer.parseInt(sc.nextLine());
        System.out.println("Input type of rent");
        String typeOfRent = sc.nextLine();
        System.out.println("Input room standard");
        String roomStandard =  sc.nextLine();
        System.out.println("Input pool area");
        double poolArea = Double.parseDouble(sc.nextLine());
        System.out.println("Input number of floor");
        int numberOfFloor = Integer.parseInt(sc.nextLine());
        Villa villa = new Villa(nameService,usingArea,rentCost,peopleInRoom,typeOfRent,roomStandard,poolArea,numberOfFloor);
        facilityIntegerMap.put(villa,0);
        System.out.println("Add Success!!!!");
    }

    @Override
    public void addHouse() {
        System.out.println("Input naem service");
        String nameService = sc.nextLine();
        System.out.println("Input area using ");
        double usingArea = Double.parseDouble(sc.nextLine());
        System.out.println("Input rent cost");
        double rentCost = Double.parseDouble(sc.nextLine());
        System.out.println("Input people in room");
        int peopleInRoom = Integer.parseInt(sc.nextLine());
        System.out.println("Input type of rent");
        String typeOfRent = sc.nextLine();
        System.out.println("Input room standard");
        String roomStandard = sc.nextLine();
        System.out.println("Input number of floor");
        int numberOfFloor = Integer.parseInt(sc.nextLine());
        House house = new House(nameService,usingArea,rentCost,peopleInRoom,typeOfRent,roomStandard,numberOfFloor);
        facilityIntegerMap.put(house,0);
        System.out.println("Add Success!!!!");
    }

    @Override
    public void addRoom() {
        System.out.println("Input naem service");
        String nameService = sc.nextLine();
        System.out.println("Input area using ");
        double usingArea = Double.parseDouble(sc.nextLine());
        System.out.println("Input rent cost");
        double rentCost = Double.parseDouble(sc.nextLine());
        System.out.println("Input people in room");
        int peopleInRoom = Integer.parseInt(sc.nextLine());
        System.out.println("Input type of rent");
        String typeOfRent = sc.nextLine();
        System.out.println("Input freeServiceIncluded");
        String freeServiceIncluded = sc.nextLine();
        Room room = new Room(nameService,usingArea,rentCost,peopleInRoom,typeOfRent,freeServiceIncluded);
        facilityIntegerMap.put(room,0);
        System.out.println("Add Success!!!!");

    }

    @Override
    public void displayMaintenanceFacility() {

    }

    @Override
    public void returnMenu() {

    }
}
