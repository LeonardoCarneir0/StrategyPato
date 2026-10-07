# StrategyPato — Pokémon com o padrão Strategy

Atividade de **Programação 3** (padrões comportamentais). O código dos "tipos de pato" foi adaptado para criar tipos de **Pokémon**, usando o padrão **Strategy**: o poder e o tipo de ataque de cada Pokémon são comportamentos intercambiáveis, que podem ser trocados em tempo de execução.

## Pokémons implementados

| Pokémon   | Poder inicial | Ataque inicial |
|-----------|---------------|----------------|
| Bulbasaur | Planta        | Especial       |
| Corsola   | Água          | Defensivo      |

## Estrutura do projeto

```
StrategyPato/
├── README.md
└── src/
    ├── Cliente.java
    ├── pokemons/
    │   ├── Pokemon.java
    │   ├── Bulbasaur.java
    │   └── Corsola.java
    └── strategies/
        ├── poder/
        │   ├── Poder.java
        │   ├── PoderAgua.java
        │   ├── PoderEletrico.java
        │   ├── PoderFogo.java
        │   ├── PoderGelo.java
        │   └── PoderPlanta.java
        └── ataque/
            ├── Ataque.java
            ├── AtaqueDefensivo.java
            ├── AtaqueEspecial.java
            ├── AtaqueFisico.java
            └── AtaqueRapido.java
```

- `pokemons`: os Pokémon (contexto do padrão).
- `strategies.poder` e `strategies.ataque`: as famílias de comportamentos (estratégias).
- `Cliente.java`: cria os Pokémon e troca as estratégias durante a execução.

## Como o padrão foi aplicado

| Papel no Strategy      | Neste projeto                                                    |
|------------------------|------------------------------------------------------------------|
| Contexto               | `Pokemon` (classe abstrata) com `Poder` e `Ataque` por composição |
| Interfaces Strategy    | `Poder` e `Ataque`                                               |
| Estratégias concretas  | `PoderFogo`, `PoderAgua`, `PoderEletrico`, `PoderGelo`, `PoderPlanta`, `AtaqueFisico`, `AtaqueEspecial`, `AtaqueRapido`, `AtaqueDefensivo` |
| Cliente                | `Cliente.java`, que escolhe e troca as estratégias via setters   |

Princípios de projeto aplicados:

1. Os aspectos que variam (poder e ataque) foram separados do que permanece igual.
2. A programação é feita para interfaces (`Poder`, `Ataque`), não para implementações.
3. Foi dada prioridade à composição ("tem um") em vez de herança ("é um").

## Como compilar e executar (Linux)

Na pasta `StrategyPato`:

```bash
mkdir -p bin
javac -encoding UTF-8 -d bin $(find src -name "*.java")
java -cp bin Cliente
```

Requer o JDK instalado (`javac -version` para conferir).

## Saída esperada

```
===== Comportamento inicial =====
Eu sou o Bulbasaur, o Pokémon semente!
Pokémon: Bulbasaur | Poder: Planta | Ataque: Especial
Bulbasaur (Planta): Lançando folhas afiadas e chicotes de vinha!
Bulbasaur (Especial): Executando um ataque especial à distância!

Eu sou a Corsola, o Pokémon coral!
Pokémon: Corsola | Poder: Água | Ataque: Defensivo
Corsola (Água): Disparando um jato de água!
Corsola (Defensivo): Fechando a guarda e contra-atacando com defesa!

===== Trocando estratégias em tempo de execução =====
Pokémon: Bulbasaur | Poder: Fogo | Ataque: Rápido
Bulbasaur (Fogo): Lançando uma rajada de chamas!
Bulbasaur (Rápido): Atacando em alta velocidade!

Pokémon: Corsola | Poder: Gelo | Ataque: Físico
Corsola (Gelo): Congelando o alvo com um sopro gelado!
Corsola (Físico): Atacando com um golpe físico!
```

## Como criar um novo Pokémon

1. Crie uma classe em `pokemons/` que estenda `Pokemon`.
2. No construtor, chame `super("Nome")` e defina `poder` e `ataque` com as estratégias desejadas.
3. Implemente o método `exibir()`.

Para um comportamento novo, basta criar uma classe que implemente `Poder` ou `Ataque`, sem alterar nenhum Pokémon existente.
