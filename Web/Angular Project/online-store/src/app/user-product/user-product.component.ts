import { Component } from '@angular/core';
import { UserServiceService } from '../user-service.service';
import { Cart } from '../Entity/Cart';
import { Customer } from '../Entity/Customer';
import { Router } from '@angular/router';
import { error } from 'console';

@Component({
  selector: 'app-user-product',
  templateUrl: './user-product.component.html',
  styleUrl: './user-product.component.css'
})
export class UserProductComponent {
  constructor(private userService: UserServiceService, private router: Router) {

  }
  posts: any;

  ngOnInit() {
    this.userService.getProduct().subscribe(
      (response) => this.posts = response,
      (error) => console.log(error)
    )
  }

  cart1: Cart[] = new Array();
  qty:any;
  total:number = 0;
  addToCart(id: number, name: string, price: number) {
    this.cart1.push(new Cart(name, price, id, this.qty, price * this.qty));
    this.total = 0;
    
    for(let i of this.cart1) {
      console.log(this.total)
      this.total += i.total;
    }
  }

  message:any;
  cust = new Customer("Abhishek", 9372113224, this.cart1)
  order() {
    this.userService.placeOrder(this.cust).subscribe(
      (response) => {this.message = response;
        if(this.message.indexOf("your order has been placed successfully") != -1) {
          this.router.navigate(['/successful']);
        } else {
          document.write(this.message);
        }
      },
      (error) => console.log(error)
    ) 
  }
}
