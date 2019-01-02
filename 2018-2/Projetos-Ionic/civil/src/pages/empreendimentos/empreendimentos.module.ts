import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { EmpreendimentosPage } from './empreendimentos';

@NgModule({
  declarations: [
    EmpreendimentosPage,
  ],
  imports: [
    IonicPageModule.forChild(EmpreendimentosPage),
  ],
})
export class EmpreendimentosPageModule {}
