package com.nt.leetcode;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.HashMap;
import java.util.Map;

public class DateComparisonExample {
    public static void main(String[] args) {
        // Sample schedule map
        Map<String, Object> schedule = new HashMap<>();
        schedule.put("endDate", Timestamp.valueOf("2024-05-30 00:00:00"));

        // Extract the end date as a Timestamp
        Timestamp endDateTimestamp = (Timestamp) schedule.get("endDate");

        // Convert Timestamp to LocalDate
        LocalDate endDate = endDateTimestamp.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Check if the current date is after the end date
        if (currentDate.isAfter(endDate)) {
            System.out.println("Current date is after the end date.");
        } else {
            System.out.println("Current date is not after the end date.");
        }
    }
}
