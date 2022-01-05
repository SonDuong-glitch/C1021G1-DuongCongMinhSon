package case_study.task1.FuramaResort.service.impl;

import case_study.task1.FuramaResort.models.Booking;
import case_study.task1.FuramaResort.models.facility.Facility;
import case_study.task1.FuramaResort.models.person.Customer;
import case_study.task1.FuramaResort.service.BookingService;
import case_study.task1.FuramaResort.untils.BookingComparator;

import java.util.*;

public class BookingServiceImpl implements BookingService {
    public static Scanner sc = new Scanner(System.in);
    public static CustomerServiceImpl customerService = new CustomerServiceImpl();
    public static FacilityServiceImpl facilityService = new FacilityServiceImpl();
    static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());
    static List<Customer> customerList = new ArrayList<>();
    static Map<Facility,Integer> facilityIntegerMap = new LinkedHashMap<>();
    public static Map<Facility,Integer> facilityHouse = new LinkedHashMap<>();
    public static Map<Facility,Integer> facilityRoom = new LinkedHashMap<>();
    public static Map<Facility,Integer> facilityVilla = new LinkedHashMap<>();
    @Override
    public void add() {

    }

    @Override
    public void display() {

    }
}
