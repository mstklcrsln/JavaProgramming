package day40_FinalKeyword;

import day39_Inheritence_Encapsulation.shape.Circle;
import day39_Inheritence_Encapsulation.shape.Square;

public class EncapsulationReview {

    private Circle circle;

    private Square square;

    // to generate getter
    public Circle getCircle (){
        return circle;
    }
    // to generate setter
    public void setCircle (Circle circle){
        if (circle.getRadius()<5){
            return;
        }
        this.circle= circle;
    }

    public Square getSquare() {
        return square;
    }

    public void setSquare(Square square) {
        this.square = square;
    }
}
