import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-about-us',
  templateUrl: './about-us.component.html',
  styleUrls: ['./about-us.component.css'],
  standalone:true,
  imports: [CommonModule]
})
export class AboutUsComponent {
  constructor() {}
}
