function Carro(){
  var marca = "Tesla";
  var modelo = [2019,2020];

function mostrarMarca(){
  console.log(marca);
}

function desplegarModelos (){
  modelo.forEach(function(modelo){
    console.log(modelo)});
}

return {
  mostrarMarca: mostrarMarca,
  desplegarModelos: desplegarModelos
    };
 
}
var carro = Carro();

console.log(carro);
carro.mostrarMarca();
carro.desplegarModelos();