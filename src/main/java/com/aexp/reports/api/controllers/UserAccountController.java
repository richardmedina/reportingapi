package com.aexp.reports.api.controllers;

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

    @GetMapping
    public ResponseEntity<List<UserAccountModel>> get(){

        var result = userAccountService.getAll();

        List<UserAccountModel> accounts = new ArrayList<>();

        return new ResponseEntity<>(accounts, HttpStatus.OK);
    }
}
