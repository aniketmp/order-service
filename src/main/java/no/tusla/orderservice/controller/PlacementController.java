package no.tusla.orderservice.controller;

import no.tusla.orderservice.security.UserContext;
import no.tusla.orderservice.security.UserContextHolder;
import no.tusla.orderservice.service.OrderService;
import no.tusla.orderservice.service.ServiceCalls;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="v1")
public class PlacementController {


   @Autowired
   OrderService orderService;
    
    
    private String vinToModel(String vin){
        switch (vin) {
            case "123" : return "Tusla Trucky";
            case "abc" : return "model 42";
            default: return "Tusla Y";
        }
    }

    @GetMapping("/")
    public String index(){
        return "Welcome to Tusla's Orderservice!";
    }

    @GetMapping(value = "/orders/getTire/{vin}/{season}")
    public String getTires(@PathVariable String vin, @PathVariable String season) {
       System.out.println("Entering Controller...");
      
        String data = "{}";

        // get available stock
        //String stock = serviceCalls.callStockService(vinToModel(vin), season);
        String stock = orderService.callStockService(vin, season);
       
        // Get advertisement
//        String next = serviceCalls.callSupplyService(vinToModel(vin));
//        String next = serviceCalls.callSupplyService(vin);
          String next = orderService.callSupplyService(vin);

        // Wrap data in JSON style
        data = "{\"product\":" + stock + ",\"advertisement\":" + next + "}";
        
        
        System.out.println("Leaving Controller...");
        return data;
    }


}