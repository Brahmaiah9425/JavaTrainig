import { Injectable } from '@angular/core';
interface User {
  name: string;
  age: number;
  email: string;
}

@Injectable({
  providedIn: 'root'
})
export class UserdataService {
  constructor() { }
  private Userdata: string = '';  
  private items: User[] = [      
    { name: 'Brahmaiah', age: 20, email: 'aa@gmail.com' },
    { name: 'Mahesh', age: 20, email: 'aa@gmail.com' },
    { name: 'Ajith', age: 20, email: 'aa@gmail.com' }
  ];
  getdata():string {
    
    console.log('I am Brahmaiah Thangedupalli')
    return 'Brahmaiah Thangedupalli';

  }
  setData(Username: any) {
    this.Userdata = Username;
  }
  getData() {
    return this.Userdata;
  }
  getItems(): User[] {
    return this.items;
  }
}