var express = require('express')
var app=express()
const book={
    'isbn':101,
    'name':'spring',
    'cost':1200,
    'author':'pankaj kumar'
};
app.get("/",(req,resp)=>{
    resp.writeHead(200,{'Content-Type':'text/html'})
    resp.write('<h1> hello world</h1>')
    resp.write('<h2> hii</h2>');
    resp.end();
});
app.get("/book",(req,resp)=>{
    resp.json(book);
});
app.listen(5051);