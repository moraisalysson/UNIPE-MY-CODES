import { AngularFireAuth } from 'angularfire2/auth';
import { Component } from '@angular/core';
import { Platform } from 'ionic-angular';
import { StatusBar } from '@ionic-native/status-bar';
import { SplashScreen } from '@ionic-native/splash-screen';

import { HomePage } from '../pages/home/home';
import { DicasPage } from '../pages/dicas/dicas';
@Component({
  templateUrl: 'app.html'
})
export class MyApp {
  rootPage:any;

  constructor(platform: Platform, 
              statusBar: StatusBar, 
              splashScreen: SplashScreen, 
              afAuth: AngularFireAuth) {
    
    const authObserver = afAuth.authState.subscribe(users => {
      if(users) { //se existir usuário, vai para DicasPage
        this.rootPage = DicasPage;
        authObserver.unsubscribe();
      
      } else { //se não, volta para a página de login (HomePage)
        this.rootPage = HomePage;
        authObserver.unsubscribe();
      }

    })

    platform.ready().then(() => {
      // Okay, so the platform is ready and our plugins are available.
      // Here you can do any higher level native things you might need.
      statusBar.styleDefault();
      splashScreen.hide();
    });
  }
}

