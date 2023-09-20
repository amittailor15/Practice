var emp=require('./data/employee.js')
var exp=require('express')
var app=exp();
app.use(exp.json());

app.get("/",(req,resp)=>{
    resp.write("hello")
    resp.end();
});

app.get("/employee",(req,resp)=>{
    resp.json(emp);
});

app.get("/employee/:id",(req,resp)=>{
    if(!req.params.id || isNaN(req.params.id))
    {
        return resp.status(404).send("invalid id");
    }

    var a = emp.find((a)=>{
        return a.id===parseInt(req.params.id)
    })

    if(!a)
    {
        resp.status(404).send('employee not found with id:' + req.params.id);
    }
    else
    {
        return resp.status(201).send('found');
    }
});

app.post("/employee/add",(req,resp)=>
{
    console.log("post method");
    const newemp={
        id:req.body.id,
        name:req.body.name,
        salary:req.body.salary,
        dob:req.body.dob,
    }
    if(!newemp.id)
    {
        resp.status(404).send('add the id');
    }
    else if(!newemp.name)
    {
        resp.status(404).send('add the name');
    }
    else if(!newemp.salary)
    {
        resp.status(404).send('add the salary');
    }
    else if(!newemp.dob)
    {
        resp.status(404).send('add the emp');
    }

emp.push(newemp);
resp.send(newemp);
});

app.listen(4000);