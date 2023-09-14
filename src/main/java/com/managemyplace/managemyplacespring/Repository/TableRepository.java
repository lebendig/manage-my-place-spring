package com.managemyplace.managemyplacespring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.managemyplace.managemyplacespring.Model.AvailableTable;

@Repository
public interface TableRepository extends JpaRepository<AvailableTable, Long> {
    
}
