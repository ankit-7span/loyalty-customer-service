package com.loyalty.service.customer.service;

import com.loyalty.service.customer.entity.Customer;
import com.loyalty.service.customer.entity.Wallet;

public interface WalletService {
    Wallet updateWallet(Customer customer,Long purchaseAmount);

    void deductLoyaltyPoints(Customer customer, Long loyaltyPoints);
}
