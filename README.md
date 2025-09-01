# Desafio de POO: Banco Digital

Este projeto é um desafio prático com o objetivo de reforçar o conhecimento em **Programação Orientada a Objetos (POO)** em Java. O cenário proposto é a modelagem de um banco digital, onde os pilares da POO são aplicados para criar uma solução coesa e escalável.

## Funcionalidades

O projeto simula um sistema bancário básico com os seguintes componentes e funcionalidades, demonstrando os principais conceitos de POO:

  - **Classes e Herança:** O sistema é estruturado em classes como `Cliente` e `Conta`. As contas são divididas em `ContaCorrente` e `ContaPoupanca`, que **herdam** as funcionalidades e atributos da classe base `Conta`.
  - **Métodos de Operação:** As classes de conta possuem métodos essenciais como `depositar()`, `sacar()` e `transferir()`.
  - **Encapsulamento:** Os dados sensíveis das contas (como o saldo) são protegidos e acessíveis apenas por meio de métodos públicos, garantindo a integridade da informação.
  - **Polimorfismo:** A classe principal (`Main`) demonstra a capacidade de tratar diferentes tipos de conta (`ContaCorrente` e `ContaPoupanca`) de forma genérica, através de uma referência à classe `Conta`.

## Pilares da POO Aplicados

  - **Abstração:** Entidades do mundo real, como `Cliente` e `Conta`, foram modeladas como classes no código, focando apenas em seus atributos e comportamentos essenciais.
  - **Encapsulamento:** Atributos como o `saldo` são privados, e as modificações são feitas exclusivamente por meio de métodos públicos como `depositar()` e `sacar()`.
  - **Herança:** As classes `ContaCorrente` e `ContaPoupanca` herdam a estrutura e o comportamento da classe `Conta`, evitando a duplicação de código.
  - **Polimorfismo:** É possível referenciar um objeto `ContaCorrente` ou `ContaPoupanca` como um objeto `Conta` e chamar seus métodos, permitindo um código mais flexível e reutilizável.

## Pré-requisitos

Para executar este projeto, você precisa ter o ambiente de desenvolvimento Java (JDK) instalado em sua máquina.

## Como Executar

1.  **Clone o repositório:**
    ```bash
    git clone https://github.com/dinarteefilho/banco-digital-poo-dio
    ```
2.  **Abra o projeto:**
    Abra o projeto na sua IDE favorita (como Visual Studio Code, IntelliJ ou Eclipse).
3.  **Execute a classe `Main`:**
    Rode o método `main()` da classe `Main.Java` para ver a demonstração das funcionalidades do banco digital.
