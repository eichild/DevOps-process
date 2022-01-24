const express= require("express")
const app =express()

const port = 3000;

app.listen(port, () => {
    console.log("estamos escutando o app em http://localhost:"+port)
});

app.get("/foo", function (req, res){
    res.send("HELLO FUCKING WORLD")
});