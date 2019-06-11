import java.util.Scanner;

public class Funcionario{

    private String nome;
    private String endereco;
    private String tipodefunc;
    private String mododepagto;
    private int id;
    private int idsind;
    private double taxasind;
    private double salariototal;

    public funcionario(String nome, String endereco, String tipodefunc, String mododepagto, int id, int idsind, double taxasind, double salariototal){
        this.nome = nome;
        this.endereco = endereco;
        this.tipodefunc = tipodefunc;
        this.mododepagto = mododepagto;
        this.id = id;
        this.idsind = idsind;
        this.taxasind = taxasind;
        this.salariototal = salariototal;
    }

    public String getNome(){
        return nome;
    }

    public String getEndereco(){
        return endereco;
    }

    public String getTipoDeFunc(){
        return tipodefunc;
    }

    public String getModoDePagto(){
        return mododepagto;
    }

    public int getId(){
        return id;
    }

    public int getIdSind(){
        return idsind;
    }

    public double getTaxaSind(){
        return taxasind;
    }

    public double getSalarioTotal(){
        return salariototal;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public void setTipoDeFunc(String tipodefunc){
        this.tipodefunc = tipodefunc;
    }

    public void setModoDePagto(String mododepagto){
        this.mododepagto = mododepagto;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setIdSind(int idsind){
        this.idsind = idsind;
    }

    public void setTaxaSind(double taxasind){
        this.taxasind = taxasind;
    }

    public void setSalarioTotal(double salariototal){
        this.salariototal = salariototal;
    }

}

public class Horista extends Funcionario{

    private int horastrabal;
    private double salariohora;

    public horista(String nome, String endereco, String tipodefunc, String mododepagto, int id, double salariototal, int horastrabal, double salariohora){
        super(nome, endereco, tipodefunc, mododepagto, id, idsind, taxasind, salariototal);
        this.horastrabal = horastrabal;
        this.salariohora = salariohora;
    }

    public int getHorasTrabal(){
        return horastrabal;
    }

    public double getSalarioHora(){
        return salariohora;
    }

    public void setHorasTrabal(int horastrabal){
        this.horastrabal = horastrabal;
    }

    public void setSalarioHora(double salariohora){
        this.salariohora = salariohora;
    }

}

public class Salaried extends Funcionario{

    private double salariosemanal;

    public salaried(String nome, String endereco, String tipodefunc, String mododepagto, int id, double salariototal, double salariosemanal){
        super(nome, endereco, tipodefunc, mododepagto, id, idsind, taxasind, salariototal);
        this.salariosemanal = salariosemanal;
    }

    public double getSalarioSemanal(){
        return salariosemanal;
    }

    public void setSalarioSemanal(double salariosemanal){
        this.salariosemanal = salariosemanal;
    }

}

