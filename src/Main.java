import Trees.BinarySearchTree;
import java.util.Scanner;

void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    BinarySearchTree tree = new BinarySearchTree();

    int option;
    int value;

    do {

        System.out.println("\n===== ÁRVORE DE BUSCA BINÁRIA  =====");
        System.out.println("1 - Inserir nó");
        System.out.println("2 - Percurso em pré-ordem");
        System.out.println("3 - Percurso em ordem");
        System.out.println("4 - Percurso em pós-ordem");
        System.out.println("5 - Excluir nó");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");

        option = scanner.nextInt();

        switch (option) {

            case 1:
                System.out.print("Digite o valor: ");
                value = scanner.nextInt();
                tree.insert(value);
                break;

            case 2:
                System.out.print("Pré-ordem: ");
                tree.preOrder();
                break;

            case 3:
                System.out.print("Em ordem: ");
                tree.inOrder();
                break;

            case 4:
                System.out.print("Pós-ordem: ");
                tree.postOrder();
                break;

            case 5:
                System.out.print("Digite o valor que deseja excluir: ");
                value = scanner.nextInt();
                tree.delete(value);
                break;

            case 0:
                System.out.println("Encerrando o programa.");
                break;

            default:
                System.out.println("Opção inválida.");
        }

    } while (option != 0);

    scanner.close();
}