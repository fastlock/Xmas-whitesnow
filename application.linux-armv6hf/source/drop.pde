class drop{
  float x;
  float y;
  float z;
  float grav=0.001;
  float speed;
  float len;
  void drop(){
    x=random(width);
    y=random(height);
    z=random(0,20);
    len=map(z,0 ,20 , 0,10);
    speed=map(z,0,20,0,10);
    
  }
  void fall(){
    y=y+speed;
    speed=speed+grav;
    if(y>height){
      y=random(-100,-50);
    }
      
      
  }
  void show(){
      stroke(250);
      strokeWeight(z);
      line(x,y,x,y+10);
  }
}