
public class ServidoresAtivos {

    //Criar um programa que gerencia os servidores ativos de uma empresa.

    private String nomeServidor;
    private String cpfServidor;
    private String orgaoSevidor;
    private String salarioServidor;

    public ServidoresAtivos (String nomeServidor, String cpfServidor, String orgaoSevidor, String salarioServidor) {
        this.nomeServidor = nomeServidor;
        this.cpfServidor = cpfServidor;
        this.orgaoSevidor = orgaoSevidor;
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
        public String getOrgaoServidor(){
            return orgaoSevidor;
        }
        // set
        public void setOrgaoServidor(String orgaoServidor){
            this.orgaoSevidor = orgaoServidor;
            System.out.println("ÓRGÃO: " + this.orgaoSevidor);
        }

                
        // get
        public String getSalarioServidor(){
            return salarioServidor;
        }
        // set
        public void setSalarioServidor(String salarioServidor){
            this.salarioServidor = salarioServidor;
            System.out.println("SALÁRIO" + this.salarioServidor);
        }
    
        
        
        
        
        
        
        
        
        
        
        

}