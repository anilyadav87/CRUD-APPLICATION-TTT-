var num;
var http = require('http');
var url;
http.createServer(function (req,res)
{
    res.writeHead(400,'text/html');
res.write(req.url);

    res.end();
}).listen(4230);