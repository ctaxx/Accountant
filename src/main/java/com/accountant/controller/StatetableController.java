package com.accountant.controller;

import com.accountant.entity.StatetableEntity;
import com.accountant.model.dto.request.OnePartRequest;
import com.accountant.model.dto.response.ShowAllPartsResponse;
import com.accountant.model.dto.response.StateTableStubResponse;
import com.accountant.model.dto.response.OnePartResponse;
import com.accountant.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class StatetableController {
    private StateRepository stateRepository;

    @Autowired
    public StatetableController(StateRepository stateRepository) {
        this.stateRepository = stateRepository;
    }

    @GetMapping("/showStateEntity")
    @ResponseBody
    public OnePartResponse getStateEntity(){
        OnePartResponse onePartResponse = new OnePartResponse();
        StatetableEntity statetableEntity = stateRepository.findOne(1);
        onePartResponse.setPart(statetableEntity);
        return onePartResponse;
    }

    @GetMapping("/showAll")
    @ResponseBody
    public ShowAllPartsResponse getAllStateEntity(){
        System.out.println("showAll controller works");
        ShowAllPartsResponse showAllPartsResponse = new ShowAllPartsResponse();
        List<StatetableEntity> listOfParts = stateRepository.findAll();
        showAllPartsResponse.setListOfAll(listOfParts);
        return showAllPartsResponse;
    }

    @GetMapping("/addPart")
    @ResponseBody
    public StateTableStubResponse addPart(OnePartRequest request){
        System.out.println("Cyrillic symbols is " + request.getPart());
        StatetableEntity tmpEntity = new StatetableEntity();
        tmpEntity.setId(request.getId());
        tmpEntity.setOrdr(request.getOrdr());
        tmpEntity.setPart(request.getPart());
        tmpEntity.setQuantity(request.getQuantity());
        tmpEntity.setCurrentState(request.getCurrentState());
        stateRepository.save(tmpEntity);
        return new StateTableStubResponse(true);
    }
}
