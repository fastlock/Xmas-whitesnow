import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class whitesnow extends PApplet {

//white snow
drop gocce[]= new drop [600];
public void setup(){
  
  background(100);
  for(int i=0;i<600;i++){
    gocce[i]=new drop();
    gocce[i].drop();
  }
  
  
}
public void draw(){
  clear();
  
  for(int i=0;i<600;i++){
    gocce[i].fall();
    gocce[i].show();
  }

}
class drop{
  float x;
  float y;
  float z;
  float grav=0.001f;
  float speed;
  float len;
  public void drop(){
    x=random(width);
    y=random(height);
    z=random(0,20);
    len=map(z,0 ,20 , 0,10);
    speed=map(z,0,20,0,10);
    
  }
  public void fall(){
    y=y+speed;
    speed=speed+grav;
    if(y>height){
      y=random(-100,-50);
    }
      
      
  }
  public void show(){
      stroke(250);
      strokeWeight(z);
      line(x,y,x,y+10);
  }
}
  public void settings() {  size(1920,1080); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "--present", "--window-color=#666666", "--stop-color=#FF0000", "whitesnow" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
