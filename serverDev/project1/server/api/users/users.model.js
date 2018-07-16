import mongoose from 'mongoose';
let Schema = mongoose.Schema;

let nameSchema = Schema ({
  firstName: {type: String, required: true},
  middleName: {type: String, required: false},
  lastName: {type: String, required: true}
});

let userSchema = Schema ({
  fullName: nameSchema,
  username: {type: String, required: true},
  email: {type: String, required: true};
})


// schema.path('email')
