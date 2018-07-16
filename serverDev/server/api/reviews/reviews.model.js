import mongoose from 'mongoose';
let Schema = mongoose.schema;

let reviewSchema = Schema({
  description: {type: String, required: true},
  rating: {type: Number, required: true},
  //created: {SET BY SERVER},
  userName: {type: String, required: true}
});

let Reviews = mongoose.model('Reviews', reviewSchema);

export {Reviews};
