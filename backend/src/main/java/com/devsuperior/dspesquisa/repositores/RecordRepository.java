package com.devsuperior.dspesquisa.repositores;

import org.springframework.data.jpa.repository.JpaRepository;
import com.devsuperior.dspesquisa.entities.Record;
 
public interface RecordRepository extends JpaRepository<Record, Long>{
	

}
