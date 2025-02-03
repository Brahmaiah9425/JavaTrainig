import { Component,Input } from '@angular/core';
import { ChildComponent } from '../child/child.component';
@Component({
  selector: 'app-parent',
  standalone: true,
  imports: [ChildComponent],
  template:`<h1> this is my Parent component.</h1>
  <!-- <app-child [message]="'Hello from parent'"></app-child> -->
  <app-child (dataSent)="funCall($event)"></app-child>`
 
})
export class ParentComponent {
  funCall(data:string){
    console.log(data);
  }
 
}