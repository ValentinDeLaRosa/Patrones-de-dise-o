function Jugador(){
  var Raza = "Elfo";
  var Clase = "Paladín"
  var Armas = ["Mazo","Escudo"];

function mostrarClase(){
  console.log(Clase);
}

function mostrarRaza(){
  console.log(Raza);
}


function mostrarArmas (){
  Armas.forEach(function(Armas){
    console.log(Armas)});
}

return {
  mostrarRaza: mostrarRaza,
  mostrarClase: mostrarClase, 
  mostrarArmas :mostrarArmas
    };
 
}
var jugador = Jugador();

//console.log(carro);
jugador.mostrarClase();
jugador.mostrarRaza();
jugador.mostrarArmas();