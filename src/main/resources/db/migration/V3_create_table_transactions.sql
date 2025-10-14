CREATE TABLE transactions (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    nft_id UUID NOT NULL,
    buyer_id UUID NOT NULL,
    seller_id UUID NOT NULL,
    transaction_price DECIMAL(19, 4) NOT NULL,
    blockchain_transaction_hash VARCHAR(255) UNIQUE,
    transaction_date TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,

    CONSTRAINT fk_transaction_nft
        FOREIGN KEY(nft_id)
        REFERENCES nfts(id),

    CONSTRAINT fk_transaction_buyer
        FOREIGN KEY(buyer_id)
        REFERENCES users(id),

    CONSTRAINT fk_transaction_seller
        FOREIGN KEY(seller_id)
        REFERENCES users(id)
);