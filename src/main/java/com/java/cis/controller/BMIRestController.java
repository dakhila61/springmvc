package com.java.cis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.DecimalFormat;

@RestController
public class BMIRestController {

    @GetMapping("/restinput")
    public String input() {
        return "restinput";
    }
    @GetMapping("/result")
    public String result() {
        return "result";
    }

    @PostMapping("/restbmi")
    public String calculateBMI(@RequestParam("height") double height,
                               @RequestParam("weight") double weight) {
        double bmi = calculateBMIValue(height, weight);
        DecimalFormat df = new DecimalFormat("#.##");
        String formattedBMI = df.format(bmi);
        return "Your BMI is: " + formattedBMI;
    }

    private double calculateBMIValue(double height, double weight) {
        // Convert height to meters
        double heightInMeters = height / 100.0; // Assuming height is in centimeters

        // Calculate BMI
        return weight / (heightInMeters * heightInMeters);
    }

}
