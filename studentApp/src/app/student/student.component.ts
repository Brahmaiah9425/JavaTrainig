import { Component, OnInit } from '@angular/core';
import { DataService } from '../shared/data.service';

@Component({
  selector: 'app-student', 
  templateUrl: './student.component.html', 
  styleUrls: ['./student.component.css'] 
})
export class StudentComponent implements OnInit {
  username: string = '';
  achievements: any[] = [];
  students: any[] = [];
  email: string = '';

  displayUsername: string = '';
  displayAchievements: any[] = [];
  displayStudents: any[] = [];
  displayEmail: string = '';

  constructor(private dataService: DataService) {}

  ngOnInit(): void {
    this.username = this.dataService.getUsername();
    this.achievements = this.dataService.getAchievements();
    this.students = this.dataService.getStudentData();
    this.email = this.dataService.getEmail();
  }

  showUsername(): void {
    this.displayUsername = this.username;
  }

  showAchievements(): void {
    this.displayAchievements = this.achievements;
  }

  showStudents(): void {
    this.displayStudents = this.students;
  }

  showEmail(): void {
    this.displayEmail = this.email;
  }
}
