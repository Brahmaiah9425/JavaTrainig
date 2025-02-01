import { Injectable } from '@angular/core';
import { CanActivate, ActivatedRouteSnapshot, RouterStateSnapshot, Router } from '@angular/router';
import { LoginService } from './login.service'; 

@Injectable({
  providedIn: 'root' 
})
export class AuthGuard implements CanActivate {
  constructor(private loginService: LoginService, private router: Router) {}

  canActivate(route: ActivatedRouteSnapshot, state: RouterStateSnapshot): boolean {
    const role = this.loginService.getRole();
    const expectedRole = route.data['role'];

    if (role && role === expectedRole) {
      return true;
    }

    
    this.router.navigate(['/login']);
    return false;
  }
}
