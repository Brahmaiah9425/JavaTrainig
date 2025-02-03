import { Component } from '@angular/core';
import { LoginService } from '../login.service';  

@Component({
  selector: 'app-user',
  template: `<h2>Hello Brahmaiah!</h2> <button (click)="logout()">Logout</button>`,
})
export class UserComponent {
  constructor(private loginService: LoginService) {}  

  logout() {
    this.loginService.logout();  
  }
}
