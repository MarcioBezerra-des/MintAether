package com.nftgenerator.MintAether.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nftgenerator.MintAether.domain.collection.Collection;

@Repository
public interface CollectionRepository  extends JpaRepository<Collection, UUID>{

}
