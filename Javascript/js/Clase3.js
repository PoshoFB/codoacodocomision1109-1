// let nombre = prompt("ingresa tu nombre");
let miDiv = document.getElementById("principal");
// miDiv.innerHTML="Hola "+nombre;

let btn = document.getElementById("btn");
btn.addEventListener('click',sumar);

function sumar(){
    // let num = parseInt(prompt("ingresa tu primer numero!"));
    // let num2 = parseInt(prompt("ingresa tu segundo numero!"));
    let num = parseFloat(prompt("ingresa tu primer numero!"));
    let num2 = parseFloat(prompt("ingresa tu segundo numero!"));
    let op = prompt("Escribi la operacion a realizar \n + para sumar \n - para restar \n * para multiplicar \n / para dividir")
    let resultado=0;
    switch (op) {
        case "+":
            resultado = num + num2;
            miDiv.innerHTML +="<p> El resultado de la Suma de "+num +" y "+num2+ " es: " + resultado + "</p>";
            break;
        case "-":
            resultado = num - num2;
            miDiv.innerHTML +="<p> El resultado de la Resta de "+num +" y "+num2+ " es: " + resultado + "</p>";
            break;
        case "/":
            resultado = num / num2;
            miDiv.innerHTML +="<p> El resultado de la División de "+num +" y "+num2+ " es: " + resultado + "</p>";
            break;
        case "*":
                resultado = num * num2;
                miDiv.innerHTML +="<p> El resultado de la Multiplicación de "+num +" y "+num2+ " es: " + resultado + "</p>";
                break;
        default:

            break;
    }

}