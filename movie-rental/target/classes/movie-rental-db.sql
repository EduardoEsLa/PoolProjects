DROP TABLE IF EXISTS CART 
DROP TABLE IF EXISTS INVOICE 
DROP TABLE IF EXISTS MOVIE 
DROP TABLE IF EXISTS CUSTOMER 
DROP TABLE IF EXISTS USER_ROLES 
DROP TABLE IF EXISTS ROLE 
DROP TABLE IF EXISTS USER 


CREATE TABLE MOVIE(
	Id INTEGER IDENTITY PRIMARY KEY,
	Title VARCHAR(50),
	Genre VARCHAR(50),
	Year INTEGER,
	Classification VARCHAR(50),
	Quantity INTEGER,
	Description VARCHAR(200)
	);
	
CREATE TABLE USER(
	Id INTEGER IDENTITY PRIMARY KEY,
	Username VARCHAR(20),
	Password VARCHAR(20),
	);

CREATE TABLE CUSTOMER(
	Id INTEGER IDENTITY PRIMARY KEY,
	Name VARCHAR(100),
	Lastname VARCHAR(100),
	Address VARCHAR(100),
	Birthday DATE,
	Email VARCHAR(50),
	Phone VARCHAR(12),
	User_Id INTEGER,
	FOREIGN KEY(User_Id) REFERENCES USER(Id)
	);

CREATE TABLE ROLE(
	Id INTEGER IDENTITY PRIMARY KEY,
	Description VARCHAR(50)
	);
	
CREATE TABLE USER_ROLES(
	User_Id INTEGER,
	Role_Id INTEGER,
	FOREIGN KEY (User_Id) REFERENCES USER(Id),
	FOREIGN KEY (Role_Id) REFERENCES ROLE(Id)
	);
	
CREATE TABLE INVOICE(
	Invoice_No INTEGER IDENTITY PRIMARY KEY,
	Customer_Id INTEGER,
	Movie_Id INTEGER,
	Price FLOAT,
	Rental_Date DATE,
	Return_Date DATE,
	Qty INTEGER,
	Total FLOAT,
	FOREIGN KEY (Customer_Id) REFERENCES CUSTOMER(Id),
	FOREIGN KEY (Movie_Id) REFERENCES MOVIE(Id)
	);
	
	
CREATE TABLE CART (
	Cart_Id INTEGER IDENTITY PRIMARY KEY,
	Price INTEGER,
	Movie_Id INTEGER,
	Username VARCHAR(20),
	FOREIGN KEY (Movie_Id) REFERENCES MOVIE(Id)
);