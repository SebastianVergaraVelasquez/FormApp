const form = document.querySelector('form');  //Se extrae del DOM el formulario
const guardado = document.querySelector('#infoPosted'); //Contenedor que va a mostrar la información enviada a la api

form.addEventListener("submit", enviarFormulario) //Evento click de tipo submit que se acciona al interactuar con el botón del formulario

async function enviarFormulario(e) {
    e.preventDefault();

    const user = Object.fromEntries(new FormData(form)); //se convierte en un objeto usando las claves (name) y valores de los input
    const respuesta = await post(user); //se hace la petición al backend a través de la url, se resuelve el post y se obtiene el usuario como JSON
    //A continuación se muestra en pantalla la información contenida en el JSON accediendo a sus atributos
    guardado.innerHTML = /*html*/`    
        <div>
            <label for="inputEmail3" class="col-sm-2 col-form-label">Información registrada :D</label>
        </div>
        <div class="row mb-3">
            <label for="inputEmail3" class="col-sm-2 col-form-label">Titulo</label>
            <div class="col-sm-10">
                <input value="${respuesta.titulo}" name="titulo" type="text" class="form-control">
            </div>
        </div>
        <div class="row mb-3">
            <label for="inputPassword3" class="col-sm-2 col-form-label">Nombre</label>
            <div class="col-sm-10">
                <input value="${respuesta.nombre}" name="nombre" type="text" class="form-control">
            </div>
        </div>
        <div class="row mb-3">
            <label for="inputPassword3" class="col-sm-2 col-form-label">Apellido</label>
            <div class="col-sm-10">
                <input value="${respuesta.apellido}" name="apellido" type="text" class="form-control">
            </div>
        </div>
    `
};


const header = new Headers({
    "Content-type": "application/json"
});

const post = async (user) => { //Con los datos recogidos del form se crea un objeto de tipo User que será 
    //procesado en el controllador (postUser) de la api, mediante una petición hecha a la url api/post
    const solicitud = await fetch(
        "http://localhost:8080/form/post", {
        method: "POST",
        headers: header,
        body: JSON.stringify(user)
    })

    const respuesta = await solicitud.json();
    return respuesta;
}