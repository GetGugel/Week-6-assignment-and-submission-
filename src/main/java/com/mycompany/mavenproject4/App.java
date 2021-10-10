package com.mycompany.mavenproject4;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;



public class App extends Application {

    @Override
    
    public void start(Stage stage) {
        var javaVersion = SystemInfo.javaVersion();
        var javafxVersion = SystemInfo.javafxVersion();
       
                  
        

        var label1 = new Label("Hello, Brett" + javafxVersion +
                ", running on Java " + javaVersion + ".");
        var labell2 = new Label("34567");
        
        Rectangle floorRec1 = new Rectangle(0,300,800,800);
        floorRec1.setFill(Color.LIGHTGREEN);
        
        Rectangle floorRec2 = new Rectangle(0,0,800,300);
        floorRec2.setFill(Color.LAVENDER);
        
        Rectangle floorRec3 = new Rectangle(150,200,500,500);
        floorRec3.setFill(Color.BROWN);
        

        Line ln1 = new Line(400,400,600,600);
        Line ln2 = new Line(600,600,400,600);
        Line ln3 = new Line(400,400,400,600);
       
        labell2.setLayoutX(100);
        labell2.setLayoutY(100);
             
        Group sp= new Group(label1,labell2,ln1, 
                ln2,ln3,floorRec1,floorRec2,floorRec3);
        
       /* Rectangle[] Steps = new Rectangle[5];    
        for (int i = 0; i < 10; i++) {
            int lengthS=0;
            lengthS+=10;
            Steps[i] = new Rectangle(180,600,(430),20);
            Steps[i].setFill(Color.WHITE);
            sp.getChildren().add(Steps[i]);
        }
*/
       Rectangle[] Steps = new Rectangle[5];    
        for (int i = 0; i < 10; i++) {
            Steps[i]= new Rectangle();
            Steps[i].setLayoutX(180);
            Steps[i].setLayoutY(600);
            Steps[i].setWidth(430+(i));
            Steps[i].setHeight(600);
            
            
            Steps[i].setFill(Color.WHITE);
            sp.getChildren().add(Steps[i]);
        }
       
       
       
       
  
       /* Button[] svrlBtns= new Button[5];
        for (int i = 0; i < 5; i++) {
            svrlBtns[i] = new Button();
            svrlBtns[i].setLayoutX(500+(i*20));
            svrlBtns[i].setLayoutY(500+(i*20));
            
            svrlBtns[i].setText("BRN "+i);
            
            sp.getChildren().add(svrlBtns[i]);
        }*/
        
        var scene = new Scene (sp, 800, 800);
        
        stage.setScene(scene);
        stage.setTitle("My first Gui APP");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
