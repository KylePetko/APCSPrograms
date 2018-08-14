public void numberOfDiagZeros(int[][]grid) {
        int northwest,northeast,southwest,southeast;
        int[][] temp= new int[NUM][NUM];
        for (row=0;row<NUM;row++){
        for (col=0;col<NUM;col++){
        temp[row][col]= grid[row][col];
        }        int row, col;

        }
        for (row=0;row<NUM;row++) {
        for (col=0;col<NUM;col++) {
        northwest=0;
        northeast=0;
        southwest=0;
        southeast=0;
        if ((row<NUM-1)&&(col<NUM-1)){
        if(temp[row+1][col+1]==0){
        southeast++;
        }

        }//System.out.println("SE" + southeast);
        if ((row<NUM-1)&&(col>0)){
        if(temp[row+1][col-1]==0){
        southwest++;
        }

        }//System.out.println("SW" + southwest);
        if ((row>0)&&(col>0)){
        if(temp[row-1][col-1]==0){
        northwest++;
        }

        }//System.out.println("NW" + northwest);
        if ((row>0)&&(col<NUM-1)){
        if(temp[row-1][col+1]==0){
        northeast++;
        }

        }//System.out.println("NE" + northeast);
        grid[row][col]=northwest+northeast+southwest+southeast;
        }
        }
        }