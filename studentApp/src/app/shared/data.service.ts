import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root' 
})
export class DataService {

  constructor() { }

  
  getUsername(): string {
    return 'Brahmaiah';  
  }

  getAchievements() {
    return [
      { title: 'Top Performer', description: 'Awarded for excellent performance in the last quarter', date: '15/01/2025' },
      { title: 'Employee of the Month', description: 'Recognized for consistent hard work', date: '27/01/2025' },
      { title: 'Best Innovator', description: 'Created a solution that increased team efficiency', date: '26/01/2025' }
    ];
  }

  
  getStudentData() {
    return [
      { name: 'Brahmaiah', subject: 'java', marks: 95 },
      { name: 'Mahesh', subject: 'python', marks: 88 },
      { name: 'Ajith', subject: 'DBMS', marks: 92 }
    ];
  }

 
  getEmail(): string {
    return 'brahmaiah@gmail.com';  
  }
}
