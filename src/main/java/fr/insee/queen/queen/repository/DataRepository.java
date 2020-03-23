package fr.insee.queen.queen.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.insee.queen.queen.domain.Data;
import fr.insee.queen.queen.dto.data.DataDto;

/**
* DataRepository is the repository using to access to  Data table in DB
* 
* @author Claudel Benjamin
* 
*/
public interface DataRepository extends JpaRepository<Data, Long> {
	/**
	* This method retrieve all Data in DB
	* 
	* @return List of all {@link DataDto}
	*/
	List<DataDto> findDtoBy();
	/**
	* This method retrieve the Data for a specific reporting_unit
	* 
	* @param id the id of reporting unit
	* @return {@link DataDto}
	*/
	DataDto findDtoByReportingUnit_id(Long id);
	/**
	* This method retrieve the Data for a specific reporting_unit
	* 
	* @param id the id of reporting unit
	* @return {@link Data}
	*/
	Optional<Data> findByReportingUnit_id(Long id);
}
