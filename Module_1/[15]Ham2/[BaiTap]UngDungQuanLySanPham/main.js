let array = []
function addProduct(){
myArray = document.getElementById("newProduct").value
array.push(myArray)
display();
clear();
}  
function display(){
    table = ` <tr> 
        <th>
            Product Name
        </th>
        <th>
            <Chức năng>
        </th>
        </tr>`
        for( let i = 0 ; i < array.length ; i++){
            table += `<tr> 
        <th>
            ${array[i]}
        </th>
        <th>
            <button onclick = "removeProduct(${i})">Xóa</button>
            <button onclick = "editProduct(${i})">Sửa</button>
        </th>
        </tr>`
        }
        document.getElementById('table').innerHTML = table
}
function clear(){
   document.getElementById("newProduct").value = ""
}
function editProduct(index){
       array[index] = prompt("bạn muốn thay đổi sản phẩm là gì")
       display();
}
function removeProduct(index){    
            array.splice(index,1)
            display()
    }  