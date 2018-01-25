import uuidv4 from 'uuid/v4';

class User {
  users = [];

  find() {
    // Returns a list of all users
    for(var i=0; i < users.length; i++){
      console.log(user[i]);
    }
  }
  findById(userId) {
    // Find user by Id
    // Returns user, or null if not present
    for(var i = 0; i < users.length; i++){
      if(userId === users[i].id) {
        return users[i];
      }
    }
    return null;
  }
  create(user) {
    // Create a new user
    // Return created user
    // Generate the id and overwrite any id that may be present in user
    let id = uuidv();
    var user = {id: id, user.name, user.address, user.age};
    users.push(newUser);
    return newUser;
  }
  findOneAndUpdate(user) {
    // Find user and update
    // If user does not exist, create it using Id provided
    // Return true if user was updated, false if user was created
    for(var i = 0; i < users.length; i++){
      if(user.id === users[i].id) {
        users[i].name = user.name;
        users[i].address = user.address;
        users[i].age = user.age;
        return true;
      }
    }
    var newUser = {id: user.id, name: user.name, address: user.address, age: user.age};
    users.push(newUser);
    return false;
  }
  remove(user) {
    // Remove user if exists with the Id provided
    // Return true if removed
    // Return false if did user not exist
    for(var i=0; i < users.length; i++){
      if(user.id === users[i].id) {
        users.splice(users[i].id, 1);
        return true;
      }
    }
    return false;
  }
}
export default new User();
