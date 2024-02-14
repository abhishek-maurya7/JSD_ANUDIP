import { Component } from '@angular/core';
import { hero } from '../hero';
import { WelcomeServiceService } from '../welcome-service.service';

@Component({
  selector: 'app-c1',
  templateUrl: './c1.component.html',
  styleUrl: './c1.component.css'
})
export class C1Component {
  constructor(private http:WelcomeServiceService) {}
  ngOnInit() {
    this.http.welcome();
  }
  title = "I am/was the title";
  imageUrl = "assets/wallpaperflare.com_wallpaper (12).jpg";
  fruits = ["Apple", "Mango", "Banaaaanaaa", "Cherry"];
  greeting = "ljklkdhf8 F7";
  day = "0";
  todaydate = new Date();
  jsonObj = {
    "name": "abhishek",
    "age": 22
  }

  model = new hero("ABCD XYZ", 99);

  updatePage() {
    this.title = "Bye Bye";
  }

  onSubmit2() {

  }
}
