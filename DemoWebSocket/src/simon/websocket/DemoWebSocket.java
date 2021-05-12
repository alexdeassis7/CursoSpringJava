package simon.websocket;

import javax.websocket.OnMessage;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/mensaje")//define el punto de acceso al web sockect , osea la ruta "/mensaje"
public class DemoWebSocket {

	@OnMessage
	// se encarga de definir el metodo del servidor 
	//que se ejecutara cuando llegue un mensaje desde el cliente via webSocke ct
	public String mensaje(String mensaje) {
		System.out.println("hola hola hola ");
		return "hola ammeeegooo" + mensaje + " ...."; 
	}
}
