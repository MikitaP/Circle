package by.epam.module2.calc;

import by.epam.module2.figure.Circle;
import java.util.ArrayList;
import static java.lang.Math.*;

public class Calculate {
    public static ArrayList<Circle> calcLength(ArrayList<Circle> inputList) {
        ArrayList<Circle> listLength = new ArrayList<>();
        for (Circle circle : inputList) {
            listLength.add(new Circle(2 * PI * circle.getRadius()));
        }
        return listLength;
    }

    public static ArrayList<Circle> calcSquare(ArrayList<Circle> inputList) {
        ArrayList<Circle> listSquare = new ArrayList<>();
        for (Circle circle : inputList) {
            listSquare.add(new Circle(PI * pow(circle.getRadius(), 2)));
        }
        return listSquare;
    }
}