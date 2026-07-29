
CREATE TABLE DadosPessoaisClientes (
    CPF VARCHAR (255) PRIMARY KEY,
    Nome VARCHAR (255),
    Data_nasc VARCHAR (255),
    Contato VARCHAR (255),
    Sexo char
);

CREATE TABLE Agendamento (
    id_agendamento Serial,
    fk_DadosPessoaisClientes_CPF VARCHAR (255),
    fk_DadosPessoaisDentistas_CPF VARCHAR(255),
	dia varchar(255),
	Horario varchar(255)
);

CREATE TABLE DadosPessoaisDentistas (
    CPF VARCHAR(255) PRIMARY KEY,
    Nome VARCHAR(255),
    Data_nasc VARCHAR(255),
    Contato VARCHAR(255),
    Sexo char
);

CREATE TABLE EnderecoDentistas (
    fk_DadosPessoaisDentistas_CPF VARCHAR(255),
    Estado VARCHAR (255),
    Cidade VARCHAR(255),
    Cep VARCHAR (255),
	Bairro VARCHAR (255),
    Rua VARCHAR(255),
    Numero INTEGER
);

CREATE TABLE EnderecoClientes(
    fk_DadosPessoaisClientes_CPF VARCHAR (255),
    Estado VARCHAR(255),
    Cidade VARCHAR(255),
    Cep VARCHAR(255),
	Bairro VARCHAR (255),
    Rua VARCHAR(255),
    Numero INTEGER
);

 
ALTER TABLE Agendamento ADD CONSTRAINT FK_Agendamento_1
    FOREIGN KEY (fk_DadosPessoaisClientes_CPF)
    REFERENCES DadosPessoaisClientes (CPF);
 
ALTER TABLE Agendamento ADD CONSTRAINT FK_Agendamento_2
    FOREIGN KEY (fk_DadosPessoaisDentistas_CPF)
    REFERENCES DadosPessoaisDentistas (CPF);
 

 
ALTER TABLE EnderecoDentistas ADD CONSTRAINT FK_EnderecoDentistas_1
    FOREIGN KEY (fk_DadosPessoaisDentistas_CPF)
    REFERENCES DadosPessoaisDentistas (CPF);
 

ALTER TABLE EnderecoClientes ADD CONSTRAINT FK_EnderecoClientes_1
    FOREIGN KEY (fk_DadosPessoaisClientes_CPF)
    REFERENCES DadosPessoaisClientes (CPF);

	CREATE OR REPLACE FUNCTION DelCli(CPF1 VARCHAR (255))  RETURNS void as $$ 
	DECLARE CPF_OLD VARCHAR(255);
	BEGIN 
	SELECT fk_DadosPessoaisClientes_CPF INTO CPF_OLD FROM ENDERECOCLIENTES WHERE fk_DadosPessoaisClientes_CPF = CPF1;
	IF CPF_OLD = CPF1 THEN
		DELETE FROM Agendamento WHERE fk_DadosPessoaisClientes_CPF = CPF1;
		DELETE FROM ENDERECOCLIENTES WHERE fk_DadosPessoaisClientes_CPF = CPF1;
		DELETE FROM DADOSPESSOAISCLIENTES WHERE CPF = CPF1;
	ELSE
		DELETE FROM Agendamento WHERE fk_DadosPessoaisClientes_CPF = CPF1;	
		DELETE FROM DADOSPESSOAISCLIENTES WHERE CPF = CPF1;
		
	END IF;
	END;
	$$ LANGUAGE PLPGSQL;
	
	CREATE OR REPLACE FUNCTION DelDent(CPF1 VARCHAR (255))  RETURNS void as $$ 
	DECLARE CPF_OLD VARCHAR(255);
	BEGIN 
	SELECT fk_DadosPessoaisDentistas_CPF INTO CPF_OLD FROM ENDERECODENTISTAS WHERE fk_DadosPessoaisDentistas_CPF = CPF1;
	IF CPF_OLD = CPF1 THEN
		DELETE FROM Agendamento WHERE fk_DadosPessoaisDentistas_CPF = CPF1;
		DELETE FROM ENDERECODENTISTAS WHERE fk_DadosPessoaisDentistas_CPF = CPF1;
		DELETE FROM DadosPessoaisDentistas WHERE CPF = CPF1;
	ELSE
		DELETE FROM Agendamento WHERE fk_DadosPessoaisDentistas_CPF = CPF1;
		DELETE FROM DadosPessoaisDentistas WHERE CPF = CPF1;
	END IF;
	END;
	$$ LANGUAGE PLPGSQL;
	


	Select * from EnderecoClientes;
	Select * from DadosPessoaisClientes;
	Select * from EnderecoDentistas;
	Select * from DadosPessoaisDentistas;
	Select * from Agendamento;
