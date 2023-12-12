    public class ServidorInativo extends Servidores{
    
        private String vinculo;
        private String situacao;

        ServidorInativo(String vinculo, String situacao,String nomeServidor, String cpfServidor, String salarioServidor){
            super(nomeServidor, cpfServidor, salarioServidor);
            this.vinculo = vinculo;
            this.situacao = situacao;
    
        }


        public void servidorInativo(){
            super.nomeServidor();
            setVinculo(vinculo);
            setSituacao(situacao);
            
        }

    
        // get 
        public String getVinculo(){
            return vinculo;
        }

        // set
        public void setVinculo(String vinculo){
            System.out.println("VÍNCULO: "+ this.vinculo);

        }

        public String getSituacao(){
            return situacao;
        }

        public void setSituacao(String situacao){
            System.out.println("SITUAÇÃO DO SERVIDOR: " + this.situacao);
        }


    
    
    }