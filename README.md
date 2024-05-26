# Conversor de Moedas

Bem-vindo ao Conversor de Moedas! Este projeto em Java faz parte do curso Praticando Java: Challenge conversor de moedas e permite converter valores entre diferentes moedas utilizando a API ExchangeRate-API.

## Funcionalidades

- Converter valores entre USD, ARS, BRL e COP.
- Menu interativo para escolher a conversão desejada.
- Exibir a taxa de câmbio e o valor convertido.

## Pré-requisitos

- Java 11 ou superior.
- Intellij IDEA ou IDE de preferência


## Estrutura do Projeto

- `src/main/java`
  - `ConversorDeMoedas.java` - Classe responsável pela obtenção da taxa de câmbio.
  - `Moeda.java` - Record que representa uma moeda e sua taxa de câmbio.
  - `Principal.java` - Classe principal que contém o menu e a lógica de conversão.


## Exemplo de Uso

1. Quando você executar o programa, verá o seguinte menu:

    ```
    ****************************************
    Seja Bem vindo ao Conversor de Moedas =)

    1) Dólar (USD) => Peso Argentino (ARS)
    2) Peso Argentino (ARS) => Dólar (USD)
    3) Dólar (USD) => Real Brasileiro (BRL)
    4) Real Brasileiro (BRL) => Dólar (USD)
    5) Dólar (USD) => Peso Colombiano (COP)
    6) Peso Colombiano (COP) => Dólar (USD)
    7) Sair
    Escolha uma opção válida:
    ****************************************
    ```

2. Escolha uma opção digitando o número correspondente e pressione Enter.
3. Digite o valor a ser convertido e pressione Enter.
4. O programa exibirá a taxa de câmbio e o valor convertido.
5. Você pode continuar fazendo conversões ou escolher a opção 7 para sair.

## Dependências

- [Gson](https://github.com/google/gson) - Biblioteca para trabalhar com JSON em Java.

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests.

## Contato

Para mais informações, entre em contato:

- Nome: Leandro Vitorino Marinho
- Email: lvmarinho.lm@gmail.com
  
