import { BrowserModule } from '@angular/platform-browser';
import { ErrorHandler, NgModule } from '@angular/core';
import { IonicApp, IonicErrorHandler, IonicModule } from 'ionic-angular';
import { SplashScreen } from '@ionic-native/splash-screen';
import { StatusBar } from '@ionic-native/status-bar';

import { MyApp } from './app.component';
import { HomePage } from '../pages/home/home';
import { EmpreendimentosPage } from '../pages/empreendimentos/empreendimentos';
import { ProblemasPage } from './../pages/problemas/problemas';
import { ChamadosPage } from './../pages/chamados/chamados';

@NgModule({
  declarations: [
    MyApp,
    HomePage,
    ChamadosPage,
    ProblemasPage,
    EmpreendimentosPage
  ],
  imports: [
    BrowserModule,
    IonicModule.forRoot(MyApp)
  ],
  bootstrap: [IonicApp],
  entryComponents: [
    MyApp,
    HomePage,
    ChamadosPage,
    ProblemasPage,
    EmpreendimentosPage
  ],
  providers: [
    StatusBar,
    SplashScreen,
    {provide: ErrorHandler, useClass: IonicErrorHandler}
  ]
})
export class AppModule {}
