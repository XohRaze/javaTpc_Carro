package Carros;

public class program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		carro c = new carro("Audi","A4",2014);

        c.setCodigoChassi("AHS653GKJ ");
        c.setCombustivel("Diesel");
        c.setCor("Laranja");
        c.setMatricula("AS-FD-AS");
        c.setNumeroDePortas(4);
        c.setTracao("Rodas dianteiras");
        c.setNumeroLugares(4);

        System.out.println("Marca: " + c.getMarca() + " Modelo: " + c.getModelo() + " Ano: " + c.getAno() + " Codigo Chassi: " +
                          c.getCodigoChassi() + " Combustivel: " + c.getCombustivel() + " Matricula: " + c.getMatricula() + " Cor: " +
                          c.getCor() + " Numero de Lugares: " + c.getNumeroDeLugares() + " Numero de Portas: " + c.getNumeroDePortas()
                          + " Tracao:  " + c.getTracao());
	}

}
