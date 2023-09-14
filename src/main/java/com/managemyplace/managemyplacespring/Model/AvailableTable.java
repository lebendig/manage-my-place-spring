package com.managemyplace.managemyplacespring.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

//@Getter
//@Setter incluso no data mas te construtor to string..
@Data 
@Entity
public class AvailableTable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "table_number", nullable = false)
    private String number;
}
