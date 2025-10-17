package com.nftgenerator.MintAether.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nftgenerator.MintAether.domain.nfts.NFT;

@Repository
public interface NFTRepository extends JpaRepository<NFT, UUID>{
}
