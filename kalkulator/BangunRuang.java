package kalkulator;

import java.util.*;

abstract class BangunRuang {
    abstract public void luas();
    abstract public void volume();
    abstract public void setResult(double result);
    abstract public double getResult();
}

class Kubus extends BangunRuang{
    Scanner scan = new Scanner(System.in);
    private double result;
    private double r;

    private void readUser(){
        System.out.print("rusuk: ");
        r = scan.nextDouble();
    }
    @Override
    public void luas(){
        this.readUser();
        this.setResult(6*r*r);
    }
    @Override
    public void volume(){
        this.readUser();
        this.setResult(r*r*r);
    }
    @Override
    public void setResult(double result){
        this.result = result;
    }
    @Override
    public double getResult(){
        return this.result;
    }
}

class Balok extends BangunRuang{
    Scanner scan = new Scanner(System.in);
    private double result;
    private double p, l, t;

    private void readUser(){
        System.out.print("panjang: ");
        p = scan.nextDouble();
        System.out.print("lebar: ");
        l = scan.nextDouble();
        System.out.print("tinggi: ");
        t = scan.nextDouble();
    }
    @Override
    public void luas(){
        this.readUser();
        this.setResult((2*p*l)+(2*p*t)+(2*l*t));
    }
    @Override
    public void volume(){
        this.readUser();
        this.setResult(p*l*t);
    }
    @Override
    public void setResult(double result){
        this.result = result;
    }
    @Override
    public double getResult(){
        return this.result;
    }
}

class Kerucut extends BangunRuang{
    Scanner scan = new Scanner(System.in);
    private double phi = 3.14;
    private double result;
    private double r, s, t;

    private void readUser(){
        System.out.print("jari-jari alas: ");
        r = scan.nextDouble();
        System.out.print("selimut: ");
        s = scan.nextDouble();
        System.out.print("tinggi: ");
        t = scan.nextDouble();
    }
    @Override
    public void luas(){
        this.readUser();
        this.setResult((phi*(r*r))+(phi*r*s));
    }
    @Override
    public void volume(){
        this.readUser();
        this.setResult((1*phi*(r*r)*t)/3);
    }
    @Override
    public void setResult(double result){
        this.result = result;
    }
    @Override
    public double getResult(){
        return this.result;
    }
}

class Tabung extends BangunRuang{
    Scanner scan = new Scanner(System.in);
    private double phi = 3.14;
    private double result;
    private double r, t;

    private void readUser(){
        System.out.print("jari-jari alas: ");
        r = scan.nextDouble();
        System.out.print("tinggi: ");
        t = scan.nextDouble();
    }
    @Override
    public void luas(){
        this.readUser();
        this.setResult((2*phi*r*t)+(2*phi*(r*r)));
    }
    @Override
    public void volume(){
        this.readUser();
        this.setResult(phi*(r*r)*t);
    }
    @Override
    public void setResult(double result){
        this.result = result;
    }
    @Override
    public double getResult(){
        return this.result;
    }
}

class Bola extends BangunRuang{
    Scanner scan = new Scanner(System.in);
    private double phi = 3.14;
    private double result;
    private double r;

    private void readUser(){
        System.out.print("jari-jari: ");
        r = scan.nextDouble();
    }
    @Override
    public void luas(){
        this.readUser();
        this.setResult(4*phi*(r*r));
    }
    @Override
    public void volume(){
        this.readUser();
        this.setResult((4*phi*(r*r*r))/3);
    }
    @Override
    public void setResult(double result){
        this.result = result;
    }
    @Override
    public double getResult(){
        return this.result;
    }
}
