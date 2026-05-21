public class FraseAleatoria {
    public static void main(String[] args) {
        
        // Três grupos de palavras para o livro brincar
        String[] listaUm = {"24/7", "multi-camadas", "arquitetura web", "orientado a objetos"};
        String[] listaDois = {"empoderado", "valor agregado", "focado no cliente", "compartilhado"};
        String[] listaTres = {"processo", "ponto de virada", "paradigma", "portal"};

        // Descobre quantas palavras existem em cada lista
        int tamUm = listaUm.length;
        int tamDois = listaDois.length;
        int tamTres = listaTres.length;

        // Gera três números aleatórios
        int rand1 = (int) (Math.random() * tamUm);
        int rand2 = (int) (Math.random() * tamDois);
        int rand3 = (int) (Math.random() * tamTres);

        // Constrói a frase misturando as palavras
        String frase = listaUm[rand1] + " " + listaDois[rand2] + " " + listaTres[rand3];

        // Exibe a frase na tela
        System.out.println("Precisamos de um(a) " + frase);
    }
}
