/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.text.ParseException;
import java.time.Duration;
import java.time.LocalDateTime;

/**
 *
 * @author kevinjerke
 */
public class DifferenceBetweenTwoTimes {
    public static void main(String[] args) throws ParseException {

     // difference between 2 times
        
        LocalDateTime start = 
                LocalDateTime.now().withHour(13).withMinute(45);
        LocalDateTime end = 
                LocalDateTime.now().withHour(15).withMinute(12);

        Duration diff = Duration.between(start, end);
        long hours = diff.toHours();
        long minutes = diff.toMinutes() % 60;
        
        System.out.println("You are paying for " + hours + "hours " + minutes + "minutes ");
    }
}
