import java.net.*;
import java.io.*;

public class Client1
{
    public static void main(String A[]) throws Exception
    {
        System.out.println("Client application is running...");// No use just to display for user

        Socket s = new Socket("localhost",2100);
        System.out.println("Client is waiting for the server to accept the request");

        PrintStream ps = new PrintStream(s.getOutputStream()); // ha bolnara s ha client cha object aahe, tyachyashi bolnyasathi


        BufferedReader br1 = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

        // line no 16 17 client la bolayala aani server la aikayala objects

        String str1, str2;

        while(!(str1 = br2.readLine()).equals("end"))
        {
            ps.println(str1);
            System.out.print("Enter message for server : ");
            str2 = br1.readLine();
            System.out.println("Server says : "+str2);
        }


    }
}