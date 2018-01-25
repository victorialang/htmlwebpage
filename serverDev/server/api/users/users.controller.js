let users = [];
import uuidv4 from 'uuid/v4';


export function index(req, res) {
  import User from './users.model';
  res.json(users);
}
export function show(req, res){
  import User from './users.model';
  for(var i = 0; i < users.length; i++){
    if(req.params.id == users[i].id){
      return res.send(users[i], 200);
    }
  }
  return res.send('{message: "Not Found"}', 404);
}
export function create(req, res) {
  import User from './users.model';
  let id = uuidv4();
  let name = req.body.name;
  let address = req.body.address;
  let age = req.body.age;
  var newUser = {id: id, name: name , address: address, age: age};
  users.push(newUser);
  res.status(201);
  res.send(newUser);
}
export function upsert(req, res) {
  import User from './users.model';
  for(var i = 0; i < users.length; i++){
    if(req.params.id == users[i].id){
      users[i].name = req.body.name;
      users[i].address = req.body.address;
      users[i].age = req.body.age;
      return res.status(200).send();
    }
  }
  var newUser = {
    import User from './users.model';
    id: req.params.id, name: req.body.name, address:req.body.address, age:req.body.age};    users.push(newUser);
  return res.send(newUser, 201);
}
export function destroy(req, res) {
  import User from './users.model';
  for(var i = 0; i < users.length; i++){
    if(req.params.id == users[i].id){
      users.splice(users[i].id, 1);
      res.status(204).send();
    }
  }
    return res.send('{message: "Not Found"}', 404);
}

// export function index(req, res) {
//   res.status()
// }
