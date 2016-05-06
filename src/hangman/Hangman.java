/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.text.StyleConstants.Background;

/**
 *
 * @author USER
 */
public class Hangman extends JPanel  implements ActionListener{
    public int x;
    public int y;
    public double z,p,h;
    private Timer timer;
    public double v;
    public Hangman() {
        this.v=30;
        this.x=30;
        this.y=30;
        this.timer=new Timer (20,this);
        this.timer.start();
        this.z=30;
        this.p=30;
        this.h=30;
    }
    
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.GREEN);
        g.drawOval(05, 500, 30, 20);
        g.setColor(new Color(185,105,105));
        g.drawLine(10, 10, 10, 500);
        g.drawLine(10, 10, 100, 10);
        g.drawLine(100, 10, (int) (this.v+80), this.y+10);
        g.setColor(new Color(255,200,200));
        g.drawOval((int) (this.v+65),this.y+10,30,30);
        g.drawLine((int) (this.v+80), this.y+40,(int) this.z+80, this.y+50);
        Polygon torso=new Polygon();
        torso.addPoint((int) (this.v+65), this.y+50);
        torso.addPoint((int) (this.v+95), this.y+50);
        torso.addPoint((int) (this.z+95), this.y+100);
        torso.addPoint((int) (this.z+65), this.y+100);
        g.fillPolygon(torso);
        g.setColor(Color.GREEN);
        Polygon poligono= new Polygon();
        poligono.addPoint((int) (this.z+65), this.y+100);
        poligono.addPoint((int) (this.z+80), this.y+100);
        poligono.addPoint((int) (this.p+80), this.y+170);
        poligono.addPoint((int) (this.p+65), this.y+170);
        g.fillPolygon(poligono);
         Polygon poligon= new Polygon();
        poligon.addPoint((int) (this.z+80), this.y+100);
        poligon.addPoint((int) (this.z+95), this.y+100);
        poligon.addPoint((int) (this.p+95), this.y+170);
        poligon.addPoint((int) (this.p+80), this.y+170);
        g.fillPolygon(poligon);
        g.setColor(new Color(255,200,200));
         Polygon brazoDerecho= new Polygon();
        brazoDerecho.addPoint((int) (this.v+45), this.y+50);
        brazoDerecho.addPoint((int) (this.v+65), this.y+50);
        brazoDerecho.addPoint((int) (this.h+65), this.y+60);
        brazoDerecho.addPoint((int) (this.h+45), this.y+60);
        g.fillPolygon(brazoDerecho);
        Polygon brazo= new Polygon();
        brazo.addPoint((int) (this.v+95), this.y+50);
        brazo.addPoint((int) (this.v+115), this.y+50);
        brazo.addPoint((int) (this.h+115), this.y+60);
        brazo.addPoint((int) (this.h+95), this.y+60);
        g.fillPolygon(brazo);
        g.fillOval((int) (this.p+65), this.y+170, 15, 15);
        g.fillOval((int) (this.p+80), this.y+170, 15, 15);
        
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.x+=1;
        double radianes= (double) Math.toRadians(x);
        v= (40* Math.sin(radianes));
        z=((45* Math.sin(radianes)));
        h=(42*Math.sin(radianes));
        p=(50*Math.sin(radianes));
        this.y+=0;
        
        
        System.out.println( Math.cos(radianes));
        System.out.println(z);
        repaint();
        
       
          
      
        
    }
    

   
    }
    
    

