package fr.insee.queen.queen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.insee.queen.queen.domain.QuestionnaireModel;
import fr.insee.queen.queen.dto.questionnairemodel.QuestionnaireModelDto;
import fr.insee.queen.queen.repository.QuestionnaireModelRepository;

/**
* QuestionnaireModelController is the Controller using to manage {@link QuestionnaireModel} entity
* 
* @author Claudel Benjamin
* 
*/
@RestController
@RequestMapping
public class QuestionnaireModelController {
	/**
	* The questionnaire model repository using to access to table 'questionnaire_model' in DB 
	*/
	@Autowired
	private QuestionnaireModelRepository questionnaireModelRepository;
	
	/**
	* This method is using to get the questionnaireModel associated to a specific operation 
	* 
	* @param id the id of operation
	* @return the {@link QuestionnaireModelDto} associated to the operation
	*/
	@GetMapping(path = "/operation/{id}/questionnaire")
	public QuestionnaireModelDto getQuestionnaireModelByOperationId(@PathVariable(value = "id") String id){
		return questionnaireModelRepository.findDtoByOperationId(id);
	}
	
	
}
