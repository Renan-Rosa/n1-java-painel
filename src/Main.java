import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Importando Scanner
        Scanner scanner = new Scanner(System.in);

        //Declaração de variáveis
        String produto, empresa, produtoPreco, preco;

        //Criação de um Array para armazenar os produtos e seus preços.
        List<String> produtos = new ArrayList<String>();

        //Solicita ao usuário que digite o nome da Empresa e armazena.
        System.out.print("Informe o nome da Empresa: ");
        empresa = scanner.next();

    //Laço de repetição que solicita o Nome do produto e depois o preço, esse laço se repetirá até chegar na condição informada nesse caso 6 vezes.
        for (int i = 1; i <= 2; i++) {
            //Solicita nome do produto
            System.out.print("Digite o nome do Produto: " + i + ": ");
            produto = scanner.next();
            //Solicita o preço do produto
            System.out.print("Digite o preço do Produto: " + i + ": ");
            preco = scanner.next();
            //Armazena produto e preço em uma única variável "produtoPreco".
            produtoPreco = produto + "preco: R$" + preco;
            //Adiciona a váriavel ao Array e armazena as informações
            produtos.add(produtoPreco);
        }

    //Método que ficará em um loop infinito de repetição que irá ficar esperando um comando ser digitado e mostrando o painel com as informações cadastradas.
        showPainel(produtos, empresa);
        while (true) {
            String comando = scanner.next();
          //Condição caso seja digitado "exit" finalizar o programa.
            if (Objects.equals(comando, "exit")) {
                System.out.println("Encerrando programa.");
                System.exit(0);
                //Condição caso seja digitado "promo" deve pedir a posição do produto para aplicar o método promoção
            } else if (Objects.equals(comando, "promo")) {
                System.out.println("Informe a posição do produto da promoção: ");
                int posicao = scanner.nextInt();
                promo(produtos, posicao);
                showPainel(produtos, empresa);

            }
        }
    }
    //Método para mostrar no terminal o painel de visualização do nome da empresa e dos produtos cadastrados chamando o método "showPainel".
    public static void showPainel(List<String> elementos, String empresa) {
        System.out.println("===========================================");
        System.out.println(empresa);
        System.out.println("===========================================");

//        for (int i = 0; i < elementos.size(); i++) {
//            String elemento = elementos.get(i);
//            if (elemento.equals(elemento.toUpperCase())) {
//                // Move o produto para a posição 1 e formata seu Nome
//                elementos.remove(i);
//                elementos.add(1, Character.toUpperCase(elemento.charAt(0)) + elemento.substring(1).toLowerCase());
//                break;
//            }
//        }

        //Laço de repetição para imprimir os produtos cadastrados
        for (String elemento : elementos) {
            System.out.println(elemento);
            System.out.println("-----------------------------------------");
        }
    }
    //Método para aplicar a promoção, subindo o item pela posição indicada pelo usuário e depois colocando todas as suas letras em maiúsculo
    public static void promo(List<String> elementos, int posicao) {
        String produto = elementos.get(posicao);
        elementos.remove(posicao); // remove o produto da posicao atual
        elementos.add(0, produto.toUpperCase()); // adiciona o produto na posição 0 "primeira posição da lista", depois deixa todas as suas letras em maiúsculo
    }
}