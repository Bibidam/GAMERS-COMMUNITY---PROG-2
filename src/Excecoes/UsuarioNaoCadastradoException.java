package Excecoes;

public class UsuarioNaoCadastradoException extends Exception{
    public UsuarioNaoCadastradoException(){
        super("Usuario n�o cadastrado...");
    }
}