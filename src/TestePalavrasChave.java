public class TestePalavrasChave {

    public static void main(String[] args) {
        // Teste do uso incorreto de palavras-chave reservadas
        /*
        int public = 10;
        int static = 20;
        */
        // Teste de uso de palavras-chave contextuais fora do contexto original
        boolean opens = true;
        boolean exports = false;

        System.out.printf("Opens: %b\nExports: %b", opens, exports);
    }
}
