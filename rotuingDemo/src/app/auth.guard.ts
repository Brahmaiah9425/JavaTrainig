import { CanActivateFn } from '@angular/router';

export const authGuard: CanActivateFn = () => {
  const isAuthenticated = !!localStorage.getItem('user1'); 
  if (!isAuthenticated) {
    alert('Access Denied! You must log in.');
    return false; 
  }
  return true; 
};
