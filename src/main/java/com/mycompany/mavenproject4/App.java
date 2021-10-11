package com.mycompany.mavenproject4;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.shape.Polygon;

public class App extends Application {
    static int StepL=10;//number of steps

    @Override
    
    public void start(Stage stage) {             
        
        //Building Title
        var label1 = new Label("Building");
        label1.setLayoutX(379);
        label1.setLayoutY(310);
        
        //Shape for grass floor
        Rectangle ground = new Rectangle(0,300,800,800);
        ground.setFill(Color.LIMEGREEN);
        
        //shape for the blue sky
        Rectangle sky = new Rectangle(0,0,800,400);
        sky.setFill(Color.SKYBLUE);
        
        //building base shape
        Rectangle building = new Rectangle(150,200,500,500);
        building.setFill(Color.BROWN);
        building.setStroke(Color.BLACK);
        
        //roof outline shape
        Rectangle roofLower = new Rectangle(150,200,500,40);
        roofLower.setFill(Color.WHITE);
        roofLower.setStroke(Color.BLACK);
        
        //Roof triangle
        Polygon roofTr = new Polygon();
        roofTr.getPoints().addAll(new Double[]{
        130.0, 200.0,
        400.0, 50.0,
        670.0, 200.0 });
        roofTr.setFill(Color.WHITE);
        roofTr.setStroke(Color.BLACK);
        
        //Three Doors spaced equally apart
        Rectangle Door1 = new Rectangle(210,380,80,200);
        Door1.setFill(Color.WHITE);
        Door1.setStroke(Color.BLACK);
        
        Rectangle Door2 = new Rectangle(360,360,80,240);
        Door2.setFill(Color.WHITE);
        Door2.setStroke(Color.BLACK);
        
        Rectangle Door3 = new Rectangle(510,380,80,200);
        Door3.setFill(Color.WHITE);
        Door3.setStroke(Color.BLACK);
        //Plack above middle door
        Rectangle Plackad = new Rectangle(360,300,80,40);
        Plackad.setFill(Color.GRAY);
        Plackad.setStroke(Color.BLACK);
        
        //**
        //Column Building
        //**
        //Floor of outer columns
        Rectangle columnFlr1 = new Rectangle(150,581,50,5);
        columnFlr1.setFill(Color.LIGHTGRAY);
        columnFlr1.setStroke(Color.BLACK);
        
        Rectangle columnFlr2 = new Rectangle(600,581,50,5);
        columnFlr2.setFill(Color.LIGHTGRAY);
        columnFlr2.setStroke(Color.BLACK);
        
        //Four column bases
        Rectangle columnBase1 = new Rectangle(160,571,40,10);
        columnBase1.setFill(Color.WHITE);
        columnBase1.setStroke(Color.BLACK);
        
        Rectangle columnBase2 = new Rectangle(305,571,40,10);
        columnBase2.setFill(Color.WHITE);
        columnBase2.setStroke(Color.BLACK);
        
        Rectangle columnBase3 = new Rectangle(455,571,40,10);
        columnBase3.setFill(Color.WHITE);
        columnBase3.setStroke(Color.BLACK);
        
        Rectangle columnBase4 = new Rectangle(600,571,40,10);
        columnBase4.setFill(Color.WHITE);
        columnBase4.setStroke(Color.BLACK);
           
        //Generate colum1 and its two circles left and right
        Rectangle column1 = new Rectangle(165,240,30,331);
        column1.setFill(Color.WHITE);
        column1.setStroke(Color.BLACK);
        
        Circle columnBallL1 = new Circle(165,255,15);
        columnBallL1.setFill(Color.WHITE);
        columnBallL1.setStroke(Color.BLACK);
        
        Circle columnBallR1 = new Circle(195,255,15);
        columnBallR1.setFill(Color.WHITE);
        columnBallR1.setStroke(Color.BLACK);
        
        //Generate colum2 and its two circles left and right
        Rectangle column2 = new Rectangle(310,240,30,331);
        column2.setFill(Color.WHITE);
        column2.setStroke(Color.BLACK);
        
        Circle columnBallL2 = new Circle(310,255,15);
        columnBallL2.setFill(Color.WHITE);
        columnBallL2.setStroke(Color.BLACK);
        
        Circle columnBallR2 = new Circle(340,255,15);
        columnBallR2.setFill(Color.WHITE);
        columnBallR2.setStroke(Color.BLACK);
        
        
        //Generate colum3 and its two circles left and right
        Rectangle column3 = new Rectangle(460,240,30,331);
        column3.setFill(Color.WHITE);
        column3.setStroke(Color.BLACK);
        
        Circle columnBallL3 = new Circle(460,255,15);
        columnBallL3.setFill(Color.WHITE);
        columnBallL3.setStroke(Color.BLACK);
        
        Circle columnBallR3 = new Circle(490,255,15);
        columnBallR3.setFill(Color.WHITE);
        columnBallR3.setStroke(Color.BLACK);
        
        //Generate colum4 and its two circles left and right
        Rectangle column4 = new Rectangle(605,240,30,331);
        column4.setFill(Color.WHITE);
        column4.setStroke(Color.BLACK);
        
        Circle columnBallL4 = new Circle(605,255,15);
        columnBallL4.setFill(Color.WHITE);
        columnBallL4.setStroke(Color.BLACK);
        
        Circle columnBallR4 = new Circle(635,255,15);
        columnBallR4.setFill(Color.WHITE);
        columnBallR4.setStroke(Color.BLACK);
        
        //Large group holding all components of the house and terrain      
        Group sp= new Group
        (ground,sky,building,roofLower,Door1,Door2,Door3,
        Plackad,label1,columnFlr1,columnFlr2,columnBase1,columnBase2,
        columnBase3,columnBase4,column1,column2,column3,column4,
        columnBallL1,columnBallR1,columnBallL2,columnBallR2,columnBallL3,
        columnBallR3,columnBallL4,columnBallR4,roofTr);

       //Creates The Steps of the building
       Rectangle[] Steps = new Rectangle[StepL];  
        for (int i = 0; i < StepL; i++) {
            Steps[i]= new Rectangle();
            Steps[i].setLayoutX(200-(i*20));
            Steps[i].setLayoutY(580+(i*20));//Succeding rect goes down 20
            Steps[i].setWidth(400+(i*40));
            Steps[i].setHeight(20);        
            Steps[i].setFill(Color.LIGHTGRAY);
            Steps[i].setStroke(Color.BLACK);          
            sp.getChildren().add( Steps[i]);
        }
        //Creates Windows for the left side of the door1
        Rectangle[] WindowsL1 = new Rectangle[5];  
        for (int i = 0; i < 5; i++) {
            WindowsL1[i]= new Rectangle();
            WindowsL1[i].setLayoutX(226);
            if(i==0)WindowsL1[i].setLayoutY(396);
            else WindowsL1[i].setLayoutY(422+(40*(i-1)));   
            if(i==0)WindowsL1[i].setHeight(16);//makes the first window smaller
            else WindowsL1[i].setHeight(32);//all others are larger
            WindowsL1[i].setWidth(16);       
            WindowsL1[i].setFill(Color.BLACK);     
            sp.getChildren().add( WindowsL1[i]);
        }
        //Creates Windows for the right side of the door 1
        Rectangle[] WindowsR1 = new Rectangle[5];  
        for (int i = 0; i < 5; i++) {
            WindowsR1[i]= new Rectangle();
            WindowsR1[i].setLayoutX(258);
            if(i==0)WindowsR1[i].setLayoutY(396);
            else WindowsR1[i].setLayoutY(422+(40*(i-1)));   
            if(i==0)WindowsR1[i].setHeight(16);
            else WindowsR1[i].setHeight(32);
            WindowsR1[i].setWidth(16);          
            WindowsR1[i].setFill(Color.BLACK);   
            sp.getChildren().add( WindowsR1[i]);
        }
        //Creates Windows for the left side of door 2
        Rectangle[] WindowsL2 = new Rectangle[5];  
        for (int i = 0; i < 5; i++) {
            WindowsL2[i]= new Rectangle();
            WindowsL2[i].setLayoutX(376);
            if(i==0)WindowsL2[i].setLayoutY(396);
            else WindowsL2[i].setLayoutY(422+(40*(i-1)));   
            if(i==0)WindowsL2[i].setHeight(16);
            else WindowsL2[i].setHeight(32);
            WindowsL2[i].setWidth(16);
            WindowsL2[i].setFill(Color.BLACK);
            sp.getChildren().add( WindowsL2[i]);
        }
        //Creates Windows for the right side of door 2
        Rectangle[] WindowsR2 = new Rectangle[5];  
        for (int i = 0; i < 5; i++) {
            WindowsR2[i]= new Rectangle();
            WindowsR2[i].setLayoutX(408);
            if(i==0)WindowsR2[i].setLayoutY(396);
            else WindowsR2[i].setLayoutY(422+(40*(i-1)));   
            if(i==0)WindowsR2[i].setHeight(16);
            else WindowsR2[i].setHeight(32);
            WindowsR2[i].setWidth(16);
            WindowsR2[i].setFill(Color.BLACK);
            sp.getChildren().add( WindowsR2[i]);
        }
        //Creates Windows for the left side of door 3
        Rectangle[] WindowsL3 = new Rectangle[5];  
        for (int i = 0; i < 5; i++) {
            WindowsL3[i]= new Rectangle();
            WindowsL3[i].setLayoutX(526);
            if(i==0)WindowsL3[i].setLayoutY(396);
            else WindowsL3[i].setLayoutY(422+(40*(i-1)));   
            if(i==0)WindowsL3[i].setHeight(16);
            else WindowsL3[i].setHeight(32);
            WindowsL3[i].setWidth(16);   
            WindowsL3[i].setFill(Color.BLACK);     
            sp.getChildren().add( WindowsL3[i]);
        }
        //Creates Windows for the Right side of door 3
        Rectangle[] WindowsR3 = new Rectangle[5];  
        for (int i = 0; i < 5; i++) {
            WindowsR3[i]= new Rectangle();
            WindowsR3[i].setLayoutX(558);
            if(i==0)WindowsR3[i].setLayoutY(396);
            else WindowsR3[i].setLayoutY(422+(40*(i-1)));   
            if(i==0)WindowsR3[i].setHeight(16);
            else WindowsR3[i].setHeight(32);
            WindowsR3[i].setWidth(16);   
            WindowsR3[i].setFill(Color.BLACK);    
            sp.getChildren().add( WindowsR3[i]);
        }
  
        var scene = new Scene (sp, 800, 800);
        
        stage.setScene(scene);
        stage.setTitle("A House");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
