import angular from 'angular';

export class ModalController {
  /*@ngInject*/
  constructor($uibModalInstance, User, user) {
    this.User = User;
    this.$uibModalInstance = $uibModalInstance;
    this.user = user;
  }

  cancel() {
    this.$uibModalInstance.dismiss('cancel');
  }
  submitForm() {
    this.User.create(this.user)
    .then(result => {
      this.formInfo = 'User successfully created!';
    })
    .catch(err =>{
      console.error(err);
      this.formError = err.toString();
    })
  }
}

export default angular.module('comp3705App.modal', [])
  .controller('ModalController', ModalController)
  .config(['$qProvider', function($qProvider) {
    $qProvider.errorOnUnhandledRejections(false);
  }])
  .name;
