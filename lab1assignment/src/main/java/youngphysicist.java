public class youngphysicist {

    public boolean sumOfForces(int no, int [][]arr){

        if ( no<1 || no>100) {
            return false;
        }

        int sumOfForces=0;

        for (int i=0; i<no; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] <= -101 || arr[i][j] >= 101){
                    return false;
                }
            }
        }

        for (int j=0; j<3; j++) {
            for (int k = 0; k < no; k++){
                sumOfForces = sumOfForces + arr[k][j];
            }
            if (sumOfForces != 0) {
                return false;
            }
        }
        return true;
    }
}
