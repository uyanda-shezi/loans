package com.shezi.uyanda.loans.api.v1.dao;

import com.shezi.uyanda.loans.api.v1.model.Loans;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoansDao extends CrudRepository<Loans, Long> {

    Loans findByLoanNumber(int loanNumber);
}
