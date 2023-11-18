# Adivinhe o Número - Guess the Number

## Índice

* [1. Considerações Gerais](#1-considerações-gerais)
* [2. Prefácio](#2-prefácio)
* [3. Resumo do Projeto](#3-resumo-do-projeto)
* [4. Objetivos de Aprendizagem](#4-objetivos-de-aprendizado)
* [5. Considerações Gerais](#5-considerações-gerais)
* [6. Considerações Técnicas](#6-considerações-técnicas)
* [7. Recomendações](#7-Recomendações)

---

## 1. Considerações Gerais

* Este projeto foi desenvolvido em 3 Sprints.

## 2. Prefácio

Atualmente, Java é uma das linguagens de programação mais utilizadas no mundo.
Apesar da diversidade de plataformas e ferramentas disponíveis, é fundamental
ter uma base sólida nos conceitos fundamentais de Java e na programação
orientada a objetos (OOP). O objetivo deste projeto é te introduzir ao mundo do
Java por meio de um jogo simples e divertido.


![GUESS THE NUMBER](assets/guess-the-number.png)

## 3. Resumo do Projeto

É um jogo interativo que se realiza no terminal usando Java, no qual a
jogadora e o computador se alternam para tentar adivinhar um
número aleatório entre 1 e 100. A jogadora e o computador se alternarão 
para adivinhar o número, levando em consideração a tentativa anterior é exibido
O nome do jogador, suposição feita, uma mensagem indicando se a suposição
foi "muito alta" , "muito baixa" ou "correta". Após cada turno, informações sobre a 
suposição feita serão exibidas. Tentativas limitadas em 5 por rodada o 
jogo terminará quando o número for adivinhado. É exibida uma mensagem de fim de jogo,
bem como uma listam de todas as tentativas feitas pela jogadora vencedora e a lista de
todas as tentativas.  A lógica do jogo será baseada em estruturas de controle,
incluindo loops, condicionais e coleções.
  
  
![GUESS THE NUMER DEMO](assets/guess-the-number-demo.gif)

## 4. Objetivos de Aprendizado

### Java & OOP

* [☕] **Tipos de dados: primitivos vs não primitivos**
  é um dado que não é representado através de um Objeto e, por consequência, não possui métodos.
  byte:
  short: Representa números inteiros de 16 bits. O intervalo é maior do que isso byte.
  int: Representa números inteiros de 32 bits. É
  long: Representa números
  float: Representa números de ponto flutuante de 32 bits. É usado para números reais.
  double: Representa números de ponto flutuante de 64 bits. É usado para números reais com alta precisão.
  char: Representa um único caractere Unicode. Exemplo: 'A', '1'.
  boolean: Representa valores verdadeiros ou falsos.
  
  Tipos de Referência:

String: Uma sequência de caracteres.
Arrays: Coleções de elementos do mesmo tipo, como int[], String[], etc.
Classes Personalizadas: Tipos de dados definidos pelo programador, como classes,
Interfaces: Especificações de métodos que uma
Enumerações (Enum): Tipos especiais usados ​​para representar um conjunto fixo de valores.

* [☕] **Strings (cadeias de caracteres)**
* [☕] **Arrays (matrizes)**
* [☕] **_Access Modifiers_: `private`**
* [☕] **_Access Modifiers_: `protected`**
* [☕] **_Access Modifiers_: `public`**

* #### Programação Orientada a Objetos (OOP)

  - [☕] **Classes**
  - [☕] **Objetos**
  - [☕] **Métodos**
  - [☕] **Atributos**
  - [☕] **Construtores**
  - [☕] **Encapsulamento**
  - [☕] **Abstração**
  - [☕] **Composição**
  - [☕] **Interfaces**
  - [☕] **Herança: `super`**
  - [☕] **Herança: `extends`**
  - [☕] **Herança: `override`**
  - [☕] **Linguagem Unificada de Modelagem (UML): Diagramas de classes**

* [☕] **Variáveis**
* [☕] **Condicionais**
* [☕] **Uso de loops/ciclos (loops)**

* #### Coleções

  - [☕] **Listas: ArrayList**

* #### Testes

  - [☕] **JUnit**
  - [☕] **Mockito**

## 5. Considerações Gerais 

* Deve ser implementado em Java. As únicas dependências externas que podem ser
  usadas são JUnit e Mockito para testes unitários.
* O jogo será realizado no terminal. Os testes podem ser executados no
  terminal ou em seu IDE (recomendamos usar
  [IntelliJ Community Edition](https://www.jetbrains.com/idea/download/))


### Diagrama de Classes

![Diagrama de Classes](https://camo.githubusercontent.com/c18b541fa2d8452bfff226b4825dc0b08a34903a7ad212685052f3bd6e4d9049/68747470733a2f2f6d65726d6169642e696e6b2f696d672f70616b6f3a654e7039556b3150777a414d5f5374573247486431772d6f706b6b4970484a436948476a484c7a57744b564e4f6a6b4a306a5332333037537246736e4453354e3432635f2d7a316e4c3749324a78474c724547744879737347475771414c6f374a4a61306669767032636f4e63594b53594f395267446c3834546375724b6d6178537571764a58413354487138556f5a4d4d67466d56423942724b537372706a4872383075434f47625864454939693062554f6f517559554a465a7176445a6371654c39417879586a68794c52775f2d63324f367958774f6764516e6e4f6958507937365a435771323942444b37665745465f5135524933326a426d5a725561384156547772333349597748796e55506b6274375a7477646e66776a46483543306863394e51586830635437303865395236352d4845466747385354774f4367432d335a6744445051466d5f6e656d675539396f554845742d4c7a53507a62364436575943556e73317053374a395452704d4b55354b77517366764e6b657455704d726e6f54587465716379455275324e424e326d364f6830347354385363326d67365f33536a626f773f747970653d706e67)

#### `GuessTheNumberGame`

**Propósito:**
Lida com a lógica principal, decide qual jogador assume o próximo turno.

**Atributos estáticos (`static`):**

* `random`: Gerador de números aleatórios.
* `targetNumber`: Número aleatório entre 1 e 100 a ser adivinhado na partida
  atual.

**Métodos estáticos (`static`):**

* `main(String[] args)`: Inicia o jogo e gera o número aleatório.
* `checkGuess(Player player)`: Executa um turno, obtém a suposição e avalia
  o novo estado da partida.

#### `Player`

**Propósito:**
Representa uma jogadora genérica. É uma classe abstrata. Define os
atributos e métodos que todas as _classes_ de jogadoras devem compartilhar:

**Atributos:**

* `name`: O nome da jogadora.
* `guesses`: O histórico de suposições da jogadora.

**Métodos:**

* `makeGuess()`: Retorna a suposição da jogadora. É um método abstrato.
* `getName()`: Retorna o nome da jogadora.
* `getGuesses()`: Retorna o histórico de suposições da jogadora.

#### `HumanPlayer` e `ComputerPlayer` (herdam de `Player`)

**Propósito:**
Representa as jogadoras _Humana_ e _Computadora_, respectivamente.

**Métodos:**

* `makeGuess()`: Método que cada classe que herda de `Player` deve implementar.

**Relações:**

* A classe `GuessTheNumberGame` interage com as classes `HumanPlayer` e
  `ComputerPlayer` para gerenciar o jogo.
* Tanto a classe `HumanPlayer` quanto `Computer Player` são subclasses de
  `Player`, o que implica que herdam todas as suas propriedades e métodos, mas
  também têm algumas características adicionais próprias.

Este design de classes permite separar as responsabilidades, facilitando
a manutenção e possíveis extensões do jogo no futuro.

Por exemplo, poderíamos adicionar diferentes jogadoras "máquina" com diferentes
estratégias para a suposição automática, um novo tipo de jogadora "remota" ou
até mesmo diferentes níveis de dificuldade.

### 7.1 Marco 1 - Configurações do ambiente de trabalho

Você deve configurar o seu ambiente de trabalho, ou seja: 
* Baixar a versão escolhida do Java e instalá-la em seu computador. Hoje, em out e nov/2023, recomendamos a versão 17 pois é versão mais compatível com a IDE IntelliJ.
* Instalar a sua IDE (recomendamos usar
  [IntelliJ Community Edition](https://www.jetbrains.com/idea/download/), em casos extremos de recurso computacional pode ser utilizado o VSCode)

#### Conteúdos que podem te apoiar na configuração do ambiente
 * [Tutoriais para preparação de ambiente Java](https://narasakamoto.github.io/prep-ambiente-java/)
 * [Como eu instalo o Java?](https://www.java.com/pt-BR/download/help/download_options_pt-br.html)
 * [Install IntelliJ IDEA](https://www.jetbrains.com/help/idea/installation-guide.html)
 * [Step by Step guide to install Intellij Idea
on Mac](https://www.geeksforgeeks.org/step-by-step-guide-to-install-intellij-idea)


### 7.2 Marco 2 - Primeiros passos com a linguagem

Crie a primeira classe do projeto que contenha o método main. 
Você pode adicionar um comando que exiba "Olá mundo!" no console. Assim vc poderá checar se as suas configurações estão corretas. 
Além disso, você pode estudar conceitos da linguagem como: 
* O que são classes e como construí-las?
  Em programação orientada a objetos, uma classe é uma estrutura que define um tipo de objeto. Ela é um modelo ou um plano para criar objetos. Em outras palavras, uma classe é um conjunto de atributos (dados) e métodos (funções) que descrevem o comportamento de um tipo de objeto.

Aqui estão alguns conceitos-chave relacionados a classes:

Atributos (ou Propriedades):

Atributos representam dados que um objeto pode armazenar. Eles são muitas vezes chamados de variáveis de instância. 
Métodos (ou Funções):

Métodos representam comportamentos associados a uma classe. Eles são funções que podem ser chamadas para executar ações específicas. Por exemplo, uma classe Carro pode ter métodos como ligar, desligar e acelerar.
Objetos:

Um objeto é uma instância de uma classe. É uma entidade real que possui características específicas definidas pela classe.  
Para criar objetos desta classe deve-se instanciar a classe 
um objeto da classe pode ser acessado os atributos e chamar os métodos deste objeto 

  GuessTheNumberGame: A classe principal que contém a lógica do jogo.
Random random: Uma instância da classe Random é usada para gerar números aleatórios.
int targetNumber: O número que o jogador precisa adivinhar.
tentativas, maximoTentativas: Contadores para controlar o número de tentativas e o número máximo de tentativas permitidas.
Scanner scanner: Usado para obter entradas do usuário.

* O que são métodos e como utilizá-los?
 Métodos em programação são blocos de código que realizam uma tarefa específica ou executam uma ação em um programa. Eles são uma parte fundamental da programação orientada a objetos e são associados a classes, sendo muitas vezes chamados de funções em outros contextos de programação.

Aqui estão alguns conceitos-chave sobre métodos:

Declaração de Método:

Um método é declarado dentro de uma classe e contém um bloco de código que define as operações que o método realiza.
Parâmetros:

Um método pode aceitar parâmetros, que são valores que você passa para o método para que ele possa realizar suas operações de acordo com esses valores.
Retorno:

Um método pode ter um tipo de retorno, indicando o tipo de dado que ele retorna após a execução. Se um método não retorna nenhum valor, seu tipo de retorno é geralmente especificado como void.
Chamada de Método:

Para usar um método, você chama o método pelo nome, seguido pelos parênteses, e fornece os argumentos necessários (se houver). A chamada de método executa o código contido no método.


  Método Construtor:

GuessTheNumberGame(Random random): O construtor da classe, onde o número alvo é inicializado como um número aleatório entre 1 e 100.
Método Principal (main):

Cria uma instância do jogo (GuessTheNumberGame), exibe uma mensagem de boas-vindas e instruções.
O número alvo é impresso no console (isso geralmente não é feito em um jogo real, é apenas para fins de depuração).
Loop do Jogo:

Solicita ao jogador se deseja iniciar o jogo.
Se o jogador concorda, o jogo começa.
Os jogadores (humano e computador) fazem suas suposições em turnos.
A cada rodada, o programa verifica se a suposição é muito alta, muito baixa ou correta.
O loop continua até que o jogador adivinhe corretamente ou atinja o número máximo de tentativas.
Se o número máximo de tentativas for atingido, o jogo termina e uma mensagem de "GAMEOVER" é exibida.
Método chekGuess:

Verifica se a suposição do jogador está correta, muito alta ou muito baixa.
Retorna false se o jogador adivinhar corretamente, indicando que o jogo deve terminar.
Jogadores:

HumanPlayer e ComputerPlayer são mencionados, mas não estão completamente definidos no código fornecido. No entanto, eles parecem ser classes que estendem uma classe genérica chamada Player, que provavelmente tem métodos para fazer suposições.
O código usa códigos ANSI para formatar a saída no console, adicionando cores e emojis para melhorar a experiência visual.

* Quais o tipos de dados existentes na linguagem? (Lembre-se dos que você mais utilizou em JavaScript e tente buscar por tipos similares)
  Na linguagem de programação Java, os tipos de dados podem ser divididos em dois grupos principais: tipos primitivos e tipos de referência. Vou listar alguns dos tipos de dados mais comuns em Java, e você poderá observar as semelhanças com tipos de dados em JavaScript:

Tipos Primitivos:
Inteiros:

int: Armazena números inteiros, por exemplo, 10 ou -5.
Ponto Flutuante:

double: Armazena números de ponto flutuante, por exemplo, 3.14 ou -0.5.
float: Semelhante ao double, mas usa menos espaço em memória.
Caracteres:

char: Armazena um único caractere Unicode, por exemplo, 'a' ou '1'.
Booleano:

boolean: Armazena valores true ou false.
Tipos Numéricos:

byte: Armazena valores inteiros de 8 bits.
short: Armazena valores inteiros de 16 bits.
long: Armazena valores inteiros de 64 bits.
Tipos de Referência:
Strings:

String: Armazena sequências de caracteres.
Arrays:

int[], double[], String[], etc.: Estruturas para armazenar coleções de elementos.
Classes e Objetos:

Definidos pelo programador. Por exemplo, se você criar uma classe Carro, pode criar objetos dessa classe.
Enumerações:

enum: Define um conjunto fixo de constantes.
Tipos Especiais:

null: Indica a ausência de valor.
* Como criar um array usando Java?
* O que são modificadores de acesso como: `public`, `private`, `protected`? Os modificadores de acesso em Java são palavras-chave que determinam a visibilidade e a acessibilidade de classes, métodos, variáveis e outros membros de uma classe. Esses modificadores são fundamentais para a encapsulação e segurança de código em programação orientada a objetos. 3 principais modificadores de acesso em Java:

Public (public):

Um membro declarado como public é acessível de qualquer lugar, ou seja, de qualquer classe. Ele não impõe restrições de acesso. 

Private (private):

Um membro declarado como private é acessível apenas dentro da própria classe. Ele fornece o mais alto nível de encapsulamento e é frequentemente usado para proteger a integridade dos dados da classe.

Protected (protected):

Um membro declarado como protected é acessível dentro da própria classe, em subclasses (herdeiras) e no mesmo pacote. Este modificador é uma extensão do private, permitindo acesso adicional para subclasses.

Visibilidade Comparativa:
public:

Acesso de qualquer lugar (dentro ou fora da classe, em qualquer pacote).
private:

Acesso apenas dentro da própria classe.
protected:

Acesso dentro da própria classe, em subclasses e no mesmo pacote.
Nenhum Modificador (Padrão):

Acesso apenas dentro do mesmo pacote.
O uso adequado desses modificadores de acesso é essencial para criar código seguro, modular e de fácil manutenção. A encapsulação, promovida pelos modificadores de acesso, ajuda a esconder a implementação interna de uma classe, expondo apenas a interface necessária para outros componentes do programa.


* O que são métodos construtores? Como fazê-lo?
  Em Java, um método construtor é um tipo especial de método usado para inicializar objetos de uma classe. Um construtor é chamado automaticamente quando um objeto é criado. Ele geralmente é usado para definir valores iniciais para os atributos da classe ou realizar outras tarefas de inicialização necessárias.

Aqui estão algumas características dos métodos construtores:

Nome do Método:

O nome do método construtor deve ser o mesmo que o nome da classe.
Sem Tipo de Retorno:

Ao contrário de outros métodos, o método construtor não possui um tipo de retorno, nem mesmo void.
Pode Aceitar Parâmetros:

Um construtor pode aceitar parâmetros para inicializar os atributos do objeto durante a criação.
Múltiplos Construtores:

Uma classe pode ter vários construtores, desde que tenham assinaturas diferentes (número ou tipo de parâmetros diferentes).
* O que é encapsulamento? Como fazê-lo?

  Encapsulamento é um dos princípios fundamentais da programação orientada a objetos e refere-se à ideia de esconder os detalhes internos de implementação de uma classe e expor apenas uma interface bem definida para os usuários da classe. Isso ajuda a proteger os dados e o comportamento da classe, proporcionando maior segurança e controle sobre o código.

Principais conceitos do encapsulamento:

Atributos Privados:

Declare os atributos da classe como private para restringir o acesso direto a eles. Isso impede que os dados sejam modificados de forma não autorizada.
Métodos de Acesso (Getters e Setters):

Forneça métodos públicos (conhecidos como getters e setters) para permitir que outras classes acessem ou modifiquem os atributos encapsulados de forma controlada.

Benefícios do Encapsulamento:
Segurança:

Evita que dados sejam alterados diretamente de maneira inadequada.
Manutenção Facilitada:

Permite alterar a implementação interna da classe sem afetar o código cliente que usa a classe.
Flexibilidade:

Facilita a evolução do código, adicionando ou modificando funcionalidades internas sem impactar o código externo.
Para resumir, encapsulamento é uma prática essencial para criar código modular, seguro e de fácil manutenção em programação orientada a objetos.

* O que é herança? Como criar no Java?  Herança é um dos conceitos fundamentais da programação orientada a objetos, e ela permite que uma classe herde características (atributos e métodos) de outra classe. A classe que é estendida é chamada de classe base ou superclasse, e a classe que herda é chamada de classe derivada ou subclasse.

Vantagens da Herança:

Reutilização de Código: A subclasse pode reutilizar os membros da superclasse, evitando duplicação de código.
Polimorfismo: Permite que objetos de uma subclasse sejam usados onde objetos da superclasse são esperados. Payer superclasse implementada usando a palavra-chave extends na subclasse PlayerHuman e ComputerPlayer
* tem um atributo nome e um método  
Ao criar uma instância de GuessTheNumberGame,  acessar tanto os métodos da superclasse (Player) quanto os métodos específicos da subclasses. Isso exemplifica a ideia de polimorfismo, onde um objeto da subclasse pode ser usado como um objeto da superclasse.

#### Conteúdos que podem te apoiar nos primeiros passos com Java
 * [Learn the Basics of Java Programming](https://www.freecodecamp.org/news/learn-the-basics-of-java-programming/)
 * [Programação Orientada a Objetos com Java - Kamila Code](https://www.youtube.com/watch?v=zHPx0vyFMOI&list=PL_pqVN-1MnwNhaNktj8ukfX9yfjWFf7S-)
 * [Java Basic Syntax](https://www.geeksforgeeks.org/java-basic-syntax/)
 * [Java Data Types And Variables – Explained for Beginners](https://www.freecodecamp.org/news/java-data-types-and-variables/)
 * [Learn Java](https://my-learning.w3schools.com/tutorial/java)
 * [Java Classes and Objects](https://www.w3schools.com/java/java_classes.asp)
 * [Java Methods](https://www.w3schools.com/java/java_methods.asp)


### 7.3 Marco 3 - Compreendendo o Diagrama de Classes

Deixamos um [Diagrama de Classes](#diagrama-de-classes) para que você possa se basear para construir o seu projeto. Mas é preciso compreender o que ele significa antes mesmo de começar a desenvolver o que será o seu projeto. Neste marco você pode compreender o que esse diagrama está representando. 

#### Conteúdos que podem te apoiar na compreensão do Diagrama de Classes
* [O que é um diagrama de classe UML?](https://www.lucidchart.com/pages/pt/o-que-e-diagrama-de-classe-uml)
* [O que são os Diagramas de Classe](https://www.devmedia.com.br/orientacoes-basicas-na-elaboracao-de-um-diagrama-de-classes/37224)
 

#### Conteúdos que podem te apoiar para iniciar o jogo
* [Java: Como ler e apresentar dados com os comandos de entrada e saída](https://www.devmedia.com.br/java-como-ler-e-apresentar-dados-com-os-comandos-de-entrada-e-saida/22266)
* [Java Scanner](https://www.baeldung.com/java-scanner)
* [Scanner class in Java](https://www.geeksforgeeks.org/scanner-class-in-java/)
* [Java User Input](https://www.w3schools.com/java/java_user_input.asp)
* [Random Number](https://www.baeldung.com/java-17-random-number-generators)
 

### 7.4  Marco 7 - Configurações para construção dos testes unitários para criação dos testes unitários

Configurar as bibliotecas JUnit5 e Mockito na sua IDE, para criar os testes unitários. 

#### Conteúdos que podem te apoiar para adicionar dependências de testes
* [Adicionar JUnit5 no IntelliJ](https://www.jetbrains.com/help/idea/junit.html#intellij)
* [Testing Java with VSCode](https://code.visualstudio.com/docs/java/java-testing)

Estrutura dos testes unitários: cobrir com testes a lógica do jogo baseando-se em comportamentos. 
* Simula que o palpite da jogadora é maior que o número alvo.
* Simula que o palpite da jogadora é menor que o número alvo.
* Simula que o palpite é o próprio número alvo. 

#### Conteúdos que podem te apoiar a criar testes unitários
* [Qualidade e JUnit: introduzindo automatização de testes unitários do seu software Java no dia-a-dia](https://mari-azevedo.medium.com/qualidade-e-junit-introduzindo-automatiza%C3%A7%C3%A3o-de-testes-unit%C3%A1rios-do-seu-software-java-no-dia-a-dia-849611de5574)
* [Mockito Tutorial](https://www.digitalocean.com/community/tutorials/mockito-tutorial)

### 7.8 Marco 8 (Hacker Edition) - Criação de uma "inteligência" para jogar contra o computador (implementações futuras)

Neste marco, que entendemos como Hacker Edition, você poderá criar uma lógica para que os palpites da segunda jogadora, quando estivermos jogando contra o computador, sejam palpites mais inteligentes. 
Esse palpites podem considerar a informação se o palpite é alto ou baixo em relação ao número alvo e assim o jogo pode se tornar mais emocionante. 

## 8. Recomendações

**Documentação do Java**:  

**Projete a Estrutura do Jogo**:
Planejamento: 
 como alternar os turnos entre a jogadora e a computadora, como gerar e avaliar
as suposições e como mostrar informações ao jogador. Pare um momento
para analisar e projetar sua solução antes de começar a implementá-la.

**Separação de Responsabilidades**: Recomendamos seguir o diagrama de
classes fornecido para obter uma clara separação da lógica do jogo em
componentes ou classes que permitam manter o código organizado e legível.

**Você Precisará de Loops e Condicionais**: Loops e declarações condicionais
serão seus aliados neste projeto para controlar os turnos, avaliar as
suposições e determinar o vencedor.

**Manipulação de Números Aleatórios**: Use a classe `Random` de `java.util` para
gerar o número aleatório secreto.  
 
aprendendo o paradigma de programação orientada a objetos no processo.

**_Que os jogos comecem! 🎲🎮_**
