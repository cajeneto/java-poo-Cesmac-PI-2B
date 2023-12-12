    public class ServidorAtivo extends Servidores{
    
        private String orgao;
        private String cargo;
        private String funcao;
        private String situacao;

        ServidorAtivo(String orgao, String cargo, String funcao, String situacao,String nomeServidor, String cpfServidor, String salarioServidor){
            super(nomeServidor, cpfServidor, salarioServidor);
            this.orgao = orgao;
            this.cargo = cargo;
            this.funcao = funcao;
            this.situacao = situacao;
    
        }


        public void servidorAtivo(){
            super.nomeServidor();
            setOrgao(orgao);
            setCargo(cargo);
            setFuncao(funcao);
            setSituacao(situacao);
            
        }

        // get
        public String getOrgao(){
            return orgao;
        }
        // set
        public void setOrgao(String orgao){
            this.orgao = orgao;
            System.out.println("ÓRGÃO: " + this.orgao);
        }


        // get
        public String getCargo(){
            return cargo;

        }

        // set
        public void setCargo(String cargo){
            System.out.println("CARGO: "+ this.cargo);
        }

        
        // get 
        public String getFuncao(){
            return funcao;
        }

        // set
        public void setFuncao(String funcao){
            System.out.println("FUNÇÃO: "+ this.funcao);

        }

        public String getSituacao(){
            return situacao;
        }

        public void setSituacao(String situacao){
            System.out.println("SITUAÇÃO DO SERVIDOR: " + this.situacao);
        }


    
    
    }