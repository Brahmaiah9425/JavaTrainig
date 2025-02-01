import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class DataService {

  constructor() { }

  getUsername(): string {
    return 'Student Dashboard ';  
  }

  getAchievements() {
    return [
      { 
        title: 'Top Performer', 
        description: 'Awarded for excellent performance in the last quarter', 
        date: '15/01/2025', 
        image: 'assets/Top.avif' 
      },
      { 
        title: 'Employee of the Month', 
        description: 'Recognized for consistent hard work', 
        date: '27/01/2025', 
        image: 'assets/Employee.jpg'  
      },
      { 
        title: 'Best Innovator', 
        description: 'Created a solution that increased team efficiency', 
        date: '26/01/2025', 
        image: 'assets/Innovator.webp'  
      }
    ];
  }
  
  getStudentData() {
    return [
      { name: 'Brahmaiah', subject: 'Java', marks: 95, email:'brahmaiah@gmail.com' },
      { name: 'Mahesh', subject: 'Python', marks: 88, email:'Mahesh@gmail.com' },
      { name: 'Ajith', subject: 'DBMS', marks: 92, email:'Ajith@gmail.com' }
    ];
  }

  getEmail(userName: string): string {
    const student = this.getStudentData().find(student => student.name.toLowerCase() === userName.toLowerCase());
    return student ? student.email : 'Email not found';
  }
}
