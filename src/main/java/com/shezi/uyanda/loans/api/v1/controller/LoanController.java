package com.shezi.uyanda.loans.api.v1.controller;

import com.shezi.uyanda.loans.api.v1.handler.LoanHandler;
import com.shezi.uyanda.loans.api.v1.model.LoanRequest;
import com.shezi.uyanda.loans.api.v1.model.LoanResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/loans/")
public class LoanController {
    private final LoanHandler loanHandler;

    @Autowired
    public LoanController(LoanHandler aLoanHandler){
        this.loanHandler = aLoanHandler;
    }

    @RequestMapping(value = "/getLoans", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public LoanResponse getLoans(@RequestBody LoanRequest request){
        return loanHandler.getLoansById(request);
    }
}
