DELETE FROM transactions;
DELETE FROM nfts;
DELETE FROM collections;
DELETE FROM users;

-- Insere dois usuários de exemplo com UUIDs válidos
INSERT INTO users (id, name, email, password) VALUES
('10eebc99-9c0b-4ef8-bb6d-6bb9bd380a11', 'Alice Wonder', 'alice@example.com', 'hashed_password_1'),
('20eebc99-9c0b-4ef8-bb6d-6bb9bd380a12', 'Bob Builder', 'bob@example.com', 'hashed_password_2');

-- Insere uma coleção de exemplo, criada pela Alice
INSERT INTO collections (id, name, description, creator_id) VALUES
('30eebc99-9c0b-4ef8-bb6d-6bb9bd380a13', 'Abstract Dreams', 'A collection of AI-generated abstract art.', '10eebc99-9c0b-4ef8-bb6d-6bb9bd380a11');

-- Insere três NFTs de exemplo com UUIDs válidos
INSERT INTO nfts (id, title, description, image_url, price, owner_id, collection_id) VALUES
('40eebc99-9c0b-4ef8-bb6d-6bb9bd380a14', 'Cosmic Swirl', 'A vortex of colors.', 'http://example.com/image1.png', 1.50, '10eebc99-9c0b-4ef8-bb6d-6bb9bd380a11', '30eebc99-9c0b-4ef8-bb6d-6bb9bd380a13'),
('50eebc99-9c0b-4ef8-bb6d-6bb9bd380a15', 'Digital Forest', 'A forest rendered by algorithms.', 'http://example.com/image2.png', 2.75, '10eebc99-9c0b-4ef8-bb6d-6bb9bd380a11', '30eebc99-9c0b-4ef8-bb6d-6bb9bd380a13'),
('60eebc99-9c0b-4ef8-bb6d-6bb9bd380a16', 'Oceanic Glitch', 'The ocean, but with a digital twist.', 'http://example.com/image3.png', 0.99, '20eebc99-9c0b-4ef8-bb6d-6bb9bd380a12', NULL);