import mongoose from 'mongoose';
let Schema = mongoose.Schema;

let ingredientSchema = Schema ({
  listIngred: {type: [String], required: true}
});

let recipeSchema = Schema ({
  name: {type: String, required: true},
  description: {type: String, required: true},
  picture: {type: String, required: true},
  prepTime: {type: Number, required: true},
  cookTime: {type: Number, required: true},
  directions: {type: [String], required: true},
  ingredients: ingredientSchema,
  reviews: {type: [Schema.Types.OjectId], ref: 'Reviews'}
});

let recipeSchema = mongoose.model('Recipe', recipeSchema);

export {Recipe};
