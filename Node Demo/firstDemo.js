var name = "anil";
console.log(name);

var http = require('http');
var mylib = require('./exportDemo');
http.createServer(function(req,res){
    res.write("this is my first node js");
    res.write(mylib.myDate());
    res.end();
}).listen(4200);    