/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.lab;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjusters;

/**
 *
 * @author kevinjerke
 */
public class DateUtilities {
      
        public static long timeDifferenceInHours(Temporal
            startingTemporalObject, Temporal endingTemporalObject) {
            if(startingTemporalObject == null || endingTemporalObject == null) {
                throw new IllegalArgumentException("Only valid LocalTime Objects" + "accepted. ");
            }
            return Duration.between(startingTemporalObject, endingTemporalObject).toHours();
        }
        
        public static LocalDateTime toLocalDateTime(String dateTimeFormat, 
                String dateTimeToParse) throws IllegalArgumentException{
            if(dateTimeFormat.isEmpty() || dateTimeFormat == null || 
                    dateTimeToParse.isEmpty() || dateTimeToParse == null) {
                throw new IllegalArgumentException("Provided Strings of DateTime "
                        + "format and DateTime to parse canot be null");
            }
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(dateTimeFormat);
            return LocalDateTime.parse(dateTimeToParse, formatter);
        }
        
        public static LocalDate toLocalDate(String dateFormat, String dateToParse) throws IllegalArgumentException{
            if(dateFormat.isEmpty() || dateFormat == null || dateToParse.isEmpty() || dateToParse == null) {
                throw new IllegalArgumentException("Provided Strings of Date" + "format and Date to parse cannot be empty or null"); 
            }
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(dateFormat);
            return LocalDate.parse(dateToParse, formatter);
        }
        
        
        
        public static LocalTime toLocalTime(String timeFormat, String timeToParse) throws IllegalArgumentException {
            if(timeFormat.isEmpty() || timeFormat == null || timeToParse.isEmpty() ||timeToParse == null) {
                throw new IllegalArgumentException("Provided LocalDateTime Object" + "cannot be null. Provided String for LocalDateTime" + "format cannot be empty or null");
            }
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(timeFormat);
            return LocalTime.parse(timeToParse, formatter);
        }
        
        
        public static String toFormattedLocalDateTime(LocalDateTime localDateTime, String localDateTimeFormat) throws IllegalArgumentException {
            if(localDateTime == null || localDateTimeFormat.isEmpty() || 
                    localDateTimeFormat == null) {
                throw new IllegalArgumentException("Provided LocalDateTime object" + "cannot be null. Provided String for LocalDateTime" + "format cannot be empty or null");
                
            } 
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(localDateTimeFormat);
            return formatter.format(localDateTime);
        }
        
        
         public static void main(String[] args) {
             
         }
}
