import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'firstAngularProject';
  CurrentItem = "asduhdfhuasdufagus";

  items = ["asugf", "ajhdf", "oiashddfui"]
  additem(newitem:string) {
    this.items.push(newitem);
  }
}
