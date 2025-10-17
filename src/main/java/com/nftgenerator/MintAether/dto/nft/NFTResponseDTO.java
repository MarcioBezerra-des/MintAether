package com.nftgenerator.MintAether.dto.nft;

import java.math.BigDecimal;
import java.util.UUID;

public record NFTResponseDTO(
    UUID id,
    String title,
    String description,
    String imageUrl,
    BigDecimal price,
    String status,
    UUID ownerId
) {}