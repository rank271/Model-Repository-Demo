package com.example.modelrepositorydemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * @className: transactionService
 * @author: admin
 * @Version: 1.0
 * @description:
 */
@Service
public class transactionService {
    @Autowired
    private TransactionTemplate transactionTemplate;

}
