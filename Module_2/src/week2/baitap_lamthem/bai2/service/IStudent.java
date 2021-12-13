package week2.baitap_lamthem.bai2.service;

import week2.baitap_lamthem.bai2.model.Student;

public interface IStudent {
     void addStudent();
     void listAll();
     void removeStudentById();
     void removeStudentByIndex();
     void searchByNameOrChar();
     void sortStudentByID();
}
