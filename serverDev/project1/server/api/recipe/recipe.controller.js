'use strict';

import {Recipe} from './recipe.model';
export function index(req, res) {
  Recipe.find()
  .exec()
  .then(function(recipe) {
    res.status(200);
    res.json(recipe);
  })
  .catch(function(err) {
    res.status(500);
    res.send(err);
  });
}
export function show(req, res) {
  Recipe.findById(req.params.id)
  .exec()
  .then(function(existingRecipe){
    if(existingRecipe){
      res.status(200);
      res.json(existingRecipe);
    } else {
      res.status(404);
      res.json({message: 'Not Found'});
    }
  })
  .catch(function(err){
    res.status(400);
    res.send(err);
  });
}
export function create(req, res) {
  // let name = req.body.name;
  // let description = req.body.description;
  // let prepTime = req.body.prepTime;
  // let cookTime = req.body.cookTime;
  // let directions = req.body.directions;
  let recipe = req.body;
  Recipe.findById(req.body.id){

  }
  //REMEMBER TO ADD A PICTURE


}
export function update(req, res) {

}
export function delete(req, res){

}
