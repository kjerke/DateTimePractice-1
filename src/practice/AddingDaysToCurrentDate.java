/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.time.LocalDate;

/**
 *
 * @author kevinjerke
 */
public class AddingDaysToCurrentDate {
    public static void main(String[] args) {
        
        
        
        LocalDate date = LocalDate.now().plusDays(16);
        System.out.println(date);
    }
}
