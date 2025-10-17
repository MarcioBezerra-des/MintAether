package com.nftgenerator.MintAether.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nftgenerator.MintAether.domain.transaction.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, UUID>{

}
