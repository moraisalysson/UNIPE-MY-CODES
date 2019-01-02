import { HttpModule } from '@angular/http';

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

import { ServicesApiProvider } from '../providers/services-api/services-api';


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
    IonicModule.forRoot(MyApp),
    HttpModule
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
    {provide: ErrorHandler, useClass: IonicErrorHandler},
    ServicesApiProvider
  ]
})
export class AppModule {}
