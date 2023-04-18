import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String produto, empresa, produtoPreco, preco;
        List<String> produtos = new ArrayList<String>();

        System.out.println("Informe o nome da empresa :");
        empresa = scanner.next();


        for (int i = 1; i <= 2; i++) {
            System.out.print("Digite o nome do produto " + i + ": ");
            produto = scanner.next();

            System.out.print("Digite o preço do produto " + i + ": ");
            preco = scanner.next();

            produtoPreco = produto + "preco : R$" + preco;
            produtos.add(produtoPreco);

        }

        showPainel(produtos, empresa);
        while(true){
            String comando = scanner.next();
            if(Objects.equals(comando, "exit")){
                System.out.println("encerrando programa");
                System.exit(0);
                //encerrar programa
            } else if (Objects.equals(comando, "promo")){
                System.out.println("chamando o metodo promocao");
                // metodo para adicionar uma promocao
                public static void promo(List<String> produtos){
                    System.out.println("Qual a posição do produto que deseja mover para a área de promoção?");

                }
                //1 etapa - solicitar ao usuario qual elemento deve ir para a promocao
                //2 etapa - enviar esse elemento ou posicionar esse elemento no topo da lista em letras maiusculas

            }
        }
    }

    public static void showPainel(List<String> elementos, String empresa){
        System.out.println("===========================================");
        System.out.println(empresa);
        System.out.println("===========================================");
        for (String elemento: elementos){
            System.out.println(elemento);
            System.out.println("-----------------------------------------");
        }


    }
}
