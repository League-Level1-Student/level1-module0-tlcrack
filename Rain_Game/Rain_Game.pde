  int rainY = 10;
  int randomNumber = (int) random(1000);
void setup(){
size(1000, 1000);

}

void draw(){
  background(0, 215, 200);
 
  fill(0, 50, 200);
stroke(0, 100, 200);
ellipse(randomNumber, rainY, 30, 60);
 rect(mouseX,940, 100, 40);
rainY += 10;
if(rainY==1000){
randomNumber = (int) random(1000);
  rainY = 10;
}
if(rainY==940&&randomNumber>mouseX&&randomNumber<mouseX+100){
randomNumber = (int) random(1000);
  rainY = 10;
}
void checkCatch(int x){
     if (x > mouseX && x < mouseX+100)
          score++;
     else if (score > 0) 
          score--;
     println("Your score is now: " + score); }
}