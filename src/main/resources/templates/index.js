function loadHomeContent1() {
    let html = `
        <div class="col-9" id="list-product"></div>
        <div class="col-3" id="categories"></div>`;
    document.getElementById('content').innerHTML = html;
    loadListProduct1();
}

function loadListProduct1() {
    $.ajax({
        type: "GET",
        url: "http://localhost:8080/api/houses/list",
        success: function (nal) {
            console.log(nal);
            let html = `<div class="row p-3">`;
            for (let i = 0; i < nal.length; i++) {
                html += '<div class="col-4 product "><h2 onclick="showOne()">' + nal[i].name + '</h2></div>'
            }
            html += `</div>`;
            document.getElementById('list-product').innerHTML = html;
        }
    })
}
function showOne(){
    let html = `<div class="row p-3">`+`<p onclick="loadHomeContent1()">quay về</p>`;
    document.getElementById('list-product').innerHTML = html;
}
