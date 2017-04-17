/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.time.LocalDate;
import java.time.Year;

/**
 *
 * @author kevinjerke
 */
public class FindingNextLeapYear {
    public static void main(String[] args) {
        
    
    
    int year = LocalDate.now().withYear(2050).getYear();
    while(!Year.isLeap(year)) {
        year++;
        }
        System.out.println("The Next Leap year is: ");
    }
    
    
  
}
