package com.aexp.reports.api.controllers;

import com.aexp.reports.beans.mapper.Mapper;
import com.aexp.reports.common.services.useraccount.UserAccountService;
import com.aexp.reports.contract.model.useraccount.UserAccountModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/useraccounts")
public class UserAccountController {
    @Autowired
    private UserAccountService userAccountService;
    @Autowired
    private Mapper mapper;

    @GetMapping
    public ResponseEntity<List<UserAccountModel>> get(){

        var response = userAccountService.getAll();
        var result = mapper.<UserAccountModel>mapToList(response.getResult());

        //if(response.getResult().size() == 1) return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);

        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
