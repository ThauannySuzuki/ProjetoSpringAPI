INSERT INTO TMS_USUARIO (ID, NOME, LOGIN, SENHA, EMAIL) VALUES (1, 'Thauanny', 'thaulinda', '123', 'thau@gmail.com');

ALTER SEQUENCE TMS_USUARIO_ID_SEQ RESTART WITH 2;

INSERT INTO TMS_PERFIL (ID, DESCRICAO) VALUES (1, 'Administradora');
INSERT INTO TMS_PERFIL (ID, DESCRICAO) VALUES (2, 'Gerente');
INSERT INTO TMS_PERFIL (ID, DESCRICAO) VALUES (3, 'Cliente');


ALTER SEQUENCE TMS_PERFIL_SEQ RESTART WITH 4;
