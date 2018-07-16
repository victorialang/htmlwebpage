import angular from 'angular';
const ngRoute = require('angular-route');
import routing from './main.routes';
const uiBootstrap = require('angular-ui-bootstrap');
import user from '../../components/userService/user.module';

export class MainController {
  /*@ngInject*/
  constructor($http, $uibModal, User) {
    this.$http = $http;
    this.User = User;
    this.$uibModal = $uibModal;
    this.setData();
    this.getUserData();
    this.alerts = [ ];
  }

  setData() {
    this.values = ['first', 'second', 'third'];
    this.valueToSquare = 4;
  }

  getUserData() {
    this.User.getAllUsers()
      .then(response => {
        this.users = response;
      })
      .catch(error => {
        console.error(error);
      });
  }

  createUser() {
    this.$uibModal.open({
      template: require('../../components/newUserModal/newUser.html'),
      controller: 'newUserController as newUserController',
    });
  }

  updateUser(user) {
    this.$uibModal.open({
      template: require('../../components/updateUserModal/updateUserModal.html'),
      controller: 'updateUserController as updateUserController',
      resolve: {
        user: () => user
      }
    });
  }

  addAlert() {
    this.alerts.push({msg: 'Alert!!!!!!'});
  }
  carosel(){
    var slides = this.sildes =[];
    var currIndex = 0;

  }


  $onInit() {
  }
}

export function SquareFilter() {
  var squareFunction = function(value) {
    return value * value;
  }
  return squareFunction;
}

export default angular.module('comp3705App.main', [ngRoute, uiBootstrap, user])
  .config(routing)
  .filter('Square', SquareFilter)
  .component('main', {
    template: require('./main.html'),
    controller: MainController,
    controllerAs: 'mainController'
  })
  .name;
