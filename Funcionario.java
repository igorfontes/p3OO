import java.util.Scanner;
import java.util.ArrayList;

public abstract class Funcionario{

    private String nome;
    private String endereco;
    private String tipodefunc;
    private String mododepagto;
    private int id;
    private int idsind;
    private double taxasind;
    private double salariototal;
    private String agendainterval;
    private int agendaday;
    private String agendadayofweek;

    public abstract double getSalarioBase(); //salario base do horista e: salhora; assalariado: salmensal; comis: salmensal
    public abstract void setSalarioBase(double salariobase);
    //public abstract void calcSalary(ArrayList<Funcionario> list); //tirar duvida

    public Funcionario(String nome, String endereco, String tipodefunc, String mododepagto, int id, int idsind, double taxasind, double salariototal, String agendainterval, int agendaday, String agendadayofweek){
        this.nome = nome;
        this.endereco = endereco;
        this.tipodefunc = tipodefunc;
        this.mododepagto = mododepagto;
        this.id = id;
        this.idsind = idsind;
        this.taxasind = taxasind;
        this.salariototal = salariototal;
        this.agendainterval = agendainterval;
        this.agendaday = agendaday;
        this.agendadayofweek = agendadayofweek;
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

    public String getAgendaInterval(){
        return agendainterval;
    }

    public int getAgendaDay(){
        return agendaday;
    }

    public String getAgendaDayofWeek(){
        return agendadayofweek;
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

    public void setAgendaInterval(String agendainterval){
        this.agendainterval = agendainterval;
    }

    public void setAgendaDay(int agendaday){
        this.agendaday = agendaday;
    }

    public void setAgendaDayofWeek(String agendadayofweek){
        this.agendadayofweek = agendadayofweek;
    }

}


