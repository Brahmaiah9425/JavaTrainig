import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { DataServiceService } from '../services/data-service.service'; 

@Component({
  selector: 'app-form-demo',
  standalone: true,
  imports: [FormsModule, CommonModule],
  templateUrl: './form-demo.component.html',
  styleUrls: ['./form-demo.component.css']
})
export class FormDemoComponent {
  emailid: string = "";
  pass: string = "";
  users: any[] = [];
  showMenu: boolean = false;
  menuX: number = 0;
  menuY: number = 0;

  constructor(private data: DataServiceService) {
    this.users = this.data.user();
  }

  userLogin() {
    for (let user of this.users) {
      if (this.emailid === user.email && this.pass === user.password) {
        console.log("Hello, " + user.name);
        return;
      }
    }
    console.log("Invalid email or password");
  }

  
  onRightClick(event: MouseEvent) {
    event.preventDefault();
    this.showMenu = true;
    this.menuX = event.clientX;
    this.menuY = event.clientY;
  }

  onMenuClick(option: string) {
    console.log(`You selected ${option}`);
    this.showMenu = false;
  }

  onDocumentClick() {
    this.showMenu = false;
  }
}
