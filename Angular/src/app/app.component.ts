import { Component } from '@angular/core';
import { MaterialDemoComponent } from './material-demo/material-demo.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [MaterialDemoComponent], // Import MaterialDemoComponent here
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent {}
