import { AngularFireAuth } from 'angularfire2/auth';
import { Component, ViewChild } from '@angular/core';
import { IonicPage, NavController, NavParams, ToastController } from 'ionic-angular';
import { DicasPage } from '../dicas/dicas';

@IonicPage()
@Component({
  selector: 'page-register',
  templateUrl: 'register.html',
})
 
export class RegisterPage {

  @ViewChild('usuario') email;
  @ViewChild('senha') password;  

  constructor(public navCtrl: NavController, 
            public navParams: NavParams,
            public fire: AngularFireAuth,
            public toastCtrl: ToastController) {
  }

  registrar() {
    let toast = this.toastCtrl.create({duration: 2000, position: 'bottom'});

    this.fire.auth.createUserAndRetrieveDataWithEmailAndPassword(this.email.value, this.password.value)
      .then(data => {
        
        toast.setMessage('Usuário criado com sucesso!');
        toast.present();
        
        console.log('aqui temos a data: ', data);

        this.navCtrl.setRoot(DicasPage);

      })
      .catch((error: any) => {
        if(error.code == 'auth/email.already-in-use') {

          toast.setMessage('O e-mail digitado já está em uso.');
        
        } else if (error.code == 'auth/invalid-email') {

          toast.setMessage('O e-mail digitado não é válido.');
        
        } else if(error.code == 'auth/operation-not-allowed') {

          toast.setMessage('Não habilitado para criar novos usuários.');

        } else if(error.code == 'auth/weak-password') {
          
          toast.setMessage('Ei, essa senha está muito fraca.');

        }

        toast.present();
      });
  }

}
