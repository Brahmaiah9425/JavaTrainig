import { Component } from '@angular/core';
import { Person } from './person';
import { CommonModule } from '@angular/common';
 
@Component({
  selector: 'app-person',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './person.component.html',
 
})
export class PersonComponent {
  persons :Person[]=[{id:1,name:'aaa',age:20},
    {id:2,name:'bbb',age:30},
    {id:3, name:'ccc',age:40},
  ]
 
}