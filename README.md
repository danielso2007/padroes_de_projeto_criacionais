<p align="center">
  <h3 align="center">Padrões de projeto criacionais</h3>

  <p align="center">
    Os padrões criacionais fornecem vários mecanismos de criação de objetos, que aumentam a flexibilidade e reutilização de código já existente.
  </p>
</p>


<!-- TABLE OF CONTENTS -->
<details open="open">
  <summary>Índice</summary>
  <ol>
    <li>
      <a href="#Factory-Method">Factory Method</a>
    </li>
    <li>
      <a href="#Abstract-Factory">Abstract Factory</a>
    </li>
    <li>
      <a href="#Singleton">Singleton</a>
    </li>
    <li>
      <a href="#Builder">Builder</a>
    </li>
    <li>
      <a href="#Prototype">Prototype</a>
    </li>
  </ol>
</details>

# Factory Method
Também conhecido como: `Método fábrica, Construtor virtual`

O Factory Method é um padrão criacional de projeto que fornece uma interface para criar objetos em uma superclasse, mas
permite que as subclasses alterem o tipo de objetos que serão criados.

## Objetivo do projeto

- Apresentar o problema geral
- Apresentar uma solução utilizando o factory
- Apresentar uma variação mais utilizada
- Refatorar a nossa implementação para um meio-termo
- Apresentar uma utilização bem comum na estrutura dos sistemas

## Problemas

- Como posso escrever um código onde as classes instanciadas possam variar dentro de uma mesma interface?
- Como deixar o meu código desacoplado das classes concretas?

## Solução

- Extrair a lógica de criação dos objetos para um factory method
- Invocar o factory method para receber uma instância qualquer que implemente uma determinada interface

## GOF

> Um padrão que define uma interface para criar um objeto, mas permite às classes decidirem qual classe instanciar.
O Factory Method permite a uma classe deferir a instanciação para a subclasse.

# Abstract Factory
Também conhecido como: `Fábrica abstrata`

O Abstract Factory é um padrão de projeto criacional que permite que você produza famílias de objetos relacionados sem
ter que especificar suas classes concretas.

## Objetivo do projeto

- Apresentar o problema geral
- Apresentar uma solução utilizando o abstract factory
- Apresentar como este padrão ajuda a manter o contexto da família
- Apresentar como a estrutura pode ser alterada de acordo com a modelagem de solução

## Problemas

- Como posso escrever um código onde as classes instanciadas possam variar dentro de uma mesma interface?
- Como garantir que um conjunto de objetos relacionados (ou dependentes) possam ser criados mantendo o contexto único?

## Solução

- Extrair a lógica de criação dos objetos para um abstract factory
- Criar uma implementação do abstract factory para cada contexto, garantindo que todos os objetos criados estejam
relacionados

## GOF

> Prover uma interface para criar famílias de objetos relacionados ou dependentes sem especificar suas classes concretas.

# Singleton
Também conhecido como: `Carta única`

O Singleton é um padrão de projeto criacional que permite a você garantir que uma classe tenha apenas uma instância,
enquanto provê um ponto de acesso global para essa instância.

## Objetivo do projeto

- Apresentar o problema geral
- Apresentar uma solução utilizando o singleton
- Discutir os problemas deste padrão e dar uma alternativa

## Problemas

- Como posso garantir que uma classe tenha apenas uma instância?
- Como fazer com que esta instância única possa ser acessível globalmente?

## Solução

- Essconder o construtor dessa classe
- Definir um ponto de criação estático
- Que retorne esta instância única

## GOF

> Garantir que uma classe só tenha uma única instância, e prover um ponto de acesso global a ela.

# Builder

O Builder é um padrão de projeto criacional que permite a você construir objetos complexos passo a passo. O padrão permite que você produza diferentes tipos e representações de um objeto usando o mesmo código de construção.

## Objetivo do projeto

- Apresentar o problema geral
- Apresentar a solução clássica do build
- Apresentar uma solução alternativa com fluent interface
- Refatorar a nossa implementação para uma abordagem funcional

## Problemas

- Como uma classe pode criar diferentes representações de um mesmo objeto complexo?

## Solução

- Delegar a criação do objeto para um builder ao invés de instanciar o objeto concreto diretamente
- Dividir a criação do objeto em partes...
- Encapsular a criação e montagem dessas partes em um builder separado

## GOF

> Seprar a construção de um objeto complexo de sua representação para que o mesmo processo de construção possa criar representações diferentes.

# Prototype

O Prototype é um padrão de projeto criacional que permite copiar objetos existentes sem fazer seu código ficar dependente de suas classes.

## Objetivo do projeto

- Apresentar o problema geral
- Apresentar uma solução utilizando o prototype
- Apresentar os cuidados que deve se ter com esta operação
- Apresentar uma implementação que integre o builder com o prototype para programação funcional

## Problemas

- Como posso criar um objeto novo aproveitando o estado previamente existente de outro objeto?

## Solução

- Definir um prototype que retorne a cópia de si mesmo

## GOF

> Especificar os tipos de objetos a serem criados usando uma instância com protótipo e criar novos objetos ao copiar este protótipo.
 