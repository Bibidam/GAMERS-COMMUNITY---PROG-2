package NEGOCIO.Forum;

import NEGOCIO.Usuario.Usuario;

public class Respostas /*extends Pergunta*/{
    
    private String resposta;
    private Usuario usuario;
    private Pergunta pergunta;

    public Respostas(String resposta, Usuario usuario, Pergunta pergunta) {
        
        //super(pergunta, null, topico);
         this.resposta = resposta;
         this.usuario = usuario;
         this.pergunta = pergunta;
    }    

    public Respostas() {
        
    }
    

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    //@Override
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getResposta() {
        return resposta;
    }

    /**
     *
     * @return
     */
   // @Override
    public Usuario getUsuario() {
        return usuario;
    }
    
    
    public String toString(){
        return getUsuario()+":"+ getResposta();
    }

   public Pergunta getPergunta(){
       return pergunta;
   }
    
    
}
