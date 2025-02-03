import { Injectable } from '@angular/core';
import { Router } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class LoginService {  
  constructor(private router: Router) {}

  login(username: string, password: string) {
    if (username === 'admin' && password === 'admin123') {
      localStorage.setItem('role', 'admin');
      return true;
    } else if (username === 'Brahmaiah' && password === 'Brahmaiah') {
      localStorage.setItem('role', 'user');
      return true;
    }
    return false;
  }

  logout() {
    localStorage.removeItem('role');
    this.router.navigate(['/login']);
  }

  getRole(): string | null {
    return localStorage.getItem('role');
  }

  isAuthenticated(): boolean {
    return localStorage.getItem('role') !== null;
  }
}
