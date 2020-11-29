# __*RNA-Perceptron-java*__


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

Nesse Projeto é realizada a **criação de uma [Rede Neural](https://pt.wikipedia.org/wiki/Rede_neural_artificial#:~:text=Em%20ci%C3%AAncia%20da%20computa%C3%A7%C3%A3o%20e,como%20o%20reconhecimento%20de%20padr%C3%B5es.) [Perceptron](https://en.wikipedia.org/wiki/Perceptron)** utilizando a linguagem Java, sua função é **descobrir se os dados enviados para ele representa um ser vivo ou não.**

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
 
As **redes neurais entendem apenas [bits](https://pt.wikipedia.org/wiki/Bit#:~:text=O%20bit%20(simplifica%C3%A7%C3%A3o%20para%20d%C3%ADgito,ou%20passagem%20de%20energia%2C%20respectivamente. )**, por isso, de alguma forma, deve ser feita uma conversão dos dados para bits fazendo com que a rede neural seja capaz de compreender e processar os dados, um exemplo simples seria utilizar  1 (Verdadeiro) ou 0 (falso) para indicar se um funcionário está empregado ou desempregado.
 
No caso desta atividade os dados são **letras** (nomes de seres vivos e de objetos) porém, como visto, redes neurais não entendem letras, então foi necessário realizar a **conversão das palavras para bits.**

Possuímos **8 valores (palavras)**, então foi preciso descobrir com **quantos bits se consegue representar até 8 valores**, sabendo que:

 **1 bit**  consegue representar a **2 valores (0 / 1)**

 temos 2 (**número de valores possíveis para 1 bit**) ^ N (**quantidade de bits**)
 
 logo:

 - 1 bit **->** 2^1 = 2 valores  

   - 0 e 1
 
 
 - 2 bits **->** 2^2 = 4 valores 
 
   - 00, 01, 10, 11
 
 
 - 3 bits **->** 2^3 = 8 valores 

   - 000, 001, 010, 011, 100, 101, 110, 111
   
   
   
   ![Conversao de dados](https://github.com/Samuel-Ricardo/IA-Perceptron-java/blob/master/Readme/Conversao_de_dados.jpeg)
   
   
   
   
após chegar no resultado, resta escolher qual palavra (valor) cada bit vai representar, 

Nomes | Bits
------|-----
Peixe | 000
Colher | 001
sapo | 010
cachorro | 100
aquario | 011
pessoa | 110
agulha | 101
feijao | 111
 
 
- como é mostrado neste trecho do código.
 
 ```java
 
 System.out.println("----------------------------");  
        System.out.println("//Descubra se é Ser Vivo: //");
        System.out.println("----------------------------");
        System.out.println("+(1)-peixe                 +");
        System.out.println("+(2)-colher                +");
        System.out.println("+(3)-sapo                  +");  
        System.out.println("+(4)-cachorro              +");
        System.out.println("+(5)-aquario               +");
        System.out.println("+(6)-pessoa                +");
        System.out.println("+(7)-agulha                +");
        System.out.println("+(8)-feijao                +");
        System.out.println("----------------------------");
        
        option = tec.nextInt();

        switch (option) {  //converte nome escolhido para bits
              
        case 1:
           x[1] = 0;
           x[2] = 0;
           x[3] = 0;
         
        break;
        
        case 2:
           x[1] = 0;
           x[2] = 0;
           x[3] = 1;
           
        break;
        
        case 3:
           x[1] = 0;
           x[2] = 1;
           x[3] = 0;
           
        break;
        
        case 4:
           x[1] = 1;
           x[2] = 0;
           x[3] = 0;
           
        break;
        
        case 5:
           x[1] = 0;
           x[2] = 1;
           x[3] = 1;
           
        break;
        
        case 6:
           x[1] = 1;
           x[2] = 1;
           x[3] = 0;
           
        break;
        
        case 7:
           x[1] = 1;
           x[2] = 0;
           x[3] = 1;
          
        break;
        
        case 8:
           x[1] = 1;
           x[2] = 1;
           x[3] = 1;
           
        break;
    }
 ```
 
O mesmo vale para o resultado, como os resultados possíveis são apenas 2 ( **é um ser vivo ou nao**), podemos representar com:

- 1 bit -> 2^1 

  - 1 (verdadeiro) e 0 (falso)


## Arquitetura Perceptron Simples

![arquitetura de uma perceptron](https://github.com/Samuel-Ricardo/IA-Perceptron-java/blob/master/Readme/Arquitetura_Perceptron.jpeg)

Essa imagem é uma demonstração visual de como a RNA (Rede Neural) trabalha.

- **X** = Dados de entrada -> bit (1 / 0)
  - [tipo int, pois só são aceitos os valores 1 e 0]

- **W** = Pesos Sinápticos que serão usados nas operações matemáticas para obter o resultado
  -  [Tipo float, pois o peso pode ter qualquer valor]

- **Bias** = Um termo constante que não depende de qualquer valor de entrada. 
  - [tipo int, pois só são aceitos os valores 1 e 0]

- **Wb** = Peso do Bias
  - [Tipo float, pois o peso pode ter qualquer valor]

- **U** = Resultado da Função Combinadora / Somadora
  -  [Tipo float, pois o pode ter qualquer valor]
  
- **g(u)** = Função de Transferência (Função Degrau) que resume o resultado em 1 ou 0 

- **Y** = resultado final (1 ou 0)
  - [tipo int, pois só são aceitos os valores 1 e 0]
  
- **N** =   Taxa de Aprendizado, é uma constante e seu valor é aleatório, mas para este código foi escolhido o valor 1.

![Componentes do Perceptron](https://github.com/Samuel-Ricardo/IA-Perceptron-java/blob/master/Readme/Componemtes_Perceptron.jpeg)



## Dados de Entrada

Para os dados de entrada (**X**) será necessário um vetor com o tamanho **equivalente a quantidade de bits**, que nesse caso são **3 bits por palavra**, então precisamos de um vetor com **3 posições.**

```java
int[] x = new int [4];
```

![treinamento 01](https://github.com/Samuel-Ricardo/IA-Perceptron-java/blob/master/Readme/Treinamento_01.jpeg)

Modelo de Um neurônio

