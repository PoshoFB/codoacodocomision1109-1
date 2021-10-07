// Ejemplo de Bucle Anidado
for (i=0;i<10;i++){
    for (j=0;j<10;j++) {
    document.write(i + "-" + j + " <br>");
    }
    document.write("<br>");
}


// Ejemplo de tablas de multiplicar con Bucle FOR
for(i=1;i<10;i++){
    document.write("<br><b>La tabla del " + i + ":</b><br>");
    for(j=0;j<10;j++){
      document.write(i+"x"+j+" : ");
      document.write(i*j);
      document.write("<br>");
    }
}