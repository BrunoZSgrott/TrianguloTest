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
public class LateralTrianguloVerificador {

    public boolean isTrianguloValido(Triangulo triangulo) {
        return ((triangulo.getA()) < (triangulo.getB() + triangulo.getC())
                && (triangulo.getB() < (triangulo.getA() + triangulo.getC()))
                && (triangulo.getC() < (triangulo.getA() + triangulo.getB())));
    }

    public boolean isIsoceles(Triangulo triangulo) {
        return this.isTrianguloValido(triangulo)
                && (((triangulo.getA()) == triangulo.getB()) && (triangulo.getA() != triangulo.getC())
                || ((triangulo.getB() == triangulo.getC()) && triangulo.getB() != triangulo.getA())
                || ((triangulo.getC() == triangulo.getA()) && triangulo.getC() != triangulo.getB()));
    }

    public boolean isEquilatero(Triangulo triangulo) {
        return this.isTrianguloValido(triangulo) && ((triangulo.getA() == triangulo.getB()) && (triangulo.getB() == triangulo.getC()));
    }

    public boolean isEscaleno(Triangulo triangulo) {
        return this.isTrianguloValido(triangulo) && ((triangulo.getA() != triangulo.getB()) && (triangulo.getB() != triangulo.getC()) && (triangulo.getC() != triangulo.getA()));
    }
}
