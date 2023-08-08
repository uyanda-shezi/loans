package com.shezi.uyanda.loans.api.v1.handler;

import com.shezi.uyanda.loans.api.v1.dao.LoanDao;
import com.shezi.uyanda.loans.api.v1.model.Loan;
import com.shezi.uyanda.loans.api.v1.model.LoanRequest;
import com.shezi.uyanda.loans.api.v1.model.LoanResponse;
import org.springframework.stereotype.Component;

@Component(LoanHandler.BEAN_NAME)
public class LoanHandler {
    public static final String BEAN_NAME = "handler.LoanHandler";
    private final LoanDao loanDao;

    public LoanHandler(final LoanDao aLoanDao){
        this.loanDao = aLoanDao;
    }

    public LoanResponse getLoansById(LoanRequest request){
        return mapToResponse(loanDao.findByLoanId((long)request.getLoanId()));
    }

    private LoanResponse mapToResponse(Loan loan) {
        LoanResponse response = new LoanResponse();
        response.setLoan(loan);
        return response;
    }
}
