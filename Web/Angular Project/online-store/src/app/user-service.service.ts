import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Customer } from './Entity/Customer';
import { UserLogin } from './Entity/UserLogin';

@Injectable({
  providedIn: 'root'
})
export class UserServiceService {

  constructor(private http:HttpClient) { }

  getProduct() {
    const url="http://localhost:8080/api/product/show";
    return this.http.get(url);
  }

  placeOrder(cust:Customer) {
    const url = "http://localhost:8080/api/product/orderproduct"
    const headers = new HttpHeaders({'Content-Type':'application/json', responseType: 'text'});
    return this.http.post(url, cust, {headers, 'responseType':'text'})
  }

  userLogin(loginModel:UserLogin) {
    const url = "http://localhost:8080/api/userlogin/search/"+loginModel.email+"/"+loginModel.password;
    const headers = new HttpHeaders({'Content-Type':'application/json'});
    return this.http.get(url, {headers, responseType: 'text'});
  }

  userSignUp(loginModel:UserLogin) {
    const url = "http://localhost:8080/api/userlogin/signup";
    const headers = new HttpHeaders({'Content-Type':'application/json'});
    return this.http.post(url, loginModel, {headers, responseType: 'text'});
  }
}
