# 🚗 Sistema de Controle de Carro em Java

Este é um projeto simples desenvolvido em Java utilizando os princípios de Programação Orientada a Objetos (POO), com foco em encapsulamento. Ele simula o funcionamento de um carro com diversas funcionalidades controladas por um menu interativo no terminal.

## 📚 Funcionalidades

- Ligar e desligar o carro
- Acelerar e diminuir velocidade
- Virar para esquerda ou direita (com restrição de velocidade)
- Trocar marcha (de forma sequencial e com regras)
- Exibir a velocidade atual

## ⚙️ Regras de funcionamento

- O carro começa desligado, em ponto morto (marcha 0) e com velocidade 0 km/h.
- Só é possível **acelerar, reduzir, virar ou trocar marchas se o carro estiver ligado**.
- A aceleração aumenta a velocidade em **5 km/h por vez**, com limite de **120 km/h**.
- A desaceleração reduz 5 km/h, sem passar de 0.
- O carro possui **6 marchas** e **não é permitido pular marchas**.
- A **velocidade deve estar compatível com a marcha** atual:
  
  | Marcha | Velocidade Permitida (km/h) |
  |--------|------------------------------|
  |   0    | 0 (ponto morto)              |
  |   1    | 0 a 20                       |
  |   2    | 21 a 40                      |
  |   3    | 41 a 60                      |
  |   4    | 61 a 80                      |
  |   5    | 81 a 100                     |
  |   6    | 101 a 120                    |

- O carro **só pode ser desligado se estiver em ponto morto (marcha 0) e com velocidade 0 km/h**.
- Só é possível **virar o carro** se ele estiver entre **1 km/h e 40 km/h**.

## 💡 Tecnologias usadas

- Java 21+
- Programação Orientada a Objetos (POO)

## 🗂️Estrutura do projeto

Carro
 - ControleCarro.java        | Classe principal com toda a lógica do carro
 - Main.java                 | Menu interativo para testar o sistema
 - README.md                 | Este arquivo

## 🧠 Aprendizados

- Criação de classes com atributos privados e métodos públicos (encapsulamento)
- Manipulação de entrada de dados com Scanner
- Lógica condicional baseada em regras reais de direção
- Controle de fluxo com menu interativo

## 🚀 Autor
Desenvolvido por Gabriely Venturoso 👩‍💻
