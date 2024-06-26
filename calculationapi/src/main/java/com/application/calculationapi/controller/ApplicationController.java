package com.application.calculationapi.controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import com.application.calculationapi.service.ApplicationService;


@RestController
public class ApplicationController {

    private static final Logger logger = LoggerFactory.getLogger(ApplicationController.class);
    
    @Autowired
    ApplicationService service;

    @GetMapping("/api")
    public ResponseEntity<String> calculateMethod(){

        Runnable[] tasks={
            service.GetSquareTask,
            service.GetCubeTask,
            service.CheckEvenOrOddTask,
            service.CheckPrimeOrNotTask,
            service.CheckArmstrongNumberTask,
            service.CheckPalindromeTask,
            service.GetFactorialTask,
            service.GetReverseTask
        };

        for(int i=0;i<tasks.length;i++){
            try{
                Thread task= new Thread(tasks[i]);
                task.start();
            }catch(Exception e){
                logger.error("Error Occurs While Executing Task:" + e.getMessage());
                ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error Occurs While Eexecuting Task");
            }
        }
        logger.info("All Tasks Executed Sucessfully");
        return ResponseEntity.status(HttpStatus.OK).body("All Tasks Executed Sucessfully");
    }
    
}
