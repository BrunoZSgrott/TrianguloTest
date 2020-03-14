/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangulo;

/**
 *
 * @author Bruno Zilli Sgrott
 */
public class AreaTrianguloCalculator {

    public int calcularArea(Triangulo triangulo) {
        return ((triangulo.getAltura() * triangulo.getBase()) / 2);
    }
}
