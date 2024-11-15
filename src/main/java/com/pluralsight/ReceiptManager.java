package com.pluralsight;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

//public class ReceiptManager {
//public void saveReceipt(Order order) throws IOException {
//        String filename = "src/main/resources/Receipts";
////        try (BufferedWriter writeToReceipt = (new FileWriter(filename)) {
////
////        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm a");
////        String dateTime = LocalDateTime.now().format(formatter);
////        writeToReceipt.write("Date-Time: " + dateTime + "\n");
////
////        }
////

////
////
////
////        System.out.println("Receipt saved to " + filename);
////        } catch (IOException e) {
////        System.out.println("Error saving receipt: " + e.getMessage());
////
////        }
//        }