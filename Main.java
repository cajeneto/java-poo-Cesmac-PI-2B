

public class Main {

    public static void main(String[] args) {
        
        ServidoresAtivos sa1 = new ServidoresAtivos("AARAO JOSE DA SILVA","123.456.798-10", "PO", "R$11.406,54");
        
        System.out.println(sa1.getNomeServidor()+"\n"+sa1.getCpfServidor()+"\n"+sa1.getOrgaoServidor()+"\n"+sa1.getSalarioServidor());
        
        



    }
}