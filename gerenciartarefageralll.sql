CREATE DATABASE GerenciamentoTarefas;

USE GerenciamentoTarefas;

CREATE TABLE Tarefas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(255) NOT NULL,
    descricao TEXT,
    status ENUM('Pendente', 'Concluída') DEFAULT 'Pendente',
    data_criacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);