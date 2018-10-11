import { ChamadosPage } from './../chamados/chamados';
import { Component, ViewChild } from '@angular/core';
import { NavController, ToastController } from 'ionic-angular';

@Component({
  selector: 'page-home',
  templateUrl: 'home.html'
})
export class HomePage {

  @ViewChild('usuario') usuario;
  @ViewChild('senha') senha;

  constructor(public navCtrl: NavController,
              public toastCtrl: ToastController) {
  }

  entrar() {
    const toast = this.toastCtrl.create({duration: 3000, position: 'top'});;

    if(this.usuario.value == "admin" && this.senha.value == "admin123@") {
      
      this.navCtrl.push(ChamadosPage);
    
    } else {
    
        toast.setMessage('Usuário ou senha não encontrados.');
        toast.present();
    
      }
  }

}
