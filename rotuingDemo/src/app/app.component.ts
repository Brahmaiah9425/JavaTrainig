import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'angular-material';

  constructor(private router: Router) {}

  login() {
    localStorage.setItem('user1', "loggedin");
    alert("Logged in!");
    this.router.navigate(['/about-us']); 
  }

  logout() {
    localStorage.removeItem('user1');
    alert("Logged out!");
    this.router.navigate(['/']); 
  }
}
