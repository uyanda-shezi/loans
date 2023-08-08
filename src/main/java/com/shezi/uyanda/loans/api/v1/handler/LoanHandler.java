package com.shezi.uyanda.loans.api.v1.handler;

import com.shezi.uyanda.loans.api.v1.dao.LoansDao;
import com.shezi.uyanda.loans.api.v1.model.Loans;
import com.shezi.uyanda.loans.api.v1.model.LoanRequest;
import com.shezi.uyanda.loans.api.v1.model.LoanResponse;
import org.springframework.stereotype.Component;

@Component(LoanHandler.BEAN_NAME)
public class LoanHandler {
    public static final String BEAN_NAME = "handler.LoanHandler";
    private final LoansDao loansDao;

    public LoanHandler(final LoansDao aLoansDao){
        this.loansDao = aLoansDao;
    }

    public LoanResponse getLoansById(LoanRequest request){
        return mapToResponse(loansDao.findByLoanNumber(request.getLoanNumber()));
    }

    private LoanResponse mapToResponse(Loans loans) {
        LoanResponse response = new LoanResponse();
        response.setLoans(loans);
        return response;
    }
}
