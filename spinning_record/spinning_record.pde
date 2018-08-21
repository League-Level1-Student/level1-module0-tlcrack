  PImage record;     
int rotate_amount = 20;
void setup(){
size(900,780); 
record= loadImage("record.png");

}

void draw(){
  rotateImage(record,rotate_amount);
  image(record, 0, 0);
  rotate_amount
}
void rotateImage(PImage image, int amountToRotate) {
     translate(width/2, height/2);
     rotate(amountToRotate*TWO_PI/360);
     translate(-image.width/2, -image.height/2);
}