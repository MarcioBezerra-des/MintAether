package com.nftgenerator.MintAether.domain.transaction;

import  java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

import com.nftgenerator.MintAether.domain.nfts.NFT;
import com.nftgenerator.MintAether.domain.user.User;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "transactions")
@Table(name = "transactions")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Transaction {
    @Id
    @GeneratedValue(strategy=GenerationType.UUID)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "nft_id", nullable=false)
    private NFT nft;

    @ManyToOne
    @JoinColumn(name = "buyer_id", nullable=false)
    private User buyer;
    
    @ManyToOne
    @JoinColumn(name = "seller_id", nullable=false)
    private User seller;
    
    @Column(name = "transaction_price", nullable=false)
    private BigDecimal transactionPrice;
    
    @Column(name = "blockchain_transaction_hash", nullable=false)
    private String blockinTransactionHash;
    
    @Column(name = "transaction_date", nullable=false, updatable=false)
    private Instant transactionDate;

    @PrePersist
    protected void onCreate() {
        this.transactionDate = Instant.now();
    }
}
