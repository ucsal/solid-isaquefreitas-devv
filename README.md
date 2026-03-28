# Sistema de Olimpíadas - Refatoração com SOLID

## Objetivo
Este projeto tem como objetivo refatorar um sistema legado aplicando os princípios SOLID, sem alterar a lógica de negócio original, sem remover funcionalidades existentes e sem adicionar frameworks externos.

## Organização do projeto
O projeto foi reorganizado em pacotes para melhorar a separação de responsabilidades:

- `app`: classe principal da aplicação
- `user`: entidades e validações relacionadas ao participante
- `prova`: entidades e regras relacionadas à prova, questões, respostas e tentativas

## Principais mudanças realizadas

### 1. Separação de responsabilidades
Foram criadas classes auxiliares para retirar validações e cálculos das entidades principais:
- `ValidadorEmail`
- `ValidadorAlternativa`
- `CalculadoraAcertos`

### 2. Melhoria no encapsulamento
A classe `Tentativa` deixou de expor diretamente a alteração da lista de respostas, passando a utilizar o método `adicionarResposta`.

### 3. Uso de abstração no cálculo
Foi criada a interface `CalculadoraResultado`, e a classe `CalculadoraAcertos` passou a implementar essa interface.

## Princípios SOLID aplicados

### SRP - Single Responsibility Principle
Cada classe passou a ter uma responsabilidade mais específica:
- `Participante`: representa os dados do participante
- `ValidadorEmail`: valida email
- `Questao`: representa os dados da questão
- `ValidadorAlternativa`: valida alternativas
- `CalculadoraAcertos`: calcula os acertos da tentativa

### OCP - Open/Closed Principle
A criação da interface `CalculadoraResultado` permite adicionar novas formas de cálculo sem alterar diretamente a estrutura principal da tentativa.

### DIP - Dependency Inversion Principle
A classe `Tentativa` passou a trabalhar com a abstração `CalculadoraResultado`, reduzindo o acoplamento com a implementação concreta.

## Ajustes adicionais
- Correção no uso da lista de respostas da `Tentativa`
- Remoção de cálculo duplicado no `App`
- Correção para não imprimir tabuleiro quando a questão não possui FEN

## Como executar
Executar a classe `App.java` e utilizar o menu interativo no terminal.