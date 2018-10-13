import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams } from 'ionic-angular';

import { ChamadosPage } from './../chamados/chamados';
import { EmpreendimentosPage } from '../empreendimentos/empreendimentos';

@IonicPage()
@Component({
  selector: 'page-problemas',
  templateUrl: 'problemas.html',
})
export class ProblemasPage {

  lista_categorias: Array<any>;

  constructor(public navCtrl: NavController, 
              public navParams: NavParams) {
    this.lista_categorias = [
                            {nome: 'Hidráulico', data: '16/10/2018'},
                            {nome: 'Elétrico', data: '20/10/2018'}
                          ];
   
  }

  chamadoPage() {
    this.navCtrl.push(ChamadosPage);
  }

  empreendPage() {
    this.navCtrl.push(EmpreendimentosPage);
  }

}
