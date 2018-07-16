import angular from 'angular';
const ngRoute = require('angular-route');
import routing from './userDetails.routes';



export class UserDetailsController {
  /*@ngInject*/
  constructor($routeParams, User) {
    this.User = User;
    this.$routeParams = $routeParams;
    this.getUserData();
  }

  getUserData() {
    this.User.getUserById(this.$routeParams.id)
      .then(response => {
        this.user = response;
      })
      .catch(error => {
        console.error(error);
      });
  }

  $onInit() {

  }
}

export default angular.module('comp3705App.userDetail', [ngRoute])
  .config(routing)
  .component('userDetail', {
    template: require('./userDetails.html'),
    controller: UserDetailsController,
    controllerAs: 'userDetailsController'
  })
  .name;
