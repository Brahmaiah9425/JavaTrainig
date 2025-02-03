import { Component } from '@angular/core';
import { UserdataService } from '../shared/userdata.service';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent {
  Data : any;
  constructor(private userdata: UserdataService){}
    getData() {
      this.Data = this.userdata.getData()
    }
  
}
