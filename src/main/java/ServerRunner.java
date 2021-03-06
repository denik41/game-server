import netty.NettyServer;
import org.apache.log4j.Logger;

public class ServerRunner {

    private final static int PORT = 8888;

    private static Logger logger = Logger.getLogger(ServerRunner.class);

    public static void main(String [] args){
        NettyServer server = new NettyServer();
        server.initServer();
        try {
            server.startServer(PORT);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        logger.info("Server started");
        System.out.println("Server started");
    }

}
