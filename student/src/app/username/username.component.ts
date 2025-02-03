import { Component, OnInit } from '@angular/core';
import { DataService } from '../shared/data.service';

@Component({
  selector: 'app-username',
  templateUrl: './username.component.html',
  styleUrls: ['./username.component.css']
})
export class UsernameComponent implements OnInit {
  username: string = '';

  constructor(private dataService: DataService) {}

  ngOnInit(): void {
    this.username = this.dataService.getUsername();  
  }
}
