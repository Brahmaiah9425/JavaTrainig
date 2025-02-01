import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'  
})
export class DataServiceService {

  
  private users = [
    { email: 'brahmaiah@gmail.com', password: '9347949425', name: 'Brahmaiah' },
    { email: 'Mahesh@gmail.com', password: '8179256628', name: 'Mahesh' },
    { email: 'Ajay@gmail.com', password: '8500583858', name: 'Ajay' }
  ];

  constructor() { }

  
  user() {
    return this.users;
  }
}