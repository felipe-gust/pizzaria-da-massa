import java.util.ArrayList;
import java.util.Scanner;

public class Caixa {

    public static void main(String[] args) {

        System.out.println("\u001b[1m Sistema de caixa da Pizzaria Da Massa para atendimento aos clientes \u001b[m");
        
        Scanner scan = new Scanner(System.in);

        Cardapio cardapio = new Cardapio();
        //Lista de sabores e preços
        Cardapio c1 = new Cardapio("\u001b[31m Calabresa \u001b[m", 27.90, 1);
        Cardapio c2 = new Cardapio("\u001b[31m Mussarela \u001b[m", 27.90, 2);
        Cardapio c3 = new Cardapio("\u001b[31m Alho \u001b[m", 27.90, 3);
        Cardapio c4 = new Cardapio("\u001b[31m Atum \u001b[m", 32.90, 4);
        Cardapio c5 = new Cardapio("\u001b[31m Frango com catupiry \u001b[m", 27.90, 5);
        Cardapio c6 = new Cardapio("\u001b[31m Pizza Da Massa \u001b[m", 32.90, 6);
        Cardapio c7 = new Cardapio("\u001b[31m Calabacon \u001b[m", 32.90, 7);
        Cardapio c8 = new Cardapio("\u001b[31m Camarão com queijo \u001b[m", 32.90, 8);
        Cardapio c9 = new Cardapio("\u001b[31m Camarão fit \u001b[m", 35.00, 9);
        Cardapio c10 = new Cardapio("\u001b[31m Picanha com alho \u001b[m", 35.00, 10);
        Cardapio c11 = new Cardapio("\u001b[31m Picanha com queijo \u001b[m", 35.00, 11);
        Cardapio c12 = new Cardapio("\u001b[31m Escarola com queijo \u001b[m", 35.00, 12);
        Cardapio c13 = new Cardapio("\u001b[31m Carne seca com queijo \u001b[m", 27.90, 13);

        ArrayList<Cardapio> cardapios = new ArrayList<>();
        cardapios.add(c1);
        cardapios.add(c2);
        cardapios.add(c3);
        cardapios.add(c4);
        cardapios.add(c5);
        cardapios.add(c6);
        cardapios.add(c7);
        cardapios.add(c8);
        cardapios.add(c9);
        cardapios.add(c10);
        cardapios.add(c11);
        cardapios.add(c12);
        cardapios.add(c13);

        //sabor temporariamente removido
        cardapios.remove(c13);

        System.out.println("Qual a quantidade de pedidos: ");
        int quantidade = scan.nextInt();

        //foreach para imprimir o cardápio da pizzaria
        System.out.println("\u001b[1m\u001b[4m Cardápio Da Massa \u001b[m");
        for(Cardapio c : cardapios){
            System.out.println(c);
        }

        int opcao;
        String pedido = "\n";
        double soma = 0;

        for(int i=1; i<=quantidade; i++){

            System.out.println("Digite o número do pedido conforme o sabor da pizza (ex: 1 - Calabresa): ");
            opcao = scan.nextInt();

            if(opcao == 1){
                soma += 27.90;
                pedido += cardapios.get(0) + "\n";
            }else if(opcao == 2){
                soma += 27.90;
                pedido += cardapios.get(1) + "\n";
            }else if(opcao == 3){
                soma += 27.90;
                pedido += cardapios.get(2) + "\n";
            }else if(opcao == 4){
                soma += 32.90;
                pedido += cardapios.get(3) + "\n";
            }else if(opcao == 5){
                soma += 27.90;
                pedido += cardapios.get(4) + "\n";
            }else if(opcao == 6){
                soma += 32.90;
                pedido += cardapios.get(5) + "\n";
            }else if(opcao == 7){
                soma += 32.90;
                pedido += cardapios.get(6) + "\n";
            }else if(opcao == 8){
                soma += 32.90;
                pedido += cardapios.get(7) + "\n";
            }else if(opcao == 9){
                soma += 35.00;
                pedido += cardapios.get(8) + "\n";
            }else if(opcao == 10){
                soma += 35.00;
                pedido += cardapios.get(9) + "\n";
            }else if(opcao == 11){
                soma += 35.00;
                pedido += cardapios.get(10) + "\n";
            }else if(opcao == 12){
                soma += 35.00;
                pedido += cardapios.get(11) + "\n";
            }else if(opcao == 13){
                soma += 27.90;
                pedido += cardapios.get(12) + "\n";
            }

        }

        cardapio.setTotal(soma);
        cardapio.setPedidos(pedido);

        System.out.println(cardapio);
        System.out.println(cardapio.imprimirPedido());

    }
    
}
