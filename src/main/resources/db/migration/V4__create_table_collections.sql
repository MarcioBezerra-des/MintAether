CREATE TABLE collections (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    name VARCHAR(255) NOT NULL,
    description TEXT,
    creator_id UUID NOT NULL,
    created_at TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,

    CONSTRAINT fk_collection_creator
        FOREIGN KEY(creator_id)
        REFERENCES users(id)
);

ALTER TABLE nfts
ADD COLUMN collection_id UUID,
ADD CONSTRAINT fk_nft_collection
    FOREIGN KEY(collection_id)
    REFERENCES collections(id);