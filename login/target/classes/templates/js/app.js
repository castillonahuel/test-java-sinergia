let app = document.querySelector("#app");
fetch("https://www.dolarsi.com/api/api.php?type=valoresprincipales")
.then((response) => response.json())
.then((data) =>{
    console.log(data)
    const content = document.createElement("label")
    content.innerHTML = `<b> 1 USD$ = ${data[3].casa.venta} ARS$ </b>`
    app.append(content)
})