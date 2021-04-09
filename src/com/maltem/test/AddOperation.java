package com.maltem.test;

public class AddOperation extends Observer{
    protected double result = 0;

    public AddOperation(Subject subject) {
    this.subject=subject;
    this.subject.attach(this);
    }

    @Override
    public void update() {


            if (this.subject.getState3().equals("+")){
                this.result += this.subject.getState1()+this.subject.getState2();
            }
            else if (this.subject.getState3().equals("-")){
                this.result -= this.subject.getState2()-this.subject.getState1();
            }
            System.out.println("Le resultat de l'operation est : " +this.result);
    }
}
