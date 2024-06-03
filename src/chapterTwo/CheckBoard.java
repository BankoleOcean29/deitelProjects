package chapterTwo;

public class CheckBoard {



    public static String squareFillPattern2() {
        StringBuilder stringBuilder = new StringBuilder();

        String characterFormat = """
                * * * * * *
                """;

        for(int counter = 1; counter <= 6; counter++){
            stringBuilder.append(characterFormat);
        }
        return stringBuilder.toString();

    }


    public static String squareFillPattern(char asterisk) {
        String space = " ";
        StringBuilder stringBuilder = new StringBuilder();

        for(int outerCounter = 1; outerCounter <= 6; outerCounter++){
            for(int counter = 1; counter <= 11; counter++){
                if(counter % 2 == 1)
                    stringBuilder.append(asterisk);
                else
                    stringBuilder.append(space);
            }

            stringBuilder.append(System.lineSeparator());
        }

        return stringBuilder.toString();
    }


    public static String numberTriangular(char one, char two, char three, char four){
        String space = " ";
        StringBuilder stringBuilder = new StringBuilder();

        for(int counter = 0; counter < 7; counter++){
            if(counter == 4)
                stringBuilder.append(one);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for(int counter = 0; counter < 7; counter++){
            if(counter == 3 || counter == 5)
                stringBuilder.append(two);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for(int counter = 0; counter < 7; counter++){
            if(counter == 2 || counter == 4 || counter == 6)
                stringBuilder.append(three);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for(int counter = 0; counter <= 7; counter++){
            if(counter == 1 || counter == 3 || counter == 5 || counter == 7)
                stringBuilder.append(four);
            else
                stringBuilder.append(space);
        }
         return stringBuilder.toString();
    }


    public static String squareHollowPattern(char asterisk){
        String space = " ";
        StringBuilder stringBuilder = new StringBuilder();

        for(int counter = 0; counter < 9; counter++){
            if(counter % 2 == 0)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }


        for(int outerCounter = 1; outerCounter <= 4; outerCounter++)
        {
            stringBuilder.append(System.lineSeparator());
            for(int counter = 0; counter < 9; counter++) {
            if (counter == 0 || counter == 8)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }
        }

        stringBuilder.append(System.lineSeparator());
        for(int counter = 0; counter < 9; counter++){
            if(counter % 2 == 0)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }

        return stringBuilder.toString();
    }


    public static String numberIncreasingPyramid(char one, char two, char three, char four) {
        String space = " ";
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(one);
        stringBuilder.append(System.lineSeparator());

        for(int counter = 0; counter < 3; counter++){
            if (counter == 0)
                stringBuilder.append(one);
            if (counter == 1)
                stringBuilder.append(space);
            if (counter == 2)
                stringBuilder.append(two);
        }

        stringBuilder.append(System.lineSeparator());

        for(int counter = 0; counter < 5; counter++){
            if (counter == 0)
                stringBuilder.append(one);
            if (counter == 1 || counter == 3)
                stringBuilder.append(space);
            if (counter == 2)
                stringBuilder.append(two);
            if (counter == 4)
                stringBuilder.append(three);
        }

        stringBuilder.append(System.lineSeparator());

        for(int counter = 0; counter < 7; counter++){
            if (counter == 0)
                stringBuilder.append(one);
            if (counter == 1 || counter == 3 || counter == 5)
                stringBuilder.append(space);
            if (counter == 2)
                stringBuilder.append(two);
            if (counter == 4)
                stringBuilder.append(three);
            if (counter == 5)
                stringBuilder.append(four);
        }

        return stringBuilder.toString();
    }



    public static String numberIncreasingReversePyramid(char one, char two, char three, char four) {
        String space = " ";
        StringBuilder stringBuilder = new StringBuilder();

        for(int counter = 0; counter < 7; counter++){
            if (counter == 0)
                stringBuilder.append(one);
            if (counter == 1 || counter == 3 || counter == 5)
                stringBuilder.append(space);
            if (counter == 2)
                stringBuilder.append(two);
            if (counter == 4)
                stringBuilder.append(three);
            if (counter == 5)
                stringBuilder.append(four);
        }

        stringBuilder.append(System.lineSeparator());

        for(int counter = 0; counter < 5; counter++){
            if (counter == 0)
                stringBuilder.append(one);
            if (counter == 1 || counter == 3)
                stringBuilder.append(space);
            if (counter == 2)
                stringBuilder.append(two);
            if (counter == 4)
                stringBuilder.append(three);
        }

        stringBuilder.append(System.lineSeparator());

        for(int counter = 0; counter < 3; counter++){
            if (counter == 0)
                stringBuilder.append(one);
            if (counter == 1)
                stringBuilder.append(space);
            if (counter == 2)
                stringBuilder.append(two);
        }

        stringBuilder.append(System.lineSeparator());

        stringBuilder.append(one);

        return stringBuilder.toString();


    }
}

