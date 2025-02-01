import { Component, OnInit } from '@angular/core';
import { DataService } from '../shared/data.service';

@Component({
  selector: 'app-email',
  templateUrl: './email.component.html',
  styleUrls: ['./email.component.css']
})
export class EmailComponent implements OnInit {
  userName: string = '';  
  email: string = '';     

  constructor(private dataService: DataService) {}

  ngOnInit(): void {
   
    this.userName = '';
    this.email = this.dataService.getEmail(this.userName);  
  }

  
  updateEmail() {
    this.email = this.dataService.getEmail(this.userName);
  }
}
