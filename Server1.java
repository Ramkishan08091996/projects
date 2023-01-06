import java.net.*;
import java.io.*;

public class Server1 
{
    public static void main(String A[]) throws Exception
    {
        System.out.println("Server application is running...");// No use just to display for user


        ServerSocket ss = new ServerSocket(2100);
        System.out.println("Server is running at port no 2100 and waiting for client request");

        Socket s = ss.accept();  // client chi request server accept kartoy
        System.out.println("Request of client gets accepted");

        PrintStream ps = new PrintStream(s.getOutputStream()); // ha bolnara s ha client cha object aahe, tyachyashi bolnyasathi

        BufferedReader br1 = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        // line no 19 20 client la bolayala aani server la aikayala objects

        
        String str1, str2;

        while((str1 = br1.readLine()) != null)
        {
            System.out.println("Client says : "+str1);
            System.out.print("Enter message for client : ");
            str2 = br2.readLine();
            ps.println(str2);
        }

    }
}