import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

// Class to Handle Client Operations

public class Server {

    public static void main(String[] args) {

        // Initializing Input and Output Streams
        DataInputStream input = null;
        DataOutputStream output = null;
        Scanner sc = new Scanner(System.in);

        try {
            
            // Creating a socket connection and connecting to the localhost server on port 5000
            Socket client = new Socket("localhost", 5000);

            // Setup the Input and Output Streams
            input = new DataInputStream(client.getInputStream());
            output = new DataOutputStream(client.getOutputStream());

            String data = "";

            // Loop to get input and send to the server
            while(!data.equals("exit")){
                data = sc.nextLine();
                output.writeUTF(data);
            }

        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}