import { Component } from '@angular/core';
import { UserLogin } from '../Entity/UserLogin';
import { UserServiceService } from '../user-service.service';
import { Router } from '@angular/router';
import { error } from 'console';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {
  constructor(private userService: UserServiceService, private router: Router) { }
  loginModel = new UserLogin("", "");
  posts: any;
  userLogin() {
    this.userService.userLogin(this.loginModel).subscribe(
      (response) => {
        ;
        this.posts = response;
        if (this.posts == "you are welcome") {
          this.router.navigate(['/userproduct']);
        }
      },
      (error) => alert(error)
    )
  }

  userSignUp() {
    this.userService.userSignUp(this.loginModel).subscribe(
      (response) => {
        this.posts = response;
        alert(this.posts); 
      },
      error => console.log(error)
    )
  }
}
