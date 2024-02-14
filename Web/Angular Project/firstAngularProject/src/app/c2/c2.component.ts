import { Component } from '@angular/core';
import { RouterModule } from '@angular/router';
import { WelcomeServiceService } from '../welcome-service.service';

@Component({
  selector: 'app-c2',
  templateUrl: './c2.component.html',
  styleUrl: './c2.component.css'
})

export class C2Component {
  constructor(private http:WelcomeServiceService) {}
  ngOnInit() {
    this.http.welcome();
  }
}
