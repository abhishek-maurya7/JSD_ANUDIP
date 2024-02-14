import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { AdminService } from '../admin.service';
import { response } from 'express';
import { error } from 'console';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrl: './admin.component.css'
})
export class AdminComponent {
  constructor(private adminService:AdminService) {}
  pets: any;

  ngOnInit() {
    this.adminService.showPets().subscribe(
      (response) => this.pets = response,
      (error) => console.log(error)
    )
  }
}
