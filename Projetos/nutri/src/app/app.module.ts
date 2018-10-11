  import { BrowserModule } from '@angular/platform-browser';
import { ErrorHandler, NgModule } from '@angular/core';
import { IonicApp, IonicErrorHandler, IonicModule } from 'ionic-angular';
import { SplashScreen } from '@ionic-native/splash-screen';
import { StatusBar } from '@ionic-native/status-bar';

//pages
import { MyApp } from './app.component';
import { HomePage } from '../pages/home/home';
import { DicasPage  } from '../pages/dicas/dicas';
import { RegisterPage } from './../pages/register/register';
import { RecuperarPage } from './../pages/recuperar/recuperar';
import { ProfilePage } from './../pages/profile/profile';

//angularFireBase
import { AngularFireModule } from '@angular/fire';
import { AngularFireAuthModule } from 'angularfire2/auth'

const firebaseAuth = {
  apiKey: "AIzaSyCSERqGljCe9RdPwqKSeF5dhA2yXhRx9tI",
  authDomain: "nutri-a310e.firebaseapp.com",
  databaseURL: "https://nutri-a310e.firebaseio.com",
  projectId: "nutri-a310e",
  storageBucket: "nutri-a310e.appspot.com",
  messagingSenderId: "789308615874"
};

@NgModule({
  declarations: [
    MyApp,
    HomePage,
    DicasPage,
    RegisterPage,
    RecuperarPage,
    ProfilePage
  ],
  imports: [
    BrowserModule,
    IonicModule.forRoot(MyApp),
    AngularFireModule.initializeApp(firebaseAuth),
    AngularFireAuthModule
  ],
  bootstrap: [IonicApp],
  entryComponents: [
    MyApp,
    HomePage,
    DicasPage,
    RegisterPage,
    RecuperarPage,
    ProfilePage
  ],
  providers: [
    StatusBar,
    SplashScreen,
    {provide: ErrorHandler, useClass: IonicErrorHandler}
  ]
})
export class AppModule {}
