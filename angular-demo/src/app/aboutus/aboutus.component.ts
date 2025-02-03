import { Component } from '@angular/core';

@Component({
  selector: 'app-aboutus',
  templateUrl: './aboutus.component.html',
  styleUrls: ['./aboutus.component.css'],
  standalone: true
})
export class AboutusComponent {
  aboutMessage: string = 'This is about us page!';  // Define the missing property
}
