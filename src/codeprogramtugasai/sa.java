/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeprogramtugasai;

/**
 *
 * @author User
 */
public class sa {
    public double random(){
        return Math.random();
    }
    public double fungsi(double x1, double x2){
        return -Math.abs(Math.sin(x1)*Math.cos(x2)*Math.exp(Math.abs(1-(Math.sqrt(Math.pow(x1,2)+Math.pow(x2,2))/Math.PI))));
    }
    public double generatetitik(){
        return Math.random()*20+-10;
    }
    public double revisi(double t){
        double deltaT = 0.00123;
        if ((t-deltaT)>0)
            return t-0.00123;
        else
            return t;
    }
}
