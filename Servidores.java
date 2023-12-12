
public class Servidores{

    //Criar um programa que gerencia os servidores ativos de uma empresa.

    private String nomeServidor;
    private String cpfServidor;
    private String salarioServidor;

    public Servidores(String nomeServidor, String cpfServidor, String salarioServidor) {
        this.nomeServidor = nomeServidor;
        this.cpfServidor = cpfServidor;
        this.salarioServidor = salarioServidor;
        
    }



        // get
        public String getNomeServidor(){
            return nomeServidor;
        }
        // set
        public void setNomeServidor(String nomeServidor ){
            this.nomeServidor = nomeServidor;
            System.out.println("Nome: " +this.nomeServidor);
            
        }


    
        // get
        public String getCpfServidor(){
            return cpfServidor;
        }
        // set
        public void setCpfServidor(String cpfServidor){
            this.cpfServidor = cpfServidor;
            System.out.println("CPF: " + this.cpfServidor);
        }


        

                
        // get
        public String getSalarioServidor(){
            return salarioServidor;
        }
        // set
        public void setSalarioServidor(String salarioServidor){
            this.salarioServidor = salarioServidor;
            System.out.println("SALÁRIO: " + this.salarioServidor);
        }
    




        public void nomeServidor(){
            setNomeServidor(nomeServidor);
            setCpfServidor(cpfServidor);
            setSalarioServidor(salarioServidor);
            
        
        }
        
        
        
        
        
        
        
        
        
        
        

}