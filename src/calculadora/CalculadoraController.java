/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author otavio.ferreira
 */
public class CalculadoraController {
    
    private Double total;
    
    public CalculadoraController(){
        total = 0.0;    
    }
    
    
    
    public Double operacao(String operacao, Double valor){
        
        switch (operacao) {
            case "SOMA":
                this.total = this.total + valor;
                break;
            case "SUBTRACAO":
                this.total = this.total - valor;
                break;
            case "DIVISAO":
                total = total / valor;
                break;
            case "MULTIPLICACAO":
                this.total = this.total * valor;
                break;
            default:
                break;
        }
        return this.total;
    }
    
    public Double getTotal(){
        return this.total;
    }
    
    public void zerar(){
        this.total = 0.0;
    }
}
