import { Component } from '@angular/core';

@Component({
  selector: 'app-welcome',
  templateUrl: './welcome.component.html',
  styleUrls: ['./welcome.component.css'],
  standalone: true
})
export class WelcomeComponent {
  message: string = 'Welcome to our website!';  // Define the missing property
}
