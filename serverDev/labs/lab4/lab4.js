export class lab4 {
  syncFileRead(file){
    var fs = require("fs");
    var data = fs.readFileSync(file);
    return data.toString();
  }
  asyncFileRead(file, callback){
    var fs = require("fs");
    fs.readFile(file,(err, data)=>{
      if(err) {
        console.error(err);
      }
      return callback(data.toString());
    })
  }
  compressFileStream(input, output) {
    var fs = require("fs");
    var zlib = require("zlib");
    return (fs.createReadStream(input).pipe(zlib.createGzip()).pipe(fs.createWriteStream(output)));
  }
  decompressFileStream(input, output) {
    var fs = require("fs");
    var zlib = require("zlib");
    return (fs.createReadStream(input).pipe(zlib.createGunzip()).pipe(fs.createWriteStream(output)));
  }
  listDirectoryContents(directory, callback){
    var fs = require("fs");
    var buf = new Buffer(1024);
    fs.readdir(directory, (err, files)=>{
      if(err) {
        console.error(err);
      }
      files.forEach(function(file){
        return console.log(file);
      })
    })
  };
}

// return fs.listDirectoryContents(directory,callback);

// fs.readFile(input, (err,data)=>{
//   if(err) {
//     console.error(err);
//   }
//   var info =
// })
// files.forEach(function(file){
//     return callback(files.toString());
// });
// for(var i = 0; i < directory.length; i++) {
//   return callback(files.toString());
// }
