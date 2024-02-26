import { Component } from '@angular/core';
import { AdminserviceService } from '../adminservice.service';
import { Product } from '../Product';
import { response } from 'express';

@Component({
  selector: 'app-adminproduct',
  templateUrl: './adminproduct.component.html',
  styleUrl: './adminproduct.component.css'
})

export class AdminproductComponent {
  constructor(private httpService: AdminserviceService) { }
  posts: any;
  model: any;

  ngOnInit() {
    this.httpService.getProduct().subscribe(
      (response) => {
        this.posts = response;
        console.log(this.posts);
      },
      (error) => {
        console.log(error)
      }
    );
  }
  update(id:number, name:string, stk:number, price:number){
    this.model = new Product(id, name, stk, price);
    this.httpService.update(this.model).subscribe(
      (response) => {this.posts = response}
    )
    window.location.reload()
  }

  delete(id:number) {
    this.httpService.delete(id).subscribe(
      (response) => {this.posts = response}
    )
    window.location.reload()
  }

  model2 = new Product(1, "New Item", 352, 100)
  create() {
    console.log(this.model2)
    this.httpService.create(this.model2).subscribe(
      (response) => console.log(response)
    )
    window.location.reload();
  }
}
