package Carros;

public class carro {

	//Atributos
    String marca;
    String modelo;
    int ano;
    String codigoChassi;
    String cor;
    String matricula;
    int numeroDePortas;
    String combustivel;
    int numeroLugares;
    String tracao;

    //Construtores
    public carro(String marca, String modelo, int ano)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    //Metodos
    public void setCodigoChassi(String codigoChassi)    //Codigo Chassi
    {
        this.codigoChassi = codigoChassi;
    }

    public void setCor(String cor)                      //Cor
    {
        this.cor = cor;
    }

    public void setMatricula(String matricula)          //Matricula
    {
        this.matricula = matricula;
    }

    public void setNumeroDePortas(int numeroDePortas)   //Numero de Portas
    {
        this.numeroDePortas = numeroDePortas;
    }

    public void setCombustivel(String combustivel)    //Combustivel
    {
        this.combustivel = combustivel;
    }

    public void setNumeroLugares(int numeroLugares)   //Numero Lugares
    {
        this.numeroLugares = numeroLugares;
    }

    public void setTracao(String tracao) //Traçao
    {
        this.tracao = tracao;
    }

    /* -- Devoluçao dos atributos --*/

    public String getMarca()            //Marca
    {
        return marca;
    }

    public String getModelo()           //Modelo
    {
        return modelo;
    }

    public int getAno()               //Ano
    {
        return ano;
    }

    public String getCodigoChassi()     //Codigo Chassi
    {
        return codigoChassi;
    }

    public String getCor()               //Cor
    {
        return cor;
    }

    public String getMatricula()         //Matricula
    {
        return matricula;
    }

    public int getNumeroDePortas()   //Numero de Portas
    {
        return numeroDePortas;
    }

    public String getCombustivel()       //Combustivel
    {
        return combustivel;
    }

    public int getNumeroDeLugares()     //Numero de Lugares
    {
        return numeroLugares;
    }

    public String getTracao()            //Tracao
    {
        return tracao;
    }
	
	
	
}
