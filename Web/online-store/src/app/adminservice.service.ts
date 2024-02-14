import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Product } from './Product';

@Injectable({
  providedIn: 'root'
})
export class AdminserviceService {

  constructor(private http:HttpClient) { }
  getProduct() {
    const url="http://localhost:8080/api/product/show";
    return this.http.get(url);
  }

  update(p:Product) {
    // console.log(p)
    const url = "http://localhost:8080/api/product/update/" + p.Id;
    const headers = new HttpHeaders({'Content-Type':'application/json'});
    return this.http.put(url, p, {headers});        
  }

  delete(id:number) {
    const url = "http://localhost:8080/api/product/delete/" + id;
    return this.http.delete(url);
  }

  create(p:Product) {
    const url = "http://localhost:8080/api/product/create"
    var headers = new HttpHeaders({'Content-Type':'application/json'});
    return this.http.post(url, p, {headers});
  }
}
