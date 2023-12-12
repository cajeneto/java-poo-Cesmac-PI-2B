

public class Main {

    public static void main(String[] args) {
        
        
        ServidorAtivo sa = new ServidorAtivo("PERICIA OFICIAL DO ESTADO DE ALAGOAS", "AGENTE DE POLICIA", "ASSESSOR DE COMUNICACAO", "ATIVO",
         "AARAO JOSE DA SILVA", "123.456.789-10", "R$11.406,54");
        ServidorInativo si = new ServidorInativo("APOSENTADO", "INATIVO", "ABDENIO DE FRANCA JUCA", "109.876.543-21", "R$8.131,75");

        System.out.println("-------------------------------------------------");
        System.out.println("SERVIDOR ATIVO");
        sa.servidorAtivo();

        
        System.out.println("-------------------------------------------------");
        System.out.println("SERVIDOR INATIVO");
        si.servidorInativo();


    }
}