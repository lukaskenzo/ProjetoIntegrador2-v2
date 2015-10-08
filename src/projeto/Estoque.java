package projeto;

public class Estoque {

    //Atributos/Tipos
    private int gasolina;
    private int alcool;
    private int diesel;

    public Estoque() {
        gasolina = 50000;
        alcool = 50000;
        diesel = 50000;
    }

    public int getGasolina() {
        return gasolina;
    }

    public void setGasolina(int litros) {
        this.gasolina = gasolina - litros;
    }

    public int getAlcool() {
        return alcool;
    }

    public void setAlcool(int litros) {
        this.alcool = alcool - litros;
    }

    public int getDiesel() {
        return diesel;
    }

    public void setDiesel(int litros) {
        this.diesel = diesel - litros;
    }

}
