import java.util.ArrayList;

public interface CaatingaCare {
	
	//Publica�ao:
	
		public Publicacao Publicacao(Usuario usuario, Foto foto);
		
		//Curtidas:
		
		public void curtir(Usuario usuario, Publicacao Publicacao);
		
		//Comentar:

		public void comenta(Usuario usuario, Publicacao Publicacao, String comentario);
		
		//Salvar
		
		public void salvar (Usuario usuario, Publicacao Publicacao); 
		
		//Pesquisar:
		 
		public ArrayList<Usuario> pesquisa (Usuario usuario);
		
		//Seguirrrr:
		
		public Seguir Seguir(Usuario usuario);
		
		//Aceitar solicita��o:
		
		public void aceitar(Usuario usuario, Seguir Seguirrrr);
		
		//Compartilhar:
		
		public void compartilhar(Usuario usuario, Publicacao Publicacao);
		
		//Negar solicita��o:
		
		public void negar(Usuario usuario);
		
		//Responder Publicacao:
		
		public void responde(Usuario usuario , Publicacao Publicacao , String resPublicacaoa);
		
		
		//Deixar de Seguirrrr:
		
		public Seguir desceguir(Usuario usuario);
		
		
		//Notifica��es:
		
		public ArrayList<Usuario> notifica��es(Usuario usuario);
		
		//Publica��es:
		
		public ArrayList<Midia> publica��es(Usuario usuario , Midia midia);
		

}