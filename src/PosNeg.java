public class PosNeg {
    boolean posNeg(int a, int b, boolean negative){
        boolean retrieval = false;

        if (negative) {
            if ((a * b) < 0) {
                //one is positive and the other negative
                retrieval = false;
            }
            else {
                // either they're both positive or negative
                if (a < 0) {
                    // both numbers are negative
                    retrieval = true;
                }
                else {
                    retrieval = false;
                }
            }
        }
        else {
            retrieval = ((a * b) < 0);
        }
        return retrieval;
    }
}
