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
  .then(function(existingRecipe) {
    if(existingRecipe) {
      res.status(200);
      res.json(existingRecipe);
    } else {
      res.status(404);
      res.json({message: 'Not Found'});
    }
  })
  .catch(function(err) {
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
  Recipe.populate('reviews')
  .exec()
  .then(function(createdReview) {
    Recipe.reviews = createdReview;
    return Recipe.create(recipe);
  })
  .then(function(createdRecipe) {
    res.status(201);
    res.json(createdRecipe);
  })
  .catch(function(err) {
    res.status(400);
    res.send(err);
  });


   //REMEMBER TO ADD A PICTURE
}
export function update(req, res) {
  var updatedRecipe;

  Recipe.findById(req.params.id)
  .populate('reviews')
  .exec()
  .then(function(existingRecipe) {
    if(existingRecipe) {
      existingRecipe.name = req.body.name;
      existingRecipe.description = req.body.description;
      existingRecipe.picture = req.body.picture;
      existingRecipe.prepTime = req.body.prepTime;
      existingRecipe.cookTime = req.body.cookTime;
      existingRecipe.directions = req.body.directions;
      existingRecipe.ingredients.listIngred = req.body.ingredients.listIngred;
      existingRecipe.reviews.description = req.body.reviews.description;
      existingRecipe.reviews.rating = req.body.reviews.rating;
      existingRecipe.reviews.userName = req.body.reviews.userName;

      updatedRecipe = existingRecipe;
      return Promise.all([
        existingRecipe.reviews.increment().save(),
        existingRecipe.increment().save()
      ]);
    } else {
      // res.status(404);
      return null;
    }
  })
  .then(function(savedObjects) {
    if(savedObjects) {
      res.status(200);
      res.json(updatedRecipe);
    } else {
      res.status(404);
      res.json({message: 'Not Found'});
    }
  })
  .catch(function(err) {
    res.status(400);
    res.send(err);
  });
}
export function destroy(req, res) {
  Recipe.findById(req.params.id)
    .populate('reviews')
    .exec()
    .then(function(existingRecipe) {
      if(existingRecipe) {
        return Promise.all([
          existingRecipe.reviews.remove(),
          existingRecipe.remove()
        ]);
      }
    })
    .then(function(deletedRecipe) {
      if(deletedRecipe) {
        res.status(404).send();
      } else {
        res.status(404);
        res.json({message: 'Not Found'});
      }
    })
    .catch(function(err) {
      res.status(400);
      res.send(err);
    });
}
