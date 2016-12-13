//white snow
drop gocce[]= new drop [600];
void setup(){
  size(1920,1080);
  background(100);
  for(int i=0;i<600;i++){
    gocce[i]=new drop();
    gocce[i].drop();
  }
  
  
}
void draw(){
  clear();
  
  for(int i=0;i<600;i++){
    gocce[i].fall();
    gocce[i].show();
  }

}