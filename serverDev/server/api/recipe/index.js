import express from 'express';
import * as controller from './recipe.controller';

let router = express.Router();

router.get('/', controller.index);
router.post('/', controller.create);

export {router};
