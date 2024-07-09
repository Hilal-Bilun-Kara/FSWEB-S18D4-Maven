package com.workintech.s18d1.controller;


import com.workintech.s18d1.dao.BurgerDao;
import com.workintech.s18d1.entity.BreadType;
import com.workintech.s18d1.entity.Burger;
import com.workintech.s18d1.util.BurgerValidaton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/burger")
public class BurgerController {

    private final BurgerDao burgerDao;

    @Autowired
    public BurgerController(BurgerDao burgerDao) {
        this.burgerDao = burgerDao;
    }

    @PostMapping
    public Burger save(@RequestBody Burger burger){
        BurgerValidaton.checkName(burger.getName());
        return burgerDao.save(burger);
    }
    @GetMapping
    public List<Burger> findAll(){
        return burgerDao.findAll();
    }

    @GetMapping("/{id}")
    public Burger findById(@PathVariable long id){
        return burgerDao.findById(id);
    }

    @PutMapping("/{id}")
    public Burger update(@RequestBody Burger burger){
        BurgerValidaton.checkName(burger.getName());
        return burgerDao.update(burger);
    }

    @DeleteMapping("/{id}")
    public Burger remove(@PathVariable long id){
        return burgerDao.remove(id);
    }

    @GetMapping("/breadType/{breadType}")
    public List<Burger> getByBreadType(@PathVariable("breadType") String breadType){
        return burgerDao.findByBreadType(BreadType.valueOf(breadType));
    }

    @GetMapping("/price/{price}")
        public List<Burger> getByPrice(@PathVariable("price") Integer price){
            return burgerDao.findByPrice(price);
    }

    @GetMapping("/content/{content}")
    public List<Burger> getByContents(@PathVariable("content") String content){
        return burgerDao.findByContent(content);
    }

}
