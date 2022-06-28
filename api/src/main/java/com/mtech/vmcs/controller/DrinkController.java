package com.mtech.vmcs.controller;

import com.mtech.vmcs.model.entity.Drink;
import com.mtech.vmcs.model.entity.PurchaseOrder;
import com.mtech.vmcs.service.DrinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin
@Controller
@RequestMapping(path = "/drinks")
public class DrinkController {
  @Autowired private DrinkService drinkService;

  @GetMapping
  public ResponseEntity<List<Drink>> getAllDrinks() {
    return new ResponseEntity<>(drinkService.getAllDrinks(), HttpStatus.OK);
  }

  @GetMapping("/{name}")
  public ResponseEntity<List<Drink>> getDrinksByName(@PathVariable(value = "name") String name) {
    return new ResponseEntity<>(drinkService.getDrinksByName(name), HttpStatus.OK);
  }

  @PostMapping
  public ResponseEntity<List<Drink>> createDrinks(@RequestBody List<Drink> drinks) {
    drinkService.createDrinks(drinks);
    return new ResponseEntity<>(HttpStatus.CREATED);
  }

  @PutMapping
  public ResponseEntity<List<Drink>> updateDrinks(@RequestBody List<Drink> drinks) {
    drinkService.updateDrinks(drinks);
    return new ResponseEntity<>(HttpStatus.OK);
  }

  @DeleteMapping
  public ResponseEntity<List<Long>> deleteDrinks(@RequestBody List<Long> drinkIds) {
    drinkService.deleteDrinks(drinkIds);
    return new ResponseEntity<>(HttpStatus.OK);
  }

  @PostMapping("/purchase")
  public ResponseEntity<Map<String, Object>> purchase(@RequestBody PurchaseOrder purchaseOrder) {
    return new ResponseEntity<>(drinkService.purchase(purchaseOrder), HttpStatus.OK);
  }

  @PostMapping("/purchase/undo")
  public ResponseEntity<PurchaseOrder> undoPurchase() {
    drinkService.undoPurchase();
    return new ResponseEntity<>(HttpStatus.OK);
  }
}
