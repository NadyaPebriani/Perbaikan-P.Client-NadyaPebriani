/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nadya.anggota.service;

import com.nadya.anggota.entity.Anggota;
import com.nadya.anggota.repository.RepositoryAnggota;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author win 11
 */
@Service
public class AnggotaService {
    @Autowired
    private RepositoryAnggota anggotaRepository;
    
    public Anggota saveAnggota(Anggota anggota){
        return anggotaRepository.save(anggota);
    }
    
    public Anggota findAnggotaById(Long anggotaId){
        return anggotaRepository.findByAnggotaId(anggotaId);
    }
        public List<Anggota> getAllAnggota(){
        return anggotaRepository.findAll();
    }
    
    public void deleteAnggota(Long anggotaId){ 
       anggotaRepository.deleteById(anggotaId);
    }
    
    public Anggota updateAnggota(Anggota anggota){
        return anggotaRepository.save(anggota);
    }
}
