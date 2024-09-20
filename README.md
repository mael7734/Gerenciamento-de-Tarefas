# Projeto Final.POO
# Sistema de Gerenciamento de Projetos e Tarefas

## 1. Introdução e Estrutura do Projeto

Este é um sistema de gerenciamento de projetos e tarefas, onde os usuários podem cadastrar, listar, editar e excluir projetos e tarefas, além de gerar relatórios sobre o progresso dessas atividades. O sistema é estruturado em camadas, incluindo a interface gráfica (GUI), a camada de lógica de negócios e a camada de persistência (banco de dados).

### Interface Gráfica (Tela Principal)

A interface permitindo que o usuário navegue facilmente pelas funcionalidades do sistema. Ela é dividida em seções com listas de projetos e tarefas que podem ser gerenciadas de forma intuitiva.
<img src="https://user-uploads-thumbs.shutterstock.com/aws-cloudfront-user-asset-uploads-prod-us-east-1/uploads/54d6c006-f5b0-486f-9407-5d1fd0240176/p/82545dba2ae0d644c6ca8e7d595054d11d0f0e61/1726775597133/Captura%20de%20tela%202024-09-19%20165145/png/1726775598/1500x1500/fit/32f73a6e3f8b7370ae8a41422d409169d85da5b9/Captura%20de%20tela%202024-09-19%20165145.jpg" alt="Texto Alternativo">


#### Funcionalidades dos Botões:

- **Botão "Tarefas"**: Permite ao usuário gerenciar as tarefas cadastradas (criar, editar, excluir).
- **Botão "Projetos"**: Usado para o gerenciamento de projetos, com funcionalidades similares às tarefas.
- **Botão "Relatórios"**: Gera e exibe relatórios de progresso dos projetos e tarefas cadastradas.
- **Botão "Detalhes"**: Exibe informações detalhadas sobre um projeto ou tarefa selecionado.

## 2. Banco de Dados e Persistência de Dados

O sistema utiliza o padrão DAO (Data Access Object) para lidar com a persistência dos dados. A comunicação com o banco de dados é feita utilizando a API JPA (Java Persistence API), que abstrai a complexidade das operações de banco de dados.

### Classes DAO:

- **GenericDAO**: Classe genérica que contém métodos comuns para a manipulação das entidades, como `salvar`, `find`, `update`, `delete`, e `findAll`.
- **ProjetoDAO** e **TarefaDAO**: Classes especializadas que estendem a `GenericDAO`, trabalhando diretamente com as entidades `Projeto` e `Tarefa`, respectivamente.

## 3. Diagrama de Classes e Relacionamentos

O diagrama de classes desenvolvido para o sistema. Ele mostra as principais classes, seus atributos, métodos e os relacionamentos entre elas.
<img src="https://user-uploads-thumbs.shutterstock.com/aws-cloudfront-user-asset-uploads-prod-us-east-1/uploads/1cded01b-0c19-4c31-98ad-d22ec8e20c49/p/82545dba2ae0d644c6ca8e7d595054d11d0f0e61/1726775026731/Diagrama%20em%20branco%20(2)/jpeg/1726775029/1500x1500/fit/80828965a91f45f4b476b20e3fa065a5105771bd/Diagrama%20em%20branco%20(2).jpg" alt="Texto Alternativo">
### Classes Principais:

- **Projeto**: Representa um projeto com atributos como `id`, `nome`, `descricao` e `prazo`.
- **Tarefa**: Representa uma tarefa com atributos como `id`, `titulo`, `descricao`, `status` e `data`.
- **Relatórios**: A classe `RelatoriosService` é responsável por gerar relatórios de progresso para projetos e tarefas.

### Relações:

- **Agregação entre Projeto e Tarefa**: Um projeto pode ter várias tarefas associadas, mas as tarefas podem existir independentemente dos projetos.
- **Herança entre ProjetoDAO, TarefaDAO e GenericDAO**: As classes `ProjetoDAO` e `TarefaDAO` herdam da classe genérica `GenericDAO`, aplicando o conceito de herança.

## 4. Conceitos de Orientação a Objetos

O sistema implementa diversos conceitos de Orientação a Objetos, como herança, polimorfismo, sobrecarga e sobrescrita de métodos.

### Herança:

A classe `GenericDAO` fornece métodos comuns para a persistência de dados, como `salvar`, `update` e `delete`. As classes `ProjetoDAO` e `TarefaDAO` herdam esses métodos, permitindo que essas funcionalidades sejam reutilizadas.

### Polimorfismo:

O polimorfismo permite que as classes `ProjetoDAO` e `TarefaDAO` sejam tratadas como instâncias da classe genérica `GenericDAO`, tornando o código mais flexível. Isso facilita o tratamento de diferentes DAOs de maneira uniforme.

## 5. Detalhamento das Funcionalidades

### Serviços:

- **ProjetoService** e **TarefaService**: São responsáveis por gerenciar a lógica de negócios do sistema. Essas classes manipulam os dados e se comunicam com os DAOs para realizar operações de CRUD no banco de dados. Alguns métodos disponíveis incluem:
  - `salvarProjeto` e `salvarTarefa`: Para salvar novos projetos e tarefas.
  - `listarProjetos` e `listarTarefas`: Para listar todos os projetos e tarefas cadastrados.
  - `editarProjeto` e `editarTarefa`: Para atualizar projetos e tarefas.
  - `excluirProjeto` e `excluirTarefa`: Para remover projetos e tarefas do sistema.

### RelatoriosService:

A classe `RelatoriosService` é responsável por gerar relatórios sobre o progresso dos projetos e tarefas. Ela calcula a porcentagem de conclusão com base nas tarefas ou projetos marcados como concluídos. Os métodos incluem:
  - `calcularProgressoTarefas`: Calcula o progresso das tarefas.
  - `calcularProgressoProjetos`: Calcula o progresso dos projetos.
    
    <img src="https://user-uploads-thumbs.shutterstock.com/aws-cloudfront-user-asset-uploads-prod-us-east-1/uploads/9614e705-5944-4bb5-a431-0ae635eb9c7a/p/82545dba2ae0d644c6ca8e7d595054d11d0f0e61/1726855123695/Captura%20de%20tela%202024-09-20%20145831/png/1726855125/1500x1500/fit/38e5a8a9e4ad7c948fe139bd699daa94be5ce8d3/Captura%20de%20tela%202024-09-20%20145831.jpg" alt="Texto Alternativo">

### DetalhesService:

A classe `DetalhesService` é responsável por fornecer informações detalhadas sobre um projeto ou tarefa específico.

## Conclusão

O sistema utiliza o JPA (Java Persistence API) para lidar com a persistência dos dados no banco de dados. As classes `GenericDAO`, `ProjetoDAO` e `TarefaDAO` fazem a abstração das operações CRUD (Criar, Ler, Atualizar e Deletar) no banco de dados. 

Cada entidade (projeto ou tarefa) possui uma classe de modelo correspondente (`Projeto` e `Tarefa`) que define seus atributos e como eles devem ser armazenados no banco de dados.
