import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-pipe',  // The component's selector
  standalone: true,      // Marked as standalone component
  imports: [CommonModule],  // Import necessary modules like CommonModule
  template: `
    <p>{{amount | currency:'USD'}}</p>
    <h1>{{msg | uppercase}}</h1>
    <mark>{{percentage | number: '1.0-2'}}</mark>
    <p>{{percentage | number: '3.0-3'}}</p>
  `
})
export class PipeComponent {
  amount: number = 1000;
  msg: string = "Brahmaiah";
  percentage: number = 8 / 3;
}
