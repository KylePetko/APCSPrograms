// Name: Kyle Petkovic
//
// Program File: CrapsGame
//
// Class Description: implements the logic of craps



// Implements the game of Craps logic

public class CrapsGame
{
    private int point = 0;
    private boolean firstRun = true;


    /**
     *  Calculates the result of the next dice roll in the Craps game.
     *  The parameter total is the sum of dots on two dice.
     *  point is set to the saved total, if the game continues,
     *  or 0, if the game has ended.
     *  Returns 1 if player won, -1 if player lost,
     *  0 if player continues rolling.
     */

    public int processRoll(int total)
    {

            switch(total){
                case 2:

                    if(firstRun){
                        point = 0;
                        return -1;
                    }


                case 3:

                    if(firstRun){
                        point = 0;
                        return -1;
                    }

                case 4:
                        if(firstRun)
                            point = 4;
                        if(point == total && !firstRun){
                            firstRun = true;
                            return 1;
                        }

                        else {
                            firstRun = false;
                            return 0;
                        }


                case 5:
                    if(firstRun)
                        point = 5;
                    if(point == total && !firstRun){
                        firstRun = true;
                        return 1;
                    }
                    else {
                        firstRun = false;
                        return 0;
                    }

                case 6:if(firstRun)
                    point = 6;
                    if(point == total && !firstRun){
                        firstRun = true;
                        return 1;
                    }
                    else {
                        firstRun = false;
                        return 0;
                    }


                case 7:
                    if(firstRun){
                        point = 0;
                        return 1;
                    }

                        firstRun = true;
                        point = 0;
                        return -1;



                    case 8:
                        if(firstRun)
                        point = 8;

                        if(point == total && !firstRun){
                            firstRun = true;
                            return 1;
                        }
                        else {
                            firstRun = false;
                            return 0;
                        }

                case 9: if(firstRun)
                    point =9;
                    if(point == total && !firstRun){
                        firstRun = true;
                        return 1;
                    }
                    else {
                        firstRun = false;
                        return 0;
                    }

                case 10:if(firstRun)
                    point = 10;
                    if(point == total && !firstRun){
                        firstRun = true;
                        return 1;
                    }
                    else {
                        firstRun = false;
                        return 0;
                    }

                case 11:

                    if(firstRun){
                        point = 0;
                        return 1;
                    }

                case 12:

                    if(firstRun){
                        point = 0;
                        return -1;
                    }

                default: return 0;
               

            }
        
    }

    /**
     *  Returns the saved point
     */
    public int getPoint()
    {
        return point;
    }
}

