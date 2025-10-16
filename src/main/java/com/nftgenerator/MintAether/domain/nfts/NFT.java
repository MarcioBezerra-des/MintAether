package com.nftgenerator.MintAether.domain.nfts;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

import com.nftgenerator.MintAether.domain.collection.Collection;
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

@Entity(name = "nfts")
@Table(name = "nfts")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NFT {

    @Id
    @GeneratedValue(strategy=GenerationType.UUID)
    private UUID id;

    @Column(nullable=false)
    private String title;
    private String description;

    @Column(name="image_url", nullable=false)
    private String imageUrl;

    @Column(nullable=false)
    private BigDecimal price;

    @Column(nullable=false)
    private String status;

    @ManyToOne
    @JoinColumn(name="owner_id", nullable=false)
    private User user;

    @ManyToOne
    @JoinColumn(name="collection_id")
    private Collection collection;

    @Column(name="created_at", nullable=false, updatable=false)
    private Instant createdAt;

    @PrePersist
    protected void onCreate(){
        this.createdAt = Instant.now();
    }
}
