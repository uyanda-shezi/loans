package com.shezi.uyanda.loans.api.v1.dao;

import com.shezi.uyanda.loans.api.v1.model.Loan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanDao extends CrudRepository<Loan, Long> {

    Loan findByLoanId(Long id);
}
