import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Algorithm {

    public static void main(String[] args) throws IOException {
        String inputFile = System.getenv("INPUT_FILE");
        String tokenFile = System.getenv("TOKEN_FILE");
        String dataUri = System.getenv("DATABASE_URI");
        String outputFile = System.getenv("OUTPUT_FILE");

        // Read input from inputfile....

        // Read data from DATABASE_URI....

        // Write output
        String str = "Hello";
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
        writer.write(str);

        writer.close();
    }

}
