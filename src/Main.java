import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String produto, empresa, produtoPreco, preco;
        List<String> produtos = new ArrayList<String>();
        System.out.print("Informe o nome da Empresa: ");
        empresa = scanner.next();

        for (int i = 1; i <= 2; i++) {
            System.out.print("Digite o nome do Produto: " + i + ": ");
            produto = scanner.next();
            System.out.print("Digite o preço do Produto: " + i + ": ");
            preco = scanner.next();
            produtoPreco = produto + "preco: R$" + preco;
            produtos.add(produtoPreco);
        }

        showPainel(produtos, empresa);
        while (true) {
            String comando = scanner.next();
            //encerra o programa = exit.
            if (Objects.equals(comando, "exit")) {
                System.out.println("Encerrando programa.");
                System.exit(0);
                //chama o metodo para aplicar a promocao a um produto = promo.
            } else if (Objects.equals(comando, "promo")) {
                System.out.println("Informe a posição do produto da promoção: ");
                int posicao = scanner.nextInt();
                promo(produtos, posicao);
                showPainel(produtos, empresa);

            }
        }
    }
    public static void showPainel(List<String> elementos, String empresa) {
        System.out.println("===========================================");
        System.out.println(empresa);
        System.out.println("===========================================");
        for (String elemento : elementos) {
            //identificar se primeiro produto da lista esta com Uppercase
            System.out.println(elemento);
            System.out.println("-----------------------------------------");
        }
    }
    public static void promo(List<String> elementos, int posicao) {
        String produto = elementos.get(posicao);
        elementos.remove(posicao); // remove o produto da posicao original
        elementos.add(0, produto.toUpperCase());
    }
}
