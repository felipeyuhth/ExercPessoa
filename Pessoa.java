package Pessoa;

public class Pessoa {
	private String Nome;
	private	String Endereco;
	private	String Telefone;
	private	String Rg;
	private	String Email;
	
	
	public Pessoa (String Nome, String Endereco, String Telefone, String Rg, String Email){
		this.Nome = Nome;
		this.Endereco = Endereco;
		this.Telefone= Telefone;
		this.Rg = Rg;
		this.Email = Email;
	}
	
	
	public String getNome(){
		return Nome;
	}
    public void setNome (String Nome){
    	this.Nome = Nome;
    }
    public String getEndereco(){
    	return Endereco;
    }
    public void setEndereco(String Endereco){
    	this.Endereco = Endereco;
    }
    public String getTelefone(){
    	return Telefone;
    }
    public void setTelefone(String Telefone){
    	this.Telefone = Telefone;
    }
    public String getRg(){
    	return Rg;
    }
    public void setRg (String Rg){
    	this.Rg = Rg;
    }
    public String getEmail(){
    	return Email;
    }
    public void setEmail(String Email){
    	this.Email = Email;
    }
    
    public void apresentarPessoa(){
    	System.out.println("Nome: "+ this.getNome());
    	System.out.println("Endereço: "+ this.getEndereco());
    	System.out.println("Telefone: "+ this.getTelefone());
    	System.out.println("Rg: "+ this.getRg());
    	System.out.println("Email: "+ this.getEmail());
    }
    
    
    
    
   
}
