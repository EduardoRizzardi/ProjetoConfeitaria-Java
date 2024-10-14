create database Confeitaria;
use Confeitaria;

create table Cliente(
	id_conta int PRIMARY KEY auto_increment ,
    nome varchar(100),
    email varchar(100),
    cpf varchar(100),
    telefone varchar(100),
    cidade varchar(100),
    bairro varchar(100),
    rua varchar(100),
    numero int,
    usuario varchar (50),
    senha varchar (50)
    );
    
select * from Cliente;


