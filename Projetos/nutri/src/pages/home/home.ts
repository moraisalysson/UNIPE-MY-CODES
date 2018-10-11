import { Component, ViewChild } from '@angular/core';
import { NavController, ToastController } from 'ionic-angular';
//pages
import { DicasPage } from '../dicas/dicas';
import { RegisterPage } from '../register/register';
import { RecuperarPage } from './../recuperar/recuperar';
//angularFire
import { AngularFireAuth } from 'angularfire2/auth';
import firebase from 'firebase';

import { Users } from './users';

@Component({
  selector: 'page-home',
  templateUrl: 'home.html'
})

export class HomePage {

  users: Users = new Users();

  @ViewChild('usuario') email;
  @ViewChild('senha') password; 

  constructor(public navCtrl: NavController,
              public toastCtrl: ToastController,
              public fire: AngularFireAuth) {

  }

  entrar() {
    let toast = this.toastCtrl.create({duration: 3000, position: 'bottom'});

    this.fire.auth.signInWithEmailAndPassword(this.email.value, this.password.value)
    .then(data => {

      console.log('data do login: ', data);

      this.users.email = this.email.value;
      this.users.senha = this.password.value;

      this.navCtrl.setRoot(DicasPage);

    })

    .catch((error: any) => {
      if(error.code == 'auth/invalid-email') {

        toast.setMessage('O e-mail digitado não é válido.');
      
      } else if(error.code == 'auth/user-disabled') {

        toast.setMessage('Esse usuário foi desabilitado.');

      } else if(error.code == 'auth/user-not-found') {
        
        toast.setMessage('Usuário não encontrado.');

      } else if(error.code == 'auth/wrong-password') {
       
        toast.setMessage('Senha errada.');
      
      }
      toast.present();
    });
  }

  cadastrar() {
    this.navCtrl.push(RegisterPage);
  }

  recuperar() {
    this.navCtrl.push(RecuperarPage);
  }
  
  loginFacebook() {
    this.fire.auth.signInWithPopup(new firebase.auth.FacebookAuthProvider())
      .then( res => {
        
        //console.log(res);
        this.navCtrl.setRoot(DicasPage);

      })
  }
}
