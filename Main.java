import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        List<Enviados> lista = new ArrayList<>();

        LocalDate hoje = LocalDate.now();

        lista.add(new Enviados(
            "Ferramenta",
            2,
            200.50f,
            hoje.plusDays(2),
            "Construção em ação"
        ));

        Enviar mostrar = foi -> {
            System.out.println("Produto: " + foi.getProduto());
            System.out.println("Preço: " + foi.getPreco());
            System.out.println("Quantidade: " + foi.getQuantidade());
            System.out.println("Previsão: " + foi.getPrevisao());
            System.out.println("Loja: " + foi.getLoja());
        };

        Thread thread = new Thread(() -> {

            lista.stream()
                .forEach(foi -> mostrar.enviando(foi));

        });

        Thread total = new Thread(() -> {

            System.out.println(
                "Total de produtos em andamento: " + lista.size()
            );

        });

        try {

            thread.start();

            Thread.sleep(1000);

            total.start();

        } catch (Exception e) {

            System.out.println("Errinho");

        }
    }
}