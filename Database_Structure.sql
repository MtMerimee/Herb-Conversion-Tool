START TRANSACTION;

CREATE TABLE herbs_spices (
    id serial PRIMARY KEY,
    name VARCHAR(50),
    fresh VARCHAR(50),
    dry VARCHAR(50)
);

CREATE TABLE conversion_factors (
  id SERIAL PRIMARY KEY,
  herb_id INTEGER NOT NULL REFERENCES herbs_spices(id),
  fresh_factor INTEGER NOT NULL,
  dry_factor INTEGER NOT NULL
);

CREATE TABLE measurements (
  id serial PRIMARY KEY,
  unit VARCHAR (4)
);

  -- Insert our units of measurement
Insert into measurements (unit)
VALUES
('Cup'), 
('Tbsp'),
('tsp');

-- Inseert data into the herbs and spices chart.
INSERT INTO herbs_spices (name, fresh, dry)
VALUES
('Ginger Root', 'Root', 'Ground'),
('Cardamom', 'Pods', 'Ground'),
('Chervil', 'Fresh', 'Dried'),
('Cilantro', 'Fresh', 'Dried'),
('Dill', 'Fresh', 'Dried'),
('Marjoram', 'Fresh', 'Dried'),
('Oregano', 'Fresh', 'Dried'),
('Rosemary', 'Fresh', 'Dried'),
('Tarragon', 'Fresh', 'Dried'),
('Thyme', 'Fresh', 'Dried'),
('Garlic', 'Clove', 'Powder'),
('Turmeric', 'Root', 'Ground'),
('Parsley', 'Fresh', 'Dried'),
('Sage', 'Fresh', 'Ground'),
('Basil', 'Fresh', 'Dried'),
('Star Anise', '', 'Powder'),
('Cinnamon', 'Fresh', 'Ground'),
('Vanilla', 'Bean Pod', 'Extract'),
('Onion', 'Fresh', 'Powder'),
('Allspice', '', 'Ground'),
('Pepper', '', ''),
('Lemon', 'Whole', 'Juice'),
('Bay Leaf', 'Fresh', 'Dried'),
('Nutmeg', '', 'Ground');

-- Insert data into conversion_factors table
INSERT INTO conversion_factors (herb_id, fresh_factor, dry_factor)
VALUES 
  (1, 3, 1), 
  (2, 12, 1), 
  (3, 3, 1), 
  (4, 3, 1), 
  (5, 3, 1), 
  (6, 3, 1), 
  (7, 3, 1), 
  (8, 3, 1), 
  (9, 3, 1), 
  (10, 3, 1), 
  (11, 3, 1), 
  (12, 3, 1), 
  (13, 2, 1), 
  (14, 2, 1), 
  (15, 2, 1), 
  (16, 2, 1), 
  (17, 2, 1), 
  (18, 1, 1), 
  (19, 1, 1), 
  (20, 1, 1), 
  (21, 1, 1.5), 
  (22, 1, 9), 
  (23, 1, 2), 
  (24, 1, 2);
  
  COMMIT;