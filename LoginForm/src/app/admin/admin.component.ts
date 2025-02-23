import { Component } from '@angular/core';
import { LoginService } from '../login.service';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent {
  constructor(private loginService: LoginService) {}

  logout() {
    this.loginService.logout();
  }
}
