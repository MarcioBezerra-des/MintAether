CREATE INDEX idx_users_email ON users(email);

CREATE INDEX idx_nfts_ownner_id ON nfts(owner_id);
CREATE INDEX idx_nfts_collection_id ON nfts(collection_id);

CREATE INDEX idx_nfts_status ON nfts(status);

CREATE INDEX idx_transactions_nft_id ON transactions(nft_id);
CREATE INDEX idx_transactions_buyer_id ON transactions(buyer_id);
CREATE INDEX idx_transactions_seller_id ON transactions(seller_id);

CREATE INDEX idx_collections_creator_id ON collections(creator_id);