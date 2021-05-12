<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<!-- <script type="text/javascript" src="jquery-1.11.0.js"></script> -->
<script src="https://code.jquery.com/jquery-1.11.0.min.js"
	integrity="sha256-spTpc4lvj4dOkKjrGokIrHkJgNA0xMS98Pw9N7ir9oI="
	crossorigin="anonymous"></script>
<script>
// 	$(document).ready(fuction(){
// 			var uriWS ="ws://localhost:8080/DemoWebSocket/mensaje";
// 			var miWebSocket = new WebSocket(uriWS);
// 			console.log(miWebSocket);
// 			console.dir(miWebSocket);
			
// 			miWebSocket.onopen = fuction(evento){
// 				console.log("abierto ....");
				
// 				miWebSocket.send("hola");
// 			}
			
// 			miWebSocket.onmessage = fuction(evento){
// 				console.log(evento.data);
				
// 			}
	
// 	});
	
	
	
	//segundo test
var ws = null;
 
function connect() {
	var URL = 'ws://localhost:8081/DemoWebSocket/mensaje';
	if ('WebSocket' in window) {
		ws = new WebSocket(URL);
	} else if ('MozWebSocket' in window) {
		ws = new MozWebSocket(URL);
	} else {
		alert('Tu navegador no soporta WebSockets');
		return;
	}
	ws.onopen = function () {
		// pintamos mensaje
// 		addMessage('Concectado!');
		console.log("abierto ....");
				
				ws.send("hola");
	};
	ws.onmessage = function (event) {
		var message = event.data;
		// pintamos mensaje
		document.write(message);
	};
	ws.onclose = function () {
		// pintamos mensaje
		document.write('Desconectado!');
	};

	ws.onerror = function(event) {
			document.write('Se produjo un error! ');
		};
	}

	function disconnect() {
		if (ws != null) {
			ws.close();
			ws = null;
		}
	}

	function sendMessage(message) {
		if (ws != null) {
			ws.send(message);
		}
	}
	connect()
</script>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

</body>
</html>