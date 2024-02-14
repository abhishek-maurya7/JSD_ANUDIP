import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AdminService {

  constructor(private http:HttpClient) { }

  showPets() {
    const url = "http://localhost:8080/showPets";
    return this.http.get(url);
  }
}
