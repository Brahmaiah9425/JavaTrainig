import { Component,EventEmitter,Input, Output } from '@angular/core';
 
@Component({
  selector: 'app-child',
  standalone: true,
  imports: [],
 template:`<p>this is my child Component</p>
 
 <p> Message from Parent:{{message}}</p>
 
 <button (click)="sendData()">send data to parent</button>`
})
export class ChildComponent {
@Input() message!:string;
 @Output() dataSent=new EventEmitter<string>();
 sendData()
 {
  this.dataSent.emit('Child:Hello how are you ');
 }
}