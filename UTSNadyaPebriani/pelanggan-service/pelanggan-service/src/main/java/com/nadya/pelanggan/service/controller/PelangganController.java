/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nadya.pelanggan.service.controller;

import com.nadya.pelanggan.service.entity.Pelanggan;
import com.nadya.pelanggan.service.service.PelangganService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author win 11
 */
@RestController
@RequestMapping("/pelanggan")
public class PelangganController {
    @Autowired
    private PelangganService pelangganService;
    
    @PostMapping("/")
    public Pelanggan savePelanggan(@RequestBody Pelanggan pelanggan){
        return pelangganService.savePelanggan(pelanggan);
    }
    @GetMapping("/{id}")
    public Pelanggan findPelangganById(@PathVariable("id") Long pelangganId){
        return pelangganService.findPelangganById(pelangganId);
    }

    
}
