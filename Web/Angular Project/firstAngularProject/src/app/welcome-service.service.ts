import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class WelcomeServiceService {

  constructor() { }

  welcome() {
    console.log("Welcome Dude")
  }
}
