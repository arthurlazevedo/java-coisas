# Java

## Geral

- Não esquecer que variáveis sempre tem que ser declaradas com o tipo/classe delas já definido
- Os tipos primitivos não possuem nenhum método que nem suas classes encapsuladores possuem
  - Tipos: boolean, byte, char, double, float, int, long, short, void
  - Classes: Boolean, Byte, Character, Double, Float, Integer, Long, Short, Void

## Sintaxes

- camelCase para variáveis, PascalCase para classes, SCREAMING_SNAKE_CASE para constantes
- Para printar algo: System.out.println (escrever sout no IntelliJ funciona)
- num2 = num1++: atribui o valor de num1 a num2 e depois incrementa (num2 == 4, num1 == 5)
- num2 = ++num1: incrementa e depois atribui o valor a num2 (num2 == 5, num1 == 5)

## Acesso

- public: acesso da classe/método/variável/constante é público, todos podem acessar ela.
- protected: acesso é parcialmente privado, apenas classes que herdam da classe (métodos, variáveis, constantes) 
ou arquivos na mesma pasta podem acessar (classe)
- private: acesso privado, confirmar se classes que herdam dela pode acessar
- static: indica que o método/variável/constante é da classe, não instância dela (pode ser chamado na classe)
- final: indica que a variável é uma constante (não pode reatribuir um valor, mas pode adicionar itens numa lista final eg.)

## Tipos/Classes

- char representa um caractere (a eg.) e é representado em java por '' (String é "") => pode ser qualquer caractere unicode
- byte (8 bits), short (16), int (32) e long (64) mudam apenas o tamanho possível, todos são números inteiros
- float e double são números decimais, diferente dos outros. Double é maior e mais preciso, float às vezes é arredondado

## String

- A partir do Java 15, é possível utilizar strings literais assim como é feito em python """ao apertar enter aqui vai ser 
um parágrafo"""
- Também a partir do Java 15, não é mais necessário
- A opção de format() agora pode ser usada depois de uma string => "%s aaa".formatted(10480), tem muito mais do que isso, 
qualquer coisa dá pra ver a spec na internet
- System.out.printf() => printa uma string formatada que nem acima
- Usar equals para comparar strings, "==" compara outra coisa que não é o que a gente quer (em Groovy, "==" é equals na real)

## Outras Classes

### Scanner

- A classe Scanner é basicamente o input do python, mas no caso você usa métodos dela para dizer qual valor você espera, 
nextLine, nextInt, nextDouble etc.
- O Scanner considera Locale, então inserir o double com 7.1 por exemplo pode dar erro (já que ele estaria esperando 7,1)
- Para esse caso dele funcionar como um input tem que começar com Scanner scanner = new Scanner(System.in)

### Referência x Valor

- Quando você passa uma classe mais robusta (List, Map, ou uma que você próprio definiu) para uma função, o que você
fizer com o parâmetro, vai ser passado pra classe referência, o que não acontece com um tipo primário 
(e aparentemente string tbm não, então provavelmente Double, Long, Integer e tals tbm não)