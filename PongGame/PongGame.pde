import ddf.minim.*;  
Minim minim;
AudioSample sound;
PImage backgroundImage;
import ddf.minim.*;
import ddf.minim.analysis.*;
import ddf.minim.effects.*;
import ddf.minim.signals.*;
import ddf.minim.spi.*;
import ddf.minim.ugens.*;


int ballX = 200;
int Xspeed = 10;
int ballY = 100;
int Yspeed = 10;
void setup(){
  size(900, 900);
minim = new Minim (this);
sound = minim.loadSample("pong.wav", 128);
backgroundImage = loadImage("image.jpg");
}

void draw(){

background(0,0,0);
  ballX+=Xspeed;
  ballY+=Yspeed;
  fill(217, 224, 32);
stroke(217, 224, 32);
ellipse(ballX, ballY, 50, 50);
if(ballX>=width-25){
  Xspeed = -Xspeed;
  ballY =ballY-10;
}
if(ballX<=25){
   Xspeed = -Xspeed;
    ballY =ballY-10;
}

if(ballY>=height-25){
//end game
}
if(ballY<=25){
   Yspeed = -Yspeed;
    ballX =ballX-10;

}
rect(mouseX, width-100, 100, 30);
intersects(ballX,ballY,mouseX,width-100,100);
}

boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
     if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength)
          return true;
     else 
          return false;
}