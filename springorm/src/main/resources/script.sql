USE springcore;

CREATE TABLE product (id INT, name VARCHAR(20), description VARCHAR(100), price DECIMAL(8,2));

INSERT INTO product VALUES (1, "Mouse", "IT product", 12.89);
INSERT INTO product VALUES (2, "Keyboard", "IT product", 54.26);
INSERT INTO product VALUES (3, "Monitor", "IT product", 200.00);
INSERT INTO product VALUES (4, "Laptop", "IT product", 599.99);

DELETE FROM product;

DELETE FROM passenger;

INSERT INTO passenger VALUES (1, "Noni", "Madueke");
INSERT INTO passenger VALUES (2, "Alexander", "Arnold");
INSERT INTO passenger VALUES (3, "Nunho", "Mendes");
INSERT INTO passenger VALUES (4, "Alexis", "Mac Allister");