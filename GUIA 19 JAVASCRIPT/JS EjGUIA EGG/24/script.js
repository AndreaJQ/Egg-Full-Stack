function btnCalcularHandler(){
    let area = $('#inputArea').val();
    let perimetro = $('#inputPerimetro').val();
    let radio = 0;
    if (perimetro != "" && area != ""){
        alert("Debe ingresar solo un campo, elija entre el AREA y el PERIMETRO para calcular el radio");
        return;
    }
    if (perimetro != ""){
        radio = perimetro / (2 * Math.PI);
    } else if(area != ""){
        radio = Math.sqrt(area / Math.PI);
    } else {
        alert("Debe ingresar al menos un campo para calcular el radio(elija entre AREA o PERIMETRO")
    }
    $('#inputRadio').val(radio.toFixed(2)); //para limitarlo a solo dos decimales
}


$('#btnCalcular').click(btnCalcularHandler);