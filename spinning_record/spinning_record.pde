 import ddf.minim.*;
  PImage record; 
  Minim minim;
  AudioPlayer song;
int rotate_amount = 10;
void setup(){
size(900,780); 
record= loadImage("record.png");
minim = new Minim(this);  
song = minim.loadFile("goat.mp3", 512);
}

void draw(){
  if(mousePressed){
  rotateImage(record,rotate_amount);
  image(record, 0, 0);
  rotate_amount += 10;
song.play();
song.pause();
  }
}
void rotateImage(PImage image, int amountToRotate) {
     translate(width/2, height/2);
     rotate(amountToRotate*TWO_PI/360);
     translate(-image.width/2, -image.height/2);
}