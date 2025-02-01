import { Injectable } from '@angular/core';
import { CanActivateChild, Router } from '@angular/router';
import { LoginService } from './login.service';

@Injectable({
  providedIn: 'root'
})
export class Admin1Guard implements CanActivateChild {
  constructor(private loginService: LoginService, private router: Router) {}

  canActivateChild(): boolean {
    if (this.loginService.getRole() === 'admin') {
      return true;
    } else {
      this.router.navigate(['/login']);
      return false;
    }
  }
}
