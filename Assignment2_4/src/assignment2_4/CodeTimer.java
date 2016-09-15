package assignment2_4;
import java.util.*;

//prankuragarwal

public class CodeTimer {
    private long startTime, endTime;
    
    CodeTimer(){
        startTime = System.currentTimeMillis();
    }
    
    long getStartTime(){
        return startTime;
    }
    
    long getEndTime(){
        return endTime;
    }
    
    void start(){
        startTime = System.currentTimeMillis();
    }
    
    void stop(){
        endTime = System.currentTimeMillis();
    }
    
    long getElapsedTime(){
        long timeElapsed;
        startTime = getStartTime();
        endTime = getEndTime();
        timeElapsed = endTime - startTime;
        return timeElapsed;
    }
}
