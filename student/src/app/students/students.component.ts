import { Component, OnInit } from '@angular/core';
import { DataService } from '../shared/data.service';

@Component({
  selector: 'app-students',
  templateUrl: './students.component.html',
  styleUrls: ['./students.component.css']
})
export class StudentsComponent implements OnInit {
  students: any[] = [];
  filteredStudents: any[] = [];
  searchText: string = '';

  constructor(private dataService: DataService) {}

  ngOnInit(): void {
    this.students = this.dataService.getStudentData();  
    this.filteredStudents = [...this.students];
  }

  searchStudents(): void {
    this.filteredStudents = this.students.filter(student =>
      student.name.toLowerCase().includes(this.searchText.toLowerCase())
    );
  }
}
