package by.epam.module2.main;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import by.epam.module2.figure.Circle;
import by.epam.module2.reader.Input;
import by.epam.module2.calc.Calculate;
import by.epam.module2.writer.Write;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Circle> inputList = Input.readFile();

        //System.out.println(Calculate.calcLength(inputList));
        //System.out.println(Calculate.calcSquare(inputList));
        Write.writeFile(inputList,Calculate.calcLength(inputList),Calculate.calcSquare(inputList));

    }
}