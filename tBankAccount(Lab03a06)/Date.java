
//Construtor Data de Inauguração da Conta 
public class Date {

    private int dia, mes, ano;

    public Date (int dia, int mes, int ano){

        if (mes < 1 || mes > 12) {
            throw new IllegalArgumentException("Mês inválido: " + mes);
        }

        if (dia < 1 || dia > DiasValidosMesAno(mes,ano)){
            throw new IllegalArgumentException("Dia Inválido: " + dia + " para o mês " + mes + " e ano " + ano);
        }

        this.mes = mes;
        this.dia = dia;
        this.ano = ano;
    }

    private int DiasValidosMesAno(int mes, int ano){
        switch(mes){
            case 2: //Fevereiro
                if((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)){
                    return 29;
                }else{
                    return 28;
                }

            case 4: case 6: case 9: case 11:
                return 30;

            default:
                return 31;
        }
    }

    //Metodos Gets

    public int getDia(){
        return dia;
    }

    public int getMes(){
        return mes;
    }

    public int getAno(){
        return ano;
    }

    // Método toString para formatar a data como uma string legível
    public String toString() {
        // Exemplo: 09/09/2025
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }

}
