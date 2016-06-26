import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by abc on 6/23/2016.
 */
import java.util.Arrays;
import java.util.Scanner;
public class Score {
 //  public static void main(String[] args) {
/**
 * Holds the homework scores for a student.
 */
            double[] scores;
            int currentSize; // The currentSize of the array of scores.
            /**
             * @param maxScores the maximum number of scores this object can hold.
             */
             public Score(int maxScores)
            {
                scores = new double[maxScores];
                currentSize = 0;
            }

    public double sumScores() {
        double sum=0;
        for(int i=0;i<currentSize;i++){
            sum=sum+scores[i];
        }

        return sum;
    }



    public void readScores(Scanner userInput)
            {
                // YOUR CODE HERE
                // Read (userInput) scores between 0 and 100 until a non number is entered.
                // Use the scanner passed in in the argument userInput.
                // Save each score that is read in the partially filled scores array.
                // Make sure not to lose track of how filled the array is.
                while(userInput.hasNextDouble()){
                    double nextScore =userInput.nextDouble();
                    scores[currentSize]=nextScore;
                    currentSize++;
                }
            }
            public String toString()
            {
                return Arrays.toString(Arrays.copyOf(scores, currentSize));
            }

    public static void main(String[] args) {

    }
        }

