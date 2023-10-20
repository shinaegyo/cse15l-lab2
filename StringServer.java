import java.io.IOException;
import java.net.URI;

class Handler implements URLHandler {
  private String letters = "";
  private int num = 0;

   public String handleRequest(URI url) {
        if (url.getPath().equals("/add-message")) {
          String[] parameters = url.getQuery().split("=");
                if (parameters[0].equals("s")) {
                    num++;
                    letters += num + ". " + parameters[1] + "\n";
                    return letters;
                } else {
                  return "Invalid response";
                }
           } else {
          return "404 Not Found!";
        }
    }
}

class StringServer {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}
