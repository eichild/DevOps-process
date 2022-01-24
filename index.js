const express= require("express")
const app =express()

const port = 3000;
const host = '0.0.0.0';

app.get("/", function (req, res){
    res.send("HELLO FUCKING WORLD yuu")
});

app.listen(port, host);