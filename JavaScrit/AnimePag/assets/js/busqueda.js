const $formulario = document.querySelector("form");


$formulario.addEventListener("submit", (e) => {
    e.preventDefault();

    /* console.log("botón"); */

    const $busqueda = document.querySelector("input").value
    console.log($busqueda);

    window.location.href = `busqueda.html?nombre=${$busqueda}`


});