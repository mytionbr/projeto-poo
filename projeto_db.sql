drop database if exists vendas;
create database if not exists vendas;
use vendas;
create table if not exists clientes(
	codcli int not null auto_increment,
	nome varchar(40),
	endereco varchar(45),
	bairro varchar(20),
	cidade varchar(20),
	cep varchar(9),
	uf char(2),
	email varchar(30),
	fone varchar(10),
	celular varchar(10),
	primary key(codcli)
);

create table if not exists produtos(
	codprod int not null auto_increment,
    descricao varchar(30),
    preco numeric(10,2),
    unidade char(2),
    qtde_inicial numeric(10,2),
    data_cad datetime,
    qtde_atual numeric(10,2),
	primary key(codprod)
);

create table if not exists pedidos(
	codped int not null auto_increment,
    codCliente int,
    data datetime,
    primary key(codped),
    foreign key(codCliente) references Clientes(codcli)
);

create table if not exists itens_ped(
	codped int,
	codprod int,
    qtd int,
    foreign key(codped) references pedidos(codped),
    foreign key(codprod) references produtos(codprod)
);

create table if not exists funcionarios(
	id int not null auto_increment,
    usuario varchar(40),
    senha varchar(40),
    nome varchar(50),
    cpf varchar(11),
    primary key(id) 
);

insert into funcionarios(usuario,senha,nome,cpf) values ('usuario1','12345','Gendo Ikari','12345678901');

insert into clientes(nome,endereco,bairro,cidade,cep,uf,email,fone,celular) values ('Shinji Ikari','Quadra CCSW 1 Lote 1 Bloco 2','Jardim Guanhembu','Neon Tokyo','70680-156','UF','eva01@gmail.com','4150-2719','94150-2719');
insert into clientes(nome,endereco,bairro,cidade,cep,uf,email,fone,celular) values ('Asuka Langley ','Quadra CCSW 1 Lote 1 Bloco 2','Jardim Guanhembu','Neon Tokyo','70680-156','UF','eva02@gmail.com','4250-2719','94250-2719');

insert into produtos(descricao,preco,unidade,qtde_inicial,data_cad,qtde_atual) values('Leite','5','L','30','2000-11-01','20');
insert into produtos(descricao,preco,unidade,qtde_inicial,data_cad,qtde_atual) values('Refrigerante - Coca Cola','12','L','40','2000-11-01','20');

insert into pedidos(codCliente,data) values(1,'2000-03-01');

insert into itens_ped(codped,codprod,qtd) values(1,1,20);








