insert into USUARIOS (id, username, password, role) values (100, 'ana@email.com', '$2a$12$WqmXRLzgs4wjI6Bocm6gAOdzV9eLxzeHZC1D0ekLZBpeM4NPRC6mC', 'ROLE_ADMIN');
insert into USUARIOS (id,username, password, role) values (101, 'bia@email.com', '$2a$12$WqmXRLzgs4wjI6Bocm6gAOdzV9eLxzeHZC1D0ekLZBpeM4NPRC6mC', 'ROLE_CLIENTE');
insert into USUARIOS (id,username, password, role) values (102, 'bob@email.com', '$2a$12$WqmXRLzgs4wjI6Bocm6gAOdzV9eLxzeHZC1D0ekLZBpeM4NPRC6mC', 'ROLE_CLIENTE');
insert into USUARIOS (id,username, password, role) values (103, 'toby@email.com', '$2a$12$WqmXRLzgs4wjI6Bocm6gAOdzV9eLxzeHZC1D0ekLZBpeM4NPRC6mC', 'ROLE_CLIENTE');

insert into CLIENTES (id, nome, cpf, id_usuario) values (10, 'Bianca Silva', '04137253080', '101');
insert into CLIENTES (id, nome, cpf, id_usuario) values (20, 'Roberto Gomes', '09930381074', '102');