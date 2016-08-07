INSERT INTO STATE (id, name, initials) VALUES('1', 'Goiás', 'GO');
INSERT INTO STATE (id, name, initials) VALUES('2', 'Mato Grosso', 'MT');
INSERT INTO STATE (id, name, initials) VALUES('3', 'Mato Grosso do Sul', 'MS');

ALTER SEQUENCE STATE_ID_SEQ RESTART WITH 4;

INSERT INTO CITY (id, capital, name, state_id) VALUES('1', true,'Goiânia', '1');
INSERT INTO CITY (id, capital, name, state_id) VALUES('2', true,'Cuiabá', '2');
INSERT INTO CITY (id, capital, name, state_id) VALUES('3', true,'Gampo Grande', '3');

ALTER SEQUENCE CITY_ID_SEQ RESTART WITH 4;

INSERT INTO SYSTEM_USER (id, name, login, password) VALUES ('1', 'Administrador', 'admin', 'admin');
INSERT INTO SYSTEM_USER (id, name, login, password) VALUES ('2', 'Usuário', 'user', 'user');

ALTER SEQUENCE SYSTEM_USER_ID_SEQ RESTART WITH 3;

INSERT INTO CONTACT (id, name, state_id, city_id, district, street, phone, email) VALUES ('1', 'José da Silva', '1', '1', 'Centro', 'Av. Goiás', '6232146598', 'josedasilva@email.com');
INSERT INTO CONTACT (id, name, state_id, city_id, district, street, phone, email) VALUES ('2', 'Maria Barbosa', '1', '1', 'Centro', 'Av. Goiás', '6232147845', 'mariabarbosa@email.com');
INSERT INTO CONTACT (id, name, state_id, city_id, district, street, phone, email) VALUES ('3', 'Ana Lins', '1', '1', 'Centro', 'Av. Goiás', '6232147391', 'analins@email.com');

ALTER SEQUENCE CONTACT_ID_SEQ RESTART WITH 4;