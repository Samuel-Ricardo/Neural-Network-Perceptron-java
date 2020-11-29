# __*IA-Perceptron-java*__


[![Badge](https://img.shields.io/static/v1?label=Samuel&message=Ricardo&color=green&style=for-the-badge&logo=GITHUB)](https://github.com/Samuel-Ricardo)
[![Badge](https://img.shields.io/static/v1?label=License&message=MIT&color=green&style=for-the-badge&logo=GITHUB)](https://github.com/git/git-scm.com/blob/master/MIT-LICENSE.txt)

[![Badge](https://img.shields.io/static/v1?label=Made%20Whit&message=Java&color=red&style=for-the-badge&logo=JAVA)](https://www.java.com/pt-BR/about/whatis_java.jsp)
[![Badge](https://img.shields.io/static/v1?label=Made%20Whit&message=NetBeans&color=red&style=for-the-badge&logo=JAVA)](https://netbeans.apache.org/)
[![Badge](https://img.shields.io/static/v1?label=JDK&message=8&color=red&style=for-the-badge&logo=JAVA)](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html)

[![Badge](https://img.shields.io/static/v1?label=Artificial&message=Intelligence&color=green&style=for-the-badge&logo=GITHUB)](https://github.com/search?q=Artificial+Intelligence)
[![Badge](https://img.shields.io/static/v1?label=Neural&message=Network&color=green&style=for-the-badge&logo=GITHUB)](https://github.com/search?q=Neural+Network)
[![Badge](https://img.shields.io/static/v1?label=Perceptron&message=Project&color=green&style=for-the-badge&logo=GITHUB)](https://github.com/search?q=Perceptron)

[![Badge](https://img.shields.io/static/v1?label=Version&message=1.0.2&color=green&style=for-the-badge&logo=GITHUB)](https://github.com/Samuel-Ricardo/IA-Perceptron-java)
[![Badge](https://img.shields.io/static/v1?label=State&message=Finalized&color=green&style=for-the-badge&logo=GITHUB)](https://github.com/Samuel-Ricardo/IA-Perceptron-java)

/* As Tags São clicáveis ;) */
 
## __*Versão Atual (Finalizado):*__
- __*Notas da Versão 1.0.2*__
  
# __*Informações Gerais:*__
- __*Autor:*__ [Samuel Ricardo Cabral de Barros](https://github.com/Samuel-Ricardo)

- __*Estado:*__ Finalizado

- __*Versão Atual:*__ 1.0.2

## __*O que foi Usado*__
- __*[Java](https://www.java.com/pt-BR/about/whatis_java.jsp)*__,
- __*[NetBeans](https://netbeans.apache.org/)*__
 
## __*O que é necessário para rodar:*__
- __*[JDK](https://www.oracle.com/java/technologies/javase-downloads.html)*__,
- __*alguma IDE*__,
	- __*Recomendado:*__ [Eclipse](https://www.eclipse.org/) ou [NetBeans](https://netbeans.apache.org/download/index.html)

## __*Fontes:*__ 

- __*Vídeo*__ -
[Redes Neurais Artificiais, Perceptron Simples (Parte 1): Problema, Arquitetura e Componentes](https://youtu.be/PMfarAZdNSA) 
	- __*do Canal:*__ [Serafim Nascimento](https://www.youtube.com/channel/UC4nbGdTDlcNrbZGVt732lmQ)
    
> [![Redes Neurais Artificiais, Perceptron Simples,Parte 1: Problema, Arquitetura e Componentes](http://img.youtube.com/vi/PMfarAZdNSA/0.jpg)](http://www.youtube.com/watch?v=PMfarAZdNSA "Redes Neurais Artificiais, Perceptron Simples, Parte 1: Problema, Arquitetura e Componentes")

Nesse Projeto é realizada a **criação de uma IA (Inteligência Artificial) [Perceptron](https://en.wikipedia.org/wiki/Perceptron)** utilizando a linguagem Java, sua função é **descobrir se os dados enviados para ele representa um ser vivo ou não.**

É o meu **primeiro projeto**, foi feito inicialmente em algoritmos com [VisualG](https://visualg3.com.br/) posteriormente passado para Java, sendo assim meu primeiro projeto Java após finalizar os estudos em algoritmos, é também **o projeto que deu início ao meu github.**

Este projeto não usa nenhuma **interface gráfica**, a interação ocorre a partir do **terminal** da IDE, utilizando o comando 
```java
System.out.print(“”);
``` 
e a 
```java
java.util.Scanner
``` 
para obter os dados de input (Entrada de dados).
 
Os procedimentos são baseados em lógica, ou seja, ele **não depende da linguagem de programação**, a mesma lógica pode ser aplicada a **qualquer** outra linguagem, incluindo algoritmos como o VisualG.
 

## Conversão de dados
 
As **[redes neurais](https://pt.wikipedia.org/wiki/Rede_neural_artificial#:~:text=Em%20ci%C3%AAncia%20da%20computa%C3%A7%C3%A3o%20e,como%20o%20reconhecimento%20de%20padr%C3%B5es.) entendem apenas [bits](https://pt.wikipedia.org/wiki/Bit#:~:text=O%20bit%20(simplifica%C3%A7%C3%A3o%20para%20d%C3%ADgito,ou%20passagem%20de%20energia%2C%20respectivamente. )**, por isso, de alguma forma, deve ser feita uma conversão dos dados para bits fazendo com que a rede neural seja capaz de compreender e processar os dados, um exemplo simples seria utilizar  1 (Verdadeiro) ou 0 (falso) para indicar se um funcionário está empregado ou desempregado.
 
No caso desta atividade os dados são letras (nomes de seres vivos e de objetos) porém, como visto, redes neurais não entendem letras, então foi necessário realizar a conversão das palavras para bits. 

Possuímos 8 valores (palavras), então foi preciso descobrir com quantos bits se consegue representar até 8 valores (palavras), sabendo que:

 1 bit  consegue representar a 2 valores (0 / 1) 

 temos 2 (número de valores possíveis para 1 bit) ^ N (quantidade de bits)
 
 logo:

 - 1 bit -> 2^1 = 2 valores  

   - 0 e 1
 
 
 - 2 bits -> 2^2 = 4 valores 
 
   - 00, 01, 10, 11
 
 
 - 3 bits -> 2^3 = 8 valores 

   - 000, 001, 010, 011, 100, 101, 110, 111
