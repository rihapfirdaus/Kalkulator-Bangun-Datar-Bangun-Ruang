package kalkulator;

import java.util.*;

abstract class BangunDatar {
    abstract void keliling();
    abstract void luas();
    abstract void setResult(double result);
    abstract double getResult();
}

class Persegi extends BangunDatar{
    Scanner scan = new Scanner(System.in);
    private double result;
    private double s;

    private void readUser(){
        System.out.print("sisi: ");
        s = scan.nextDouble();
    }
    @Override
    public void keliling(){
        this.readUser();
        this.setResult(4*s);
    }
    @Override
    public void luas(){
        this.readUser();
        this.setResult(s*s);
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

class PersegiPanjang extends BangunDatar{
    Scanner scan = new Scanner(System.in);
    private double result;
    private double p, l;

    private void readUser(){
        System.out.print("panjang: ");
        p = scan.nextDouble();
        System.out.print("lebar: ");
        l = scan.nextDouble();
    }
    @Override
    public void keliling(){
        this.readUser();
        this.setResult(2*(p+l));
    }
    @Override
    public void luas(){
        this.readUser();
        this.setResult(p*l);
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

class Segitiga extends BangunDatar{
    Scanner scan = new Scanner(System.in);
    private double result;

    @Override
    public void keliling(){
        System.out.print("sisi 1: ");
        double s1 = scan.nextDouble();
        System.out.print("sisi 2: ");
        double s2 = scan.nextDouble();
        System.out.print("sisi 3: ");
        double s3 = scan.nextDouble();
        
        this.setResult(s1+s2+s3);
    }
    @Override
    public void luas(){
        System.out.print("alas: ");
        double a = scan.nextDouble();
        System.out.print("tinggi: ");
        double t = scan.nextDouble();

        this.setResult((a*t)/2);
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

class Lingkaran extends BangunDatar{
    Scanner scan = new Scanner(System.in);
    private double phi = 3.14;
    private double result;
    private double r;

    private void readUser(){
        System.out.print("jari-jari: ");
        r = scan.nextDouble();
    }
    @Override
    public void keliling(){
        this.readUser();
        this.setResult(2*phi*r);
    }
    @Override
    public void luas(){
        this.readUser();
        this.setResult(phi*r*r);
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

class JajarGenjang extends BangunDatar{
    Scanner scan = new Scanner(System.in);
    private double result;

    @Override
    public void keliling(){
        System.out.print("alas: ");
        double a = scan.nextDouble();
        System.out.print("sisi miring: ");
        double s = scan.nextDouble();

        this.setResult(2*(a+s));
    }
    @Override
    public void luas(){
        System.out.print("alas: ");
        double a = scan.nextDouble();
        System.out.print("tinggi: ");
        double t = scan.nextDouble();

        this.setResult(a*t);
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

class BelahKetupat extends BangunDatar{
    Scanner scan = new Scanner(System.in);
    private double result;

    @Override
    public void keliling(){
        System.out.print("sisi: ");
        double s = scan.nextDouble();

        this.setResult(4*s);
    }
    @Override
    public void luas(){
        System.out.print("diagonal 1: ");
        double d1 = scan.nextDouble();
        System.out.print("diagonal 2: ");
        double d2 = scan.nextDouble();

        this.setResult((d1*d2)/2);
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

class Trapesium extends BangunDatar{
    Scanner scan = new Scanner(System.in);
    private double result;

    @Override
    public void keliling(){
        System.out.print("panjang AB: ");
        double AB = scan.nextDouble();
        System.out.print("panjang BC: ");
        double BC = scan.nextDouble();
        System.out.print("panjang CD: ");
        double CD = scan.nextDouble();
        System.out.print("panjang AD: ");
        double AD = scan.nextDouble();

        this.setResult(AB+BC+CD+AD);
    }
    @Override
    public void luas(){
        System.out.print("sisi bawah: ");
        double a = scan.nextDouble();
        System.out.print("sisi atas: ");
        double b = scan.nextDouble();
        System.out.print("tinggi: ");
        double t = scan.nextDouble();

        this.setResult(((a+b)*t)/2);
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

class LayangLayang extends BangunDatar{
    Scanner scan = new Scanner(System.in);
    private double result;

    @Override
    public void keliling(){
        System.out.print("sisi 1: ");
        double s1 = scan.nextDouble();
        System.out.print("sisi 2: ");
        double s2 = scan.nextDouble();

        this.setResult(2*(s1+s2));
    }
    @Override
    public void luas(){
        System.out.print("diagonal 1: ");
        double d1 = scan.nextDouble();
        System.out.print("diagonal 2: ");
        double d2 = scan.nextDouble();

        this.setResult((d1*d2)/2);
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