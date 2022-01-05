package case_study.task1.FuramaResort.controller;

public class MyException extends Exception{
    public MyException() {

    }
    @Override
    public String getMessage() {
        return "MyException{}";
    }
}
