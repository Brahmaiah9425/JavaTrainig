import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { LoginService } from '../login.service';  

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  username = '';
  password = '';

  constructor(private loginService: LoginService, private router: Router) {}

  login() {
    if (this.loginService.login(this.username, this.password)) {
      const role = this.loginService.getRole();
      if (role === 'admin') {
        this.router.navigate(['/admin']);
      } else if (role === 'user') {
        this.router.navigate(['/user']);
      }
    } else {
      alert('Invalid credentials');
    }
  }
}
