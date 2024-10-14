
package projetoconfeitariaa;

import javax.swing.JOptionPane;


public class Cliente {
    private String nome;
    private String email;
    private String cpf;
    private String telefone;
    private String cidade;
    private String bairro;
    private String rua;
    private int numero;
    private String usuario;
    private String senha;
    private int id;

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    

    
    
    public Cliente(String nome, String email, String cpf, String telefone, String cidade, String bairro, String rua, int numero, String usuario, String senha) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.telefone = telefone;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
        this.usuario = usuario;
        this.senha = senha;
    }

    

   
    
    public Cliente(){
        
    };
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public void cadastrar(){
    String sql = "INSERT INTO cliente (nome, email, cpf, telefone, cidade, bairro, rua, numero, usuario, senha) VALUES( "
               + " '" + this.getNome() + "' , "
               + " '" + this.getEmail() + "' , "
               + " '" + this.getCpf()+ "' , "
               + " '" + this.getTelefone()+ "' , "
               + " '" + this.getCidade()+ "' , "
               + " '" + this.getBairro()+ "' , "
               + " '" + this.getRua()+ "' , "
               + this.getNumero()+ " , "
               + " '" + this.getUsuario()+ "' , "
               + " '" + this.getSenha()+ "' ) ";
               System.out.println(sql);
    ProjetoConexao.executar( sql );
    }
    public void editar(){
        
        
        String sql = "UPDATE Cliente SET"
                +" nome='" + this.getNome() + "' , "
                +" email='" + this.getEmail() + "' ,"
                +" cpf='" + this.getCpf() + "' , "
                +" telefone='" + this.getTelefone()+ "' , "
                +" cidade='" + this.getCidade()+ "' , "
                +" bairro='" + this.getBairro()+ "' , "
                +" rua='" + this.getRua()+ "' , "
                +" numero=" + this.getNumero()+ " , "
                +" senha='" + this.getSenha()+ "' ,"
                +" usuario='" + this.getUsuario() + "' "
                +" WHERE id_conta=" + this.getId()+";";
        System.out.println(sql); 
        
        
        ProjetoConexao.executar( sql );
}
    public static void excluir(int idCliente){
      String sql = "DELETE FROM Cliente WHERE ID_conta = " +idCliente;
      ProjetoConexao.executar( sql );  
  }
    
}

   
