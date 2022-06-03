DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS roles;
DROP TABLE IF EXISTS products;
DROP TABLE IF EXISTS countries;
DROP TABLE IF EXISTS brands;
DROP TABLE IF EXISTS categories;


CREATE TABLE roles (
	id SERIAL PRIMARY KEY,
	name varchar(100) UNIQUE NOT NULL

);

CREATE TABLE users (
	id SERIAL PRIMARY KEY,
	username varchar(60) UNIQUE NOT NULL,
	password char(60),
	role_id INTEGER,
	CONSTRAINT fk_role_id
		FOREIGN KEY (role_id)
		REFERENCES roles(id)
);

CREATE TABLE countries (
	id SERIAL PRIMARY KEY,
	name varchar(200) UNIQUE NOT NULL,
	picture varchar(300)
	
);

CREATE TABLE brands (
	id SERIAL PRIMARY KEY,
	name varchar(200) UNIQUE NOT NULL,
	picture varchar(300)
	
);

CREATE TABLE categories (
	id SERIAL PRIMARY KEY,
	name varchar(200) UNIQUE NOT NULL,
	picture varchar(300)
	
);

CREATE TABLE products (
	id SERIAL PRIMARY KEY,
	name varchar(100) UNIQUE NOT NULL,
	description varchar(500),
	picture varchar(300),
	price DECIMAL NOT NULL,
	country_id INTEGER,
	CONSTRAINT fk_country_id FOREIGN KEY (country_id) REFERENCES countries(id),
	brand_id INTEGER,
	CONSTRAINT fk_brand_id FOREIGN KEY (brand_id) REFERENCES brands(id),
	category_id INTEGER,
	CONSTRAINT fk_category_id FOREIGN KEY (category_id) REFERENCES categories(id)
	
);

