package week1_class_obj.week1_class_obj_baitap;

import java.math.BigInteger;

public class StopWatch {
    private long startTime;
    private long endTime;

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    private boolean running =false;
    public StopWatch(){
    }

    public StopWatch(int startTime, int endTime,boolean running) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.running = false;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }
    public void start(){
        this.startTime = System.currentTimeMillis();
        this.running = true;
    }
    public void stop(){
        this.endTime = System.currentTimeMillis();
        this.running = false;
    }
    public long getElapsedTime(){
        long elapsed;
        if(running){
            elapsed = System.currentTimeMillis()-startTime;
        }else {
            elapsed =endTime - startTime;
        }
        return elapsed;
    }
}
class Main1{
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        Fibonacci(45);
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime());
    }
    private static BigInteger Fibonacci(int n) {
        if (n < 2)
            return BigInteger.ONE;
        else
            return Fibonacci(n - 1).add(Fibonacci(n - 2));
    }
}
