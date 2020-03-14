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
public class Triangulo {

    private int a;
    private int b;
    private int c;

    private int altura;
    private int base;

    public Triangulo(int altura, int base) {
        this.altura = altura;
        this.base = base;
    }

    public Triangulo(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

}
