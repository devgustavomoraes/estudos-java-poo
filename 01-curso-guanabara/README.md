## 🧠 O que aprendi neste módulo

Neste curso, consolidei uma base teórica e prática sólida em Programação Orientada a Objetos (POO), evoluindo desde a modelagem de classes até a aplicação de padrões de clean code. Os principais aprendizados foram:

*   **Modelagem e Encapsulamento:** Compreensão profunda sobre a estrutura de uma classe (atributos, métodos, construtores, métodos acessores `get` e modificadores `set`). Aprendi a aplicar os diferentes níveis de visibilidade (`public`, `private`, `protected`) para garantir o encapsulamento e a segurança dos dados.
*   **Pilares da POO:** Domínio prático sobre **Herança** (reaproveitamento e extensão de classes) e **Polimorfismo** (compreendendo a diferença entre *sobreposição* e *sobrecarga* por meio da assinatura dos métodos).
*   **Relacionamentos entre Objetos:** Implementação de **Agregação**, aprendendo a utilizar a instância de uma classe como atributo de outra de forma totalmente modular.

## 🧼 Engenharia de Software & Clean Code (Diferencial Técnico)

O grande diferencial deste módulo foi o aprendizado e a aplicação das **Cláusulas de Guarda (Guard Clauses)**. Conforme evoluí no curso, passei a reestruturar os exercícios para fugir do "código em pirâmide" (ninhos de `if/else` redundantes).

### Por que adotei essa abordagem?

*   **Legibilidade:** O código passa a ter um fluxo linear e limpo.
*   **Saída Antecipada (*Early Return*):** Em vez de aninhar condições, o método valida os cenários de erro ou exceção logo no início e sai imediatamente (`return`), deixando o caminho livre para o fluxo principal do algoritmo.
*   **Documentação Histórica:** Para demonstrar essa evolução, mantive os blocos antigos de `if/else` comentados nos arquivos (como no `Livro.java`), servindo como registro visual do processo de refatoração aplicado.