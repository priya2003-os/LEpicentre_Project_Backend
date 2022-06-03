DELETE FROM roles;
DELETE FROM users;
DELETE FROM countries;
DELETE FROM brands;
DELETE FROM categories;
DELETE FROM products;


INSERT INTO users (username, password, role_id) VALUES 	
	('Freddy', '$2a$10$jtjVcOpwmLp4Zqn2vHYLUeTSqnXxrvU3FIzuFI2nt62U1FAAbhq3S', (SELECT t.id FROM roles t WHERE t.name = 'Administrateur')),
	('Stephane', 'UIOPQ', (SELECT t.id FROM roles t WHERE t.name = 'Utilisateur'));
	
INSERT INTO roles (name) VALUES 
	('ROLE_Administrateur'),
	('ROLE_Utilisateur'),
	('ROLE_Visiteur');
	
INSERT INTO countries (name, picture) VALUES 	
		('CANADA', 'https://www.freepng.fr/png-msf82b/download.html'),
		('ITALIE', 'https://img.freepik.com/vecteurs-libre/made-in-italy-logo-italie-drapeau-icones-du-logo-vectoriel_526569-249.jpg?w=900');
		
INSERT INTO brands (name, picture) VALUES 	
				('BULLS HEAD', 'https://www.canadianfoodwholesaler.com/wp-content/uploads/2020/11/4-marque_bullshead.jpg'),
				('DOLCIOSO', 'https://www.italpassion.com/wp-content/uploads/2016/05/dolcioso.png');
				
INSERT INTO categories (name, picture) VALUES 	
				('Boisson', 'https://trailandrunning.com/wp-content/uploads/2014/07/gatorade-boisson-energetique-1024x645.jpg'),
				('Sucre', 'https://cdn.bioalaune.com/img/article/thumb/900x500/12680-sucres.jpg');	
			
INSERT INTO products (name, description, picture, price, country_id, brand_id, category_id) VALUES 	
				('Cola Naturel', 'blabla','https://static.wixstatic.com/media/c50897_dad4628de13a4cf792f3b504e463c23c~mv2.jpg/v1/fill/w_472,h_450,al_c,q_80,usm_0.66_1.00_0.01,enc_auto/BH-5Cola%2Bfond.jpg', 3.8, (SELECT t.id FROM countries t WHERE t.name = 'CANADA'), (SELECT t.id FROM brands t WHERE t.name = 'BULLS HEAD'), (SELECT t.id FROM categories t WHERE t.name = 'Boisson') ),
				('Mini Panettone', 'blabla2','shttps://www.felicilli.com/wp-content/uploads/2021/11/felicilli169-48.jpg', 15,(SELECT t.id FROM countries t WHERE t.name = 'ITALIE'), (SELECT t.id FROM brands t WHERE t.name = 'DOLCIOSO'), (SELECT t.id FROM categories t WHERE t.name = 'Sucre'));							
	
	
		