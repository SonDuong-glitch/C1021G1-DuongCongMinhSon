package week4.binary_file.baitap.service;

import java.io.IOException;

public interface IProduct {
     void addProduct();
     void displayProduct();
     void searchProduct();
     void displayTxt() throws IOException, ClassNotFoundException;
}
