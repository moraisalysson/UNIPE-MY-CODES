import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable()
export class ServicesApiProvider {
  private API_URL = 'http://engenharia.clube.tur.br/api/';

  constructor(public http: HttpClient) {
   }

   get(id: number) {
     return new Promise((resolve, reject) => {
       let url = this.API_URL + 'categoriasdeproblemas' + id;

       this.http.get(url)
        .subscribe((result: any) => {
          resolve(result.json());
        },
        (error) => {
          reject(error.json());
        })
     });
   }

}
