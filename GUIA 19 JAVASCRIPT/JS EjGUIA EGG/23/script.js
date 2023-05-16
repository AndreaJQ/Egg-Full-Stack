let palabrasHandler = function(pal){
    return (pal.length>8) ? `<span class="resaltar">${pal}</span>` : pal;
  }
  
  // función que se ejecuta cuando se hace clic en el botón
  $('#btn-click').click(function() {
      let p = document.getElementById('frase');
      let array = p.innerText.split(" ").map(pal => palabrasHandler(pal))
      p.innerHTML = array.join(" ");
  })