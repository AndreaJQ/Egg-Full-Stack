// función que se ejecuta cuando se hace clic en el botón
$('#btn-click').click(function() {
    // muestra la frase para seleccionar una opción
    $('#frase').text('Selecciona la frase que más te guste');
    // muestra las opciones de frases
    $('#opciones').removeClass('d-none');
  });

  // función que se ejecuta cuando se hace clic en una opción
  $('#opcion-1, #opcion-2, #opcion-3').click(function() {
    // oculta las opciones de frases
    $('#opciones').addClass('d-none');
    // muestra la opción seleccionada
    $('#frase').text($(this).text());
  });