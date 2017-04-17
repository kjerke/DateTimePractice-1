/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.time.Duration;
import java.time.LocalDateTime;

/**
 *
 * @author kevinjerke
 */
public class DifferenceBetweenTwoDates {
    public static void main(String[] args) {
        LocalDateTime start = LocalDateTime.now();
        LocalDateTime end = LocalDateTime.now().withYear(2017).withMonth(12).withDayOfMonth(25);
        
        Duration duration = Duration.between(start, end);
        long days = duration.toDays();
        
        System.out.println(days);
    }
}
