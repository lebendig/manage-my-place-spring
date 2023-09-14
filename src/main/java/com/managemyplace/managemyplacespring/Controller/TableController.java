package com.managemyplace.managemyplacespring.Controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.managemyplace.managemyplacespring.Model.AvailableTable;
import com.managemyplace.managemyplacespring.Repository.TableRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/tables")
@AllArgsConstructor //gera o contrutor com todos os armgunteos
public class TableController {
   private final TableRepository tableRepository;

    @GetMapping // =  @RequestMapping(method = RequestMethod.GET)
    public List<AvailableTable> getTables(){
        return tableRepository.findAll();
    }

    
}
