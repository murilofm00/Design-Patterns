# Design Patterns

Implementação de 3 design patterns em um mesmo problema.

## Dupla

- Murilo Fernandes Melo - @murilofm00.
- Carlon Chesme Veloso Noronha Júnior - @carlonjunior.

## Design Patterns

### Porque foi utilizado
 1. Strategy - Armas do jogador.
    - Utilizado para que o jogador possa ter a opção de escolher qual arma deseja utilizar.
    - Vantagem que o jogador tem a possibilidade de mudar de arma durante o jogo.
 
 2. Bridge - Inimigos.
    - Faz com que os Inimigos possam utilizar diferentes armas para atacar.
    - Gera comportamentos de defesa diferente para cada classe de inimigos.
    - Vantagem de gerar diferentes comportamentos conforme a classe de cada inimigo.
 3. Factory - Gera inimigos e armas.
    - Facilita o ato de gerar as classes e centraliza as regras de criação.
    - Vantagem de centralizar as formas de criação de classes.
 4. Template - Personagem.
    - Cria uma classe base para todos os personagens do jogo.
    - Maior reaproveitamento de código entre as classes
    
 #### Classes afetadas
1. Strategy - Armas do jogador. (package Arma)
    - Arma(interface)
    - ArcoFlecha
    - Espada
    - Pistola
 
 2. Bridge - Inimigos. (package Personagem.Inimigo)
    - Inimigo(abstract).
    - Guarda.
    - Golbin.
    
 3. Factory - Gera inimigos e armas.
    - ArmaFactory (package Arma)
    - InimigoFactory (package Personagem.Inimigo)
 4. Template - Personagem. package(Personagem)
    - Personagem(abstract)
    - Inimigo
    - Jogador
