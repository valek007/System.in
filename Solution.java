import java.io.*;

public class Solution{

    public static void main(String[] args) throws IOException {

        String greetings = "Hi my Friend! \nYou will be the next Junior Developer! \nGood Luck! \n";

        byte[] bytes = greetings.getBytes();

        InputStream inputStream = new ByteArrayInputStream(bytes);

        System.setIn(inputStream);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s;

        while((s = reader.readLine())!=null){

            System.out.println(s);
        }
    }
}