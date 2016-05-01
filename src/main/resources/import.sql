INSERT INTO STATE (id, name, initials) VALUES('1', 'Goiás', 'GO');
INSERT INTO STATE (id, name, initials) VALUES('2', 'Mato Grosso', 'MT');
INSERT INTO STATE (id, name, initials) VALUES('3', 'Mato Grosso do Sul', 'MS');

ALTER SEQUENCE hibernate_sequence INCREMENT BY 4;

INSERT INTO CITY (id, capital, name, state_id) VALUES('1', true,'Goiânia', '1');
INSERT INTO CITY (id, capital, name, state_id) VALUES('2', true,'Cuiabá', '2');
INSERT INTO CITY (id, capital, name, state_id) VALUES('3', true,'Gampo Grande', '3');