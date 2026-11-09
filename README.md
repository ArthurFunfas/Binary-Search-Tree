# Binary Search Tree

Implementação de uma **Árvore de Busca Binária (BST)** desenvolvida em Java para fins acadêmicos.

## Funcionalidades

- Inserção de nós.
- Exclusão de nós.
- Percursos em pré-ordem, em ordem e pós-ordem.

## Estrutura do projeto

```text
BinarySearchTree/
├── Node.java
├── BinarySearchTree.java
├── Main.java
└── README.md
```

## Como executar

```bash
javac Node.java BinarySearchTree.java Main.java
java Main
```

## Exemplo de uso

Inserindo os valores `50, 30, 70, 20, 40, 60, 80`, a árvore será:

```text
          50
         /  \
       30    70
      / \    / \
     20  40  60  80
```

**Resultados dos percursos:**

| Percurso | Resultado |
|---|---|
| Pré-ordem | 50 30 20 40 70 60 80 |
| Em ordem | 20 30 40 50 60 70 80 |
| Pós-ordem | 20 40 30 60 80 70 50 |

---
