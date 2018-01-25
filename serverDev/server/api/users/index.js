// var express = require('express');
// var controller = require(./users.controller);
//
// var router = express.Router();
//
// router.get('/test', controller.index);//:id
// export{router};
import express from 'express';
import * as controller from './users.controller';
let router = express.Router();

router.get('/', controller.index);
router.get('/:id', conroller.show);
router.post('/', controller.create);
router.put('/:id', controller.upsert);
router.delete('/:id', controller.destroy);
export {router};
