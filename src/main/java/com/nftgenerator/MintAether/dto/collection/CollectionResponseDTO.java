package com.nftgenerator.MintAether.dto.collection;

import java.util.List;
import java.util.UUID;

import com.nftgenerator.MintAether.dto.nft.NFTResponseDTO;

public record CollectionResponseDTO(
    UUID id,
    String name,
    String description,
    UUID creatorId,
    List<NFTResponseDTO> nfts
) {}
