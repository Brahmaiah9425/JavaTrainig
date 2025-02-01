import { Component } from '@angular/core';
import { UserdataService } from './shared/userdata.service';
import { concatAll } from 'rxjs';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Service';
  message?: string;
  Username: any;
  Data:any;
  items: any[] = [];

  constructor(private userdata: UserdataService) {}

  show() {
    this.message = this.userdata.getdata(); 
  }
  setData() {
    this.userdata.setData(this.Username)
  }
  ngOnInit() {
    
    this.items = this.userdata.getItems();
  
  }
}

