import { Component, ViewChild } from '@angular/core';
import { IonicPage, NavController, NavParams, ToastController } from 'ionic-angular';
import { AngularFireAuth } from 'angularfire2/auth';

@IonicPage()
@Component({
  selector: 'page-recuperar',
  templateUrl: 'recuperar.html',
})
export class RecuperarPage {

  @ViewChild('usuario') email;

  constructor(public navCtrl: NavController, 
              public navParams: NavParams,
              public toastCtrl: ToastController,
              public fire: AngularFireAuth) {
  }

  recuperar(){
    let toast = this.toastCtrl.create({duration: 2000, position: 'bottom'});

    this.fire.auth.sendPasswordResetEmail(this.email.value)
      .then(() => {
        toast.setMessage("Solicitação enviada para o seu e-mail.");
        toast.present();

        this.navCtrl.pop(); //volta para a página anterior
      })

      .catch((error: any) => {
        if(error.code == 'auth/invalid-email') {

          toast.setMessage('E-mail inválido.');

        } else if (error.code == 'auth/user-not-found') {

          toast.setMessage('Usuário não encontrado.');

        }
        toast.present();

      })
  }

}
